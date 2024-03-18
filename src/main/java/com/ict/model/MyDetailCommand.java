package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.UserDAO;
import com.ict.db.UserVO;

public class MyDetailCommand implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id2");
		System.out.println("MyDetailcommand id: " + id);
		String pwd = request.getParameter("pwd2");
		UserVO uvo2 = new UserVO();
		uvo2.setId(id);
		uvo2.setPwd(pwd);
		
		uvo2 = UserDAO.getLogin(uvo2);
	
		request.setAttribute("uvo", uvo2);
		return "guestbook/mydetail.jsp";
	}

}
