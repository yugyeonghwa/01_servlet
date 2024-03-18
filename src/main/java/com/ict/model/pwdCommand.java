package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.UserVO;

public class pwdCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String pwd = request.getParameter("pwd"); 
		request.setAttribute("pwd", pwd);
		String id = request.getParameter("id"); 
		request.setAttribute("id", id);
		
		System.out.println("pwdcommand id: " + id);
		return "guestbook/pwd.jsp";
	}
}
