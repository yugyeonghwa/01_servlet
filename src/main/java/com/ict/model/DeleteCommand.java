package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String idx = request.getParameter("idx");
		String pwd = request.getParameter("pwd");
		
		// guestbook/delete.jsp 로 정보를 넘겨준다규??..
		request.setAttribute("idx", idx);
		request.setAttribute("pwd", pwd);
		return "guestbook/delete.jsp";
	}

}
