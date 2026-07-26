package ke.ac.mku.authcore.manager

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject
import javax.inject.Singleton

/**
 * NetworkInterceptorAnalyzer - PORTAL-004
 * 
 * Captures all authenticated HTTP traffic and forwards to RequestDiscoveryManager.
 */
@Singleton
class NetworkInterceptorAnalyzer @Inject constructor(
    private val discoveryManager: RequestDiscoveryManager
) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        
        // 1. Capture and analyze the request
        discoveryManager.captureRequest(request)
        
        // 2. Proceed with the network call
        return chain.proceed(request)
    }
}
