package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Command03 implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 일처리
		int su1 = Integer.parseInt(request.getParameter("s1"));
		int su2 = Integer.parseInt(request.getParameter("s2"));
		String op = request.getParameter("op");
		
		try {
			int result = 0;
			switch (op) {
			case "+":
				result = su1 + su2;
				break;
			case "-":
				result = su1 - su2;
				break;
			case "*":
				result = su1 * su2;
				break;
			case "/":
				result = su1 / su2;
				break;
			}
			String res = su1 + op + su2 + "=" + result;
			request.setAttribute("res", res);
		} catch (Exception e) {
			String res = "0으로 나눌 수 없습니다.";
			request.setAttribute("res", res);
		}
			
		// return "결과를 보여줄 jsp 파일 위치"
		return "view/ex13_res03.jsp";
	}

}
