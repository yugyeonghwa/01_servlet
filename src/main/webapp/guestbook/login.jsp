<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 로 그 인 </title>
<style type="text/css">
	a { text-decoration: none;}
	table{width: 600px; border-collapse:collapse; text-align: center;}
	table,th,td{border: 1px solid black; padding: 3px}
	div{width: 600px; margin:auto; text-align: center;}
</style>
<script type="text/javascript">
	function login_go(f) {
		f.submit();
	}
	
</script>
</head>
<body>
	<form action="/01_servlet/Guest" method="post">
		<input type="hidden" name="cmd" value="login_ok">
		아이디<input type="text" name="id"> <br>
		패스워드<input type="password" name="pwd"> <br>
		<input type="button" value="로그인" onclick="login_go(this.form)">
	</form>
</body>
</html>