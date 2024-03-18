<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function chk(f) {
		const pwd = "${pwd}"
		const pwd2 = f.pwd.value;
		console.log(pwd);
		console.log(pwd2);
		if (pwd == pwd2) {
			f.action = "/01_servlet/Guest";
			f.submit();
		} else {
			alert("error");
			f.pwd.value="";
			f.pwd.focus();
			return;
		}
	}
</script>
</head>
<body>
	<form method="post">
		<input type="hidden" name="pwd2" value="${pwd}">
		<input type="hidden" name="id2" value="${id}">
		<input type="hidden" name="cmd" value="mydetail" >
		패스워드<input type="password" name="pwd"> <br>
		<input type="button" value="확인" onclick="chk(this.form)">
		
	</form>
</body>
</html>