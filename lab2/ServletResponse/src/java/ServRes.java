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

/**
 *
 * @author remon
 */
public class ServRes implements Servlet {

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
        res.setContentType("application/vnd.ms-excel"); 
        PrintWriter out = res.getWriter(); 
        out.println("\t jan \t feb \t march \t total"); 
        out.println("salary \t100 \t200 \t300 \t=sum(B2:D2)");

        res.setContentType("application/msword"); 
        out.println("This is a word documents. lorem ahahahha");
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
