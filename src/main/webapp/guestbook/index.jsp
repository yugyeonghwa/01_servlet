<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		.login{
		 	<%= request.getAttribute("loginyes")%>
		}
		.login2{
			display: none;
			<%= request.getAttribute("loginyes2")%>
		}
		
	</style>
</head>
<body>
	<form action="/01_servlet/Guest" method="post">
		<input type="submit" value="guestbook">
		<input type="hidden" name="cmd" value="list">
	</form>
	
	<form class="login2" action="/01_servlet/Guest" method="post">
		<span >
		<%= request.getAttribute("loginyes3")%> 님 환영합니다.
		</span> 
		<input type="submit" value="마이페이지">
		<input type="hidden" name="cmd" value="mypage">
		<input type="hidden" name="pwd" value="${uvo.pwd}">
		<input type="hidden" name="id" value="${uvo.id}">
	</form>
	
	<br>
	<form action="/01_servlet/Guest" class="login" method="post">
		<input type="submit" value="로그인">
		<input type="hidden" name="cmd" value="login">
	</form>
	<br>
	<form action="/01_servlet/Guest" class="login" method="post">
		<input type="submit" value="회원가입">
		<input type="hidden" name="cmd" value="sign">
	</form>
</body>
</html>