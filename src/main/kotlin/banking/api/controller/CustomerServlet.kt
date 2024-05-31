package banking.api.controller

import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

class CustomerServlet : HttpServlet()  {

    override fun init() {

        println("Inside the intilization Blcok of CustomerServlet")
        super.init()
    }

    override fun doGet(req: HttpServletRequest, resp: HttpServletResponse) {
        resp.writer.write("Hello, World! From GET method.")
    }

    override fun doPost(req: HttpServletRequest, resp: HttpServletResponse) {
        resp.writer.write("Hello, World! From POST method.")
    }
}