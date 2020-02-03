/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author remon
 */
public class MyServlet implements Servlet {

    ServletConfig sc;

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("I am in init method");
        this.sc = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String str = sc.getInitParameter("AdminEmail");
        PrintWriter out = res.getWriter();
        out.println("the admin email is : " + str);
        System.out.println("I am in service method");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("I am in destroy method");
    }

}
