package com.ict.model;

import javax.print.attribute.standard.MediaSize.NA;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.UserDAO;
import com.ict.db.UserVO;

public class LoginOkCommand implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		UserVO uvo = new UserVO();
		uvo.setId(id);
		uvo.setPwd(pwd);
		
		uvo = UserDAO.getLogin(uvo);
		if (uvo.getId() == null) {
			
			return "Guest?cmd=login";		// 실패
		}
		request.setAttribute("loginyes", "display: none;");
		request.setAttribute("loginyes2", "display: block;");
		request.setAttribute("loginyes3", uvo.getName());
		request.setAttribute("uvo", uvo);
		return "Guest?cmd=login_idx";	// 성공
	}

}
