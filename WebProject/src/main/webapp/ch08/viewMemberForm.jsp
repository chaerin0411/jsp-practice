<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MEMBER 테이블 레코드 삽입</title>
</head>
<body>
	<form action="viewMember.jsp" method="post">
		<table border="1">
			<tr>
				<td>조회할 아이디 : </td>
				<td><input type="text" name="memberID" size="10"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="조회"></td>
			</tr>
		</table>
	</form>
</body>
</html>