package ke.ac.mku.authcore.data.api

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.ResponseBody
import retrofit2.Response
import java.util.regex.Pattern
import javax.inject.Inject

class WebFormLoginHandler @Inject constructor(
    private val authApiService: AuthApiService
) {
    companion object {
        private const val TAG = "WebFormLoginHandler"

        // Student Portal Patterns
        private val VIEWSTATE_PATTERN = Pattern.compile("""id="__VIEWSTATE" value="([^"]*)"""")
        private val VIEWSTATE_GENERATOR_PATTERN = Pattern.compile("""id="__VIEWSTATEGENERATOR" value="([^"]*)"""")
        private val EVENTVALIDATION_PATTERN = Pattern.compile("""id="__EVENTVALIDATION" value="([^"]*)"""")
        private val LOGIN_ERROR_PATTERN = Pattern.compile("""class="failureNotification"[^>]*>([^<]*)""", Pattern.CASE_INSENSITIVE)

        // VLMS Patterns
        private val LOGIN_TOKEN_PATTERN = Pattern.compile("""name="logintoken" value="([^"]*)"""")
        private val MOODLE_ERROR_PATTERN = Pattern.compile("""(alert-danger|loginerrormessage)[^>]*>([^<]*)""", Pattern.CASE_INSENSITIVE)
        
        // Success Markers (More specific to avoid matching translation strings)
        private val MOODLE_SUCCESS_PATTERN = Pattern.compile("""id="action-menu-toggle-1"|class="userpicture"|href="[^"]*login/logout.php"""", Pattern.CASE_INSENSITIVE)
        private val ASPNET_SUCCESS_PATTERN = Pattern.compile("""href="[^"]*Logout.aspx"|id="ctl00_btnLogOut"""", Pattern.CASE_INSENSITIVE)
        
        private const val STUDENT_PORTAL_URL = "https://login.mku.ac.ke/"
        private const val VLMS_PORTAL_URL = "https://vlms.mku.ac.ke/login/index.php"
    }

    data class LoginResponse(
        val isSuccess: Boolean,
        val cookies: Map<String, String>,
        val errorMessage: String?
    )

    suspend fun executeLogin(
        regNumber: String,
        password: String,
        portalType: String = "student"
    ): LoginResponse = withContext(Dispatchers.IO) {
        val targetUrl = if (portalType == "vlms") VLMS_PORTAL_URL else STUDENT_PORTAL_URL
        Log.i(TAG, "Executing login for $portalType at $targetUrl")

        try {
            // Step 1: Fetch login page to get tokens
            val loginPageResponse = authApiService.getLoginPage(targetUrl)
            if (!loginPageResponse.isSuccessful) {
                return@withContext LoginResponse(false, emptyMap(), "Failed to load login page")
            }

            val loginPageHtml = loginPageResponse.body()?.string() ?: ""
            val initialCookies = extractCookies(loginPageResponse)

            val loginFields = mutableMapOf<String, String>()

            if (portalType == "vlms") {
                // VLMS (Moodle) logic
                val loginToken = extractValue(loginPageHtml, LOGIN_TOKEN_PATTERN)
                loginFields["username"] = regNumber
                loginFields["password"] = password
                loginFields["logintoken"] = loginToken ?: ""
            } else {
                // Student Portal (ASP.NET) logic
                val viewState = extractValue(loginPageHtml, VIEWSTATE_PATTERN)
                val viewStateGenerator = extractValue(loginPageHtml, VIEWSTATE_GENERATOR_PATTERN)
                val eventValidation = extractValue(loginPageHtml, EVENTVALIDATION_PATTERN)

                loginFields["ctl00\$ContentPlaceHolder1\$txtRegNo"] = regNumber
                loginFields["ctl00\$ContentPlaceHolder1\$txtPassword"] = password
                loginFields["ctl00\$ContentPlaceHolder1\$btnLogin"] = "Sign In"
                loginFields["__VIEWSTATE"] = viewState ?: ""
                loginFields["__VIEWSTATEGENERATOR"] = viewStateGenerator ?: ""
                loginFields["__EVENTVALIDATION"] = eventValidation ?: ""
            }

            // Step 2: Submit login form
            val submitResponse = authApiService.submitLogin(targetUrl, loginFields)
            // Code 302/303 is common for successful redirects
            if (!submitResponse.isSuccessful && submitResponse.code() !in 300..399) {
                return@withContext LoginResponse(false, emptyMap(), "Login request failed (HTTP ${submitResponse.code()})")
            }

            // Step 3: Extract cookies and check result
            val finalCookies = initialCookies + extractCookies(submitResponse)
            val responseHtml = submitResponse.body()?.string() ?: ""

            // Check for error messages FIRST
            val errorPattern = if (portalType == "vlms") MOODLE_ERROR_PATTERN else LOGIN_ERROR_PATTERN
            val errorMessage = extractErrorMessage(responseHtml, errorPattern)

            if (errorMessage != null && errorMessage.isNotEmpty()) {
                Log.w(TAG, "Login failed with error: $errorMessage")
                return@withContext LoginResponse(false, emptyMap(), errorMessage)
            }

            // Success criteria: check for URL change OR specific success content in body
            val finalUrl = submitResponse.raw().request.url.toString()
            val hasLoginForm = responseHtml.contains("name=\"username\"") || responseHtml.contains("name=\"password\"") || responseHtml.contains("txtRegNo")
            
            val isSuccess = if (portalType == "vlms") {
                (finalUrl.contains("/my/") || finalUrl.contains("/course/")) || 
                (MOODLE_SUCCESS_PATTERN.matcher(responseHtml).find() && !hasLoginForm)
            } else {
                (finalUrl.contains("Default.aspx") || finalUrl.contains("Home.aspx")) || 
                (ASPNET_SUCCESS_PATTERN.matcher(responseHtml).find() && !hasLoginForm)
            }

            Log.i(TAG, "Login check for $portalType: isSuccess=$isSuccess, hasLoginForm=$hasLoginForm, finalUrl=$finalUrl")

            // Double check: if we are still on the login page URL and didn't find success markers, it's a failure
            val stayedOnLoginPage = finalUrl.contains("login/index.php") || finalUrl == STUDENT_PORTAL_URL
            val finalIsSuccess = isSuccess && (!stayedOnLoginPage || (portalType == "vlms" && MOODLE_SUCCESS_PATTERN.matcher(responseHtml).find()))

            LoginResponse(
                isSuccess = finalIsSuccess,
                cookies = finalCookies,
                errorMessage = if (!finalIsSuccess) "Invalid credentials or session expired" else null
            )
        } catch (e: Exception) {
            Log.e(TAG, "Login execution error", e)
            LoginResponse(false, emptyMap(), e.message ?: "Unknown error occurred")
        }
    }

    private fun extractValue(html: String, pattern: Pattern): String? {
        val matcher = pattern.matcher(html)
        return if (matcher.find()) matcher.group(1) else null
    }

    private fun extractErrorMessage(html: String, pattern: Pattern): String? {
        val matcher = pattern.matcher(html)
        // Group 2 for Moodle (due to alternate tags), Group 1 for ASP.NET
        return if (matcher.find()) {
            if (matcher.groupCount() >= 2) matcher.group(2)?.trim() else matcher.group(1)?.trim()
        } else null
    }

    private fun extractCookies(response: Response<ResponseBody>): Map<String, String> {
        val cookies = mutableMapOf<String, String>()
        response.headers().values("Set-Cookie").forEach { cookieHeader ->
            cookieHeader.split(";").firstOrNull()?.let { cookie ->
                val parts = cookie.split("=", limit = 2)
                if (parts.size == 2) {
                    cookies[parts[0].trim()] = parts[1].trim()
                }
            }
        }
        return cookies
    }
}
