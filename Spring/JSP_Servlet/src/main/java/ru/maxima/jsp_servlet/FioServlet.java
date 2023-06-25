package ru.maxima.jsp_servlet;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(value = "/fio-servlet")
public class FioServlet extends HttpServlet {
    private String message;

    public void init() {
        this.message = "Место работы : АО \"КБПА\". Занимаюсь разработкой ПО для встроенных систем на языке С.";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<p style=\"color: navy; font-size: 150%\">" + this.message + "</p>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}