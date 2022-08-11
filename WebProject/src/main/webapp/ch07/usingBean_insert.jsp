<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<% request.setCharacterEncoding("utf-8"); %>

<jsp:useBean class="ch07.memberRegister.RegisterBean" id="regBean" scope="session"/>
<jsp:setProperty name="regBean" property="*"/>
<jsp:useBean class="ch07.memberRegister.RegisterMgr" id="regMgr" scope="session"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삽입</title>
</head>
<body>
	<h3>회원정보</h3>
	<table bordercolor="#0000ff" border="1">
		<tr>
			<td><strong>ID</strong></td>
			<td><strong>PASSWD</strong></td>
			<td><strong>NAME</strong></td>
			<td><strong>EMAIL</strong></td>
		</tr>
		<tr>
			<td><%= regBean.getMemberid() %></td>
			<td><%= regBean.getPassword() %></td>
			<td><%= regBean.getName() %></td>
			<td><%= regBean.getEmail() %></td>
		</tr>
	</table>

	<% regMgr.insertMember(regBean); %>

	<a href="usingBean_insertNext.jsp">다음 페이지</a>
</body>
</html>