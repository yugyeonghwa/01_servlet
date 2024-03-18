package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.GuestDAO;
import com.ict.db.GuestVO;

public class WriteOkCommand implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String subject = request.getParameter("subject");
		String eamil = request.getParameter("eamil");
		String pwd = request.getParameter("pwd");
		String content = request.getParameter("content");
		
		GuestVO gvo = new GuestVO();
		gvo.setName(name);
		gvo.setSubject(subject);
		gvo.setEmail(content);
		gvo.setPwd(pwd);
		gvo.setContent(content);
		
		int res = GuestDAO.getInsert(gvo);
		
		return "Guest?cmd=list";
	}

}
