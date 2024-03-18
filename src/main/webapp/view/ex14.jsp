<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/01_servlet/Ex14" method="post">
		<fieldset>
			<legend>성적보기</legend>
			<p>이름 : <input type="text" name="name" required></p>
			<p>국어 : <input type="text" name="kor" required></p>
			<p>영어 : <input type="text" name="eng" required></p>
			<p>수학 : <input type="text" name="math" required></p>
			
			<input type="hidden" name="cmd" value="1">
			<input type="submit" value="결과보기">
			<input type="reset" value="취소">
		</fieldset>
	</form>
	<hr>
	
	<form action="/01_servlet/Ex14" method="post">
		<p>취미 :
			<input type="checkbox" name="hobby" value="운동">운동
			<input type="checkbox" name="hobby" value="게임">게임
			<input type="checkbox" name="hobby" value="영화">영화
			<input type="checkbox" name="hobby" value="독서">독서
		</p>
		<input type="hidden" name="cmd" value="2">
		<input type="submit" value="결과보기">
	</form>
</body>
</html>