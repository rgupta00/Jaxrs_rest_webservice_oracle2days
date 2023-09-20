package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("it is init method");
	}


	//GET
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		out.print("current date and time:"+LocalDateTime.now());
		
		System.out.println("it is doget method");
		
	}


	@Override
	public void destroy() {
		super.destroy();
		System.out.println("it is destroy method");
	}


}
