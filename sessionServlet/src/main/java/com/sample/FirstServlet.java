package com.sample;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {


            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String n=request.getParameter("userName");
            out.print("Welcome "+n);

            Cookie ck  = new Cookie("uname",n);//creating cookie object
            response.addCookie(ck);//adding cookie in the response

            //creating submit button
            out.print("<form action='servlet2' method='get'>");
            out.print("<input type='submit' value='go'>");
            out.print("</form>");

            out.close();

    }
}