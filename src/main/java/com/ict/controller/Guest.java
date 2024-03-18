package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.model.Command;
import com.ict.model.DeleteCommand;
import com.ict.model.ListCommand;
import com.ict.model.LoginCommand;
import com.ict.model.LoginIdxCommand;
import com.ict.model.LoginOkCommand;
import com.ict.model.MyDetailCommand;
import com.ict.model.OneListCommand;
import com.ict.model.SignCommand;
import com.ict.model.SignOkCommand;
import com.ict.model.UpdateCommand;
import com.ict.model.UpdateOkCommand;
import com.ict.model.WriteCommand;
import com.ict.model.WriteOkCommand;
import com.ict.model.deleteOkCommand;
import com.ict.model.mypageCommand;
import com.ict.model.pwdCommand;

@WebServlet("/Guest")
public class Guest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String cmd = request.getParameter("cmd");
		System.out.println(cmd);
		Command comm = null;
		
		switch (cmd) {
		case "list":
			comm = new ListCommand();
			break;
		case "write":
			comm = new WriteCommand();
			break;
		case "write_ok":
			comm = new WriteOkCommand();
			break;
		case "onelist":
			comm = new OneListCommand();
			break;
		case "delete":
			comm = new DeleteCommand();
			break;
		case "update":
			comm = new UpdateCommand();
			break;
		case "delete_ok":
			comm = new deleteOkCommand();
			break;
		case "update_ok":
			comm = new UpdateOkCommand();
			break;
		case "login":
			comm = new LoginCommand();
			break;
		case "login_ok":
			comm = new LoginOkCommand();
			break;
		case "login_idx":
			comm = new LoginIdxCommand();
			break;
		case "sign":
			comm = new SignCommand();
			break;
		case "sign_ok":
			comm = new SignOkCommand();
			break;
		case "mypage":
			comm = new mypageCommand();
			break;
		case "pwd":
			comm = new pwdCommand();
			break;
		case "mydetail":
			comm = new MyDetailCommand();
			break;
		}
		String path = comm.exec(request, response);
		request.getRequestDispatcher(path).forward(request, response);
	}
}
