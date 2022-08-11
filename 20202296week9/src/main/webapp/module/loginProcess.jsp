<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
		
	if(id.equals("dong") && pw.equals("1234")) {
		session.setAttribute("memLogin", "ok");
		if(request.getParameter("idSave") == null) {
			session.removeAttribute("memSave");
		} 
		else {
			session.setAttribute("memSave", "check");					
		}
		session.setAttribute("memberId", id);
		session.setAttribute("password", pw);	
		response.sendRedirect("../template.jsp?CONTENTPAGE=content.jsp");
	}
	else {
%>
		<!DOCTYPE html>
		<html>
		<head>
			<meta charset="UTF-8">
			<title>로그인에 실패</title>
		</head>
		<body>
			잘못된 아이디입니다.
		</body>
		</html>
<%
	}
%>
