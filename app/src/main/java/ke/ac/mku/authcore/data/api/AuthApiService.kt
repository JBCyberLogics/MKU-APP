package ke.ac.mku.authcore.data.api

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.FieldMap
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Url

interface AuthApiService {
    @GET
    suspend fun getLoginPage(@Url url: String = "https://login.mku.ac.ke/"): Response<ResponseBody>

    @FormUrlEncoded
    @POST
    suspend fun submitLogin(
        @Url url: String = "https://login.mku.ac.ke/",
        @FieldMap fields: Map<String, String>
    ): Response<ResponseBody>
}