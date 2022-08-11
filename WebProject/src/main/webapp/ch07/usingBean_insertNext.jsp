<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<% request.setCharacterEncoding("utf-8"); %>

<jsp:useBean class="ch07.memberRegister.RegisterBean" id="regBean" scope="session"/>
<jsp:setProperty name="regBean" property="*"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삽입</title>
</head>
<body>
	<h3>두번째 페이지 회원정보</h3>
		<table bordercolor="#0000ff" border="1">
			<tr>
				<td><strong>ID</strong></td>
				<td><strong>PASSWD</strong></td>
				<td><strong>NAME</strong></td>
				<td><strong>EMAIL</strong></td>
			</tr>
			<tr>
				<td><jsp:getProperty property="memberid" name="regBean"/></td>
				<td><jsp:getProperty property="password" name="regBean"/></td>
				<td><jsp:getProperty property="name" name="regBean"/></td>
				<td><jsp:getProperty property="email" name="regBean"/></td>
			</tr>
		</table>
</body>
</html>