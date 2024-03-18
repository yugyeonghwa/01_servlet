package com.ict.db;

import java.io.Console;

import org.apache.ibatis.session.SqlSession;

public class UserDAO {
	// 실제 사용하는 클래스 : SqlSession
	private static SqlSession ss;

	private synchronized static SqlSession getSession() {
		if (ss == null) {
			ss = UserDBService.getFactory().openSession();
		}
		return ss;
	}

	public static UserVO getLogin(UserVO vo) {
		UserVO uvo = null;
		uvo = getSession().selectOne("userMembers.login", vo);
		return uvo;
	}
	
	public static int getSign(UserVO vo) {
		int result = 0;
		System.out.println(vo.getPwd());
		result = getSession().insert("userMembers.sign", vo);
		ss.commit();
		return result;
	}
}
