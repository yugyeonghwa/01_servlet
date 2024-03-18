package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class mypageCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String pwd = request.getParameter("pwd"); 
		request.setAttribute("pwd", pwd);
		String id = request.getParameter("id"); 
		request.setAttribute("id", id);
		System.out.println("mypagecommand id: " + id);
		return "Guest?cmd=pwd";
	}
	
}
