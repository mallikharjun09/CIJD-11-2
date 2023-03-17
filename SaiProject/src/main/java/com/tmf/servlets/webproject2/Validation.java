package com.tmf.servlets.webproject2;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Validation extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print("Welcome");
	}
}
