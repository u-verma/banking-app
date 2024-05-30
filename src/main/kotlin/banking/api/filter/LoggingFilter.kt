package banking.api.filter

import jakarta.servlet.Filter
import jakarta.servlet.FilterChain
import jakarta.servlet.ServletRequest
import jakarta.servlet.ServletResponse
import jakarta.servlet.annotation.WebFilter

@WebFilter("/*") // Intercept all requests
class LoggingFilter : Filter {
    override fun doFilter(request: ServletRequest, response: ServletResponse, filterChain: FilterChain) {

        // Intercept request
        println("Received request body: $request")

        // Continue with the next filter or servlet
        filterChain.doFilter(request, response);

        // Intercept response (if needed)
        // Add any response handling logic here
        println("Received response body: $response")
    }
}