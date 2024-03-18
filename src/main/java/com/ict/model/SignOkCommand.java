package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.UserDAO;
import com.ict.db.UserVO;

public class SignOkCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		UserVO vo = new UserVO();
		vo.setId(request.getParameter("id"));
		vo.setPwd(request.getParameter("pwd"));
		vo.setName(request.getParameter("name"));
		vo.setEmail(request.getParameter("email"));
		vo.setAddr(request.getParameter("addr"));
		vo.setPhone(request.getParameter("phone"));
		
		int result = UserDAO.getSign(vo);
		
		return "Guest?cmd=login_idx";
	}

}
