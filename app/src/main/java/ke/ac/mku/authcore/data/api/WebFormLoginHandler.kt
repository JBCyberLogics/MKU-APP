package ke.ac.mku.authcore.data.api

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
        private val VIEWSTATE_PATTERN = Pattern.compile(
            """id="__VIEWSTATE" value="([^"]*)""""
        )
        private val VIEWSTATE_GENERATOR_PATTERN = Pattern.compile(
            """id="__VIEWSTATEGENERATOR" value="([^"]*)""""
        )
        private val EVENTVALIDATION_PATTERN = Pattern.compile(
            """id="__EVENTVALIDATION" value="([^"]*)""""
        )
        private val LOGIN_ERROR_PATTERN = Pattern.compile(
            """class="failureNotification"[^>]*>([^<]*)""",
            Pattern.CASE_INSENSITIVE
        )
    }

    data class LoginResponse(
        val isSuccess: Boolean,
        val cookies: Map<String, String>,
        val errorMessage: String?
    )

    suspend fun executeLogin(
        regNumber: String,
        password: String
    ): LoginResponse = withContext(Dispatchers.IO) {
        try {
            // Step 1: Fetch login page to get ViewState and EventValidation
            val loginPageResponse = authApiService.getLoginPage()
            if (!loginPageResponse.isSuccessful) {
                return@withContext LoginResponse(
                    isSuccess = false,
                    cookies = emptyMap(),
                    errorMessage = "Failed to load login page"
                )
            }

            val loginPageHtml = loginPageResponse.body()?.string() ?: ""
            val viewState = extractValue(loginPageHtml, VIEWSTATE_PATTERN)
            val viewStateGenerator = extractValue(loginPageHtml, VIEWSTATE_GENERATOR_PATTERN)
            val eventValidation = extractValue(loginPageHtml, EVENTVALIDATION_PATTERN)

            // Step 2: Submit login form with credentials
            val loginFields = mutableMapOf(
                "ctl00\$ContentPlaceHolder1\$txtRegNo" to regNumber,
                "ctl00\$ContentPlaceHolder1\$txtPassword" to password,
                "ctl00\$ContentPlaceHolder1\$btnLogin" to "Sign In",
                "__VIEWSTATE" to (viewState ?: ""),
                "__VIEWSTATEGENERATOR" to (viewStateGenerator ?: ""),
                "__EVENTVALIDATION" to (eventValidation ?: "")
            )

            val submitResponse = authApiService.submitLogin(fields = loginFields)
            if (!submitResponse.isSuccessful) {
                return@withContext LoginResponse(
                    isSuccess = false,
                    cookies = emptyMap(),
                    errorMessage = "Login request failed"
                )
            }

            // Step 3: Extract cookies from response
            val cookies = extractCookies(submitResponse)
            val responseHtml = submitResponse.body()?.string() ?: ""

            // Step 4: Check for error messages in response
            val errorMessage = extractErrorMessage(responseHtml)

            if (errorMessage != null) {
                return@withContext LoginResponse(
                    isSuccess = false,
                    cookies = emptyMap(),
                    errorMessage = errorMessage
                )
            }

            // Step 5: Check if login was successful (redirect or session cookie present)
            val isSuccess = cookies.containsKey("ASP.NET_SessionId") ||
                    responseHtml.contains("portal", ignoreCase = true)

            LoginResponse(
                isSuccess = isSuccess,
                cookies = cookies,
                errorMessage = if (!isSuccess) "Login failed - invalid credentials" else null
            )
        } catch (e: Exception) {
            LoginResponse(
                isSuccess = false,
                cookies = emptyMap(),
                errorMessage = e.message ?: "Unknown error occurred"
            )
        }
    }

    private fun extractValue(html: String, pattern: Pattern): String? {
        val matcher = pattern.matcher(html)
        return if (matcher.find()) matcher.group(1) else null
    }

    private fun extractErrorMessage(html: String): String? {
        val matcher = LOGIN_ERROR_PATTERN.matcher(html)
        return if (matcher.find()) matcher.group(1)?.trim() else null
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