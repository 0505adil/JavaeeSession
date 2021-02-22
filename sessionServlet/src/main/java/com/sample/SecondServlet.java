package com.sample;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            Cookie ck[]=request.getCookies();
            out.print("Hello "+ck[0].getValue());

            out.close();

    }


}