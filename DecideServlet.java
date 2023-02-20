package com.arithematic.servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/accep")
public class DecideServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String operation = request.getParameter("operation");
    	int a = Integer.parseInt(request.getParameter("num1"));   
    	int b = Integer.parseInt(request.getParameter("num2")); 
    	if (operation.equals("add")) {
    		response.sendRedirect("add?num1=" + a + "&num2=" + b );
    	} else if (operation.equals("subtract")) {
    		response.sendRedirect("sub?num1=" + a + "&num2=" + b);
    	} else if (operation.equals("multiply")) {
    		response.sendRedirect("mul?num1=" + a + "&num2=" + b);
    	}
    }
}
