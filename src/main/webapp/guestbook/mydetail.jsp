<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 회원가입 </title>
<style type="text/css">
	a { text-decoration: none;}
	table{width: 600px; border-collapse:collapse; text-align: center;}
	table,th,td{border: 1px solid black; padding: 3px}
	div{width: 600px; margin:auto; text-align: center;}
</style>
<script type="text/javascript">
</script>
</head>
<body>
	<div>
		<form method="post">
			<table>
				<tr align="center">
					<td bgcolor="#99ccff">이름</td>
					<td><input type="text" name="name" size ="20" value="${uvo.name }"/></td>
				</tr>
				<tr align="center">
					<td bgcolor="#99ccff">이메일</td>
					<td><input type="text" name="email" size ="20" value="${uvo.email }"/></td>
				</tr>
				<tr align="center">
					<td bgcolor="#99ccff">주소</td>
					<td><input type="text" name="addr" size ="20" value="${uvo.addr }"/></td>
				</tr>
				<tr align="center">
					<td bgcolor="#99ccff">연락처</td>
					<td><input type="text" name="phone" size ="20" value="${uvo.phone }"/></td>
				</tr>
				<tfoot>
					<tr align="center">
						<td colspan="2">
							<input type="hidden" name="cmd" value="new_ok">
							<input type="button" value="수정" onclick="new_go(this.form)" />
						</td>
					</tr>
				</tfoot>
			</table>
		</form>
	</div>
</body>
</html>