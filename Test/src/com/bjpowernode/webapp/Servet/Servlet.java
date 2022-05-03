package com.bjpowernode.webapp.Servet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/servlet/test")
public class Servlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");

        out.println("Sign Success...");
        Date date=new Date();
        out.println("<br>"+date.toString());
    }
}
