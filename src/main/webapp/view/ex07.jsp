<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	fieldset{width: 300px;}
</style>
</head>
<body>
	<form action="/01_servlet/Ex07" method="get">
		<fieldset>
			<legend>계산기</legend>
			<p> 수1 : <input type="number" name="s1" required> </p>
			<p> 수2 : <input type="number" name="s2" required> </p>
			<p> 연산자 :
			         <input type="radio" name="op" value="+" checked> + 
			         <input type="radio" name="op" value="-" > - 
			         <input type="radio" name="op" value="*" > * 
			         <input type="radio" name="op" value="/" > / 
			</p>
			<input type="submit" value="계산하기">
		</fieldset>
	</form>
</body>
</html>