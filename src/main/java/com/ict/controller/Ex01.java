package com.ict.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL mapping => 프로젝트명/@WebServlet 명
@WebServlet("/Ex01")
public class Ex01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// 생략한다.
	public Ex01() {
		System.out.println("생성자()");
    }
	
	public void init(ServletConfig config) throws ServletException {
		// 생성자를 대신해서 멤버 초기화를 할 수 있다.
		// init()가 끝나면 자동으로 service()로 넘어간다.
		System.out.println("init()");
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request => 요청 정보를 가지고 있는 객체 (클라이언트 => 서버)
		// response => 응답 정보를 가지고 있는 객체 (서버 => 클라이언트)
		
		// 클라이언트의 요청방식에 따라 알맞는 메서드를 호출하는 역할을 한다.
		// 요청방식 - get 방식(디폴트) => doGet()로 간다.
		//       - post 방식      => doPost()로 간다. 
		System.out.println("service()");
		if(request.getMethod().equalsIgnoreCase("get")) {
			doGet(request, response);
		}else if(request.getMethod().equalsIgnoreCase("post")) {
			doPost(request, response);
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get()");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.println("post()");
	}
	public void destroy() {
		System.out.println("destroy()");
	}
}