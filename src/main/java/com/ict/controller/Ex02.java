package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex02")
public class Ex02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 응답에 대한 한글 처리 (ContentType);
		response.setContentType("text/html; charset=UTF-8");
		
		// 화면에 출력할 수 있는 객체
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>제목 태그 : h1 ~ h6</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h0 style='background-color: red;'> 제목 태그 h0 </h0>");
		out.println("<h0> 제목 태그 h0 </h0>");
		out.println("<h1 style='background-color: blue;'> 제목 태그 h1 </h1>");
		out.println("<h2> 제목 태그 h2 </h2>");
		out.println("<h3> 제목 태그 h3 </h3>");
		out.println("<h4> 제목 태그 h4 </h4>");
		out.println("<h5> 제목 태그 h5 </h5>");
		out.println("<h6> 제목 태그 h6 </h6>");
		out.println("<h7> 제목 태그 h7 </h7>");
		out.println("<hr>");
		out.println("<h1> 제목 태그 h1 </h1>");
		out.println("<h1 style='font-size: 48px'> 제목 태그 h1 </h1>");
		out.println("<hr>");
		out.println("<span style='background-color: yellow;'>HTML & CSS</span>");
		out.println("<span>JavaScript</span>");
		out.println("</body>");
		out.println("</html>");
		
	}

	

}