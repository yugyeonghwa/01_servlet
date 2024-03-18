package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.GuestDAO;
import com.ict.db.GuestVO;

public class OneListCommand implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String idx = request.getParameter("idx");
		
		GuestVO gvo = GuestDAO.getOneList(idx);
		request.setAttribute("gvo", gvo);
		
		// jsp 로 리턴하는게 아님... exec 호출한 Guest로 감.....
		return "guestbook/onelist.jsp";
	}

}