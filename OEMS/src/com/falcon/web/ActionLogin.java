package com.falcon.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ActionLogin extends HttpServlet {

    public void doPost (HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("User Dashboard <br>");
        String uname = request.getParameter("username");
        out.println("<br> Username: " + uname);
        String upass = request.getParameter("password");
        out.println("<br> Password: " + upass);
    }
}

