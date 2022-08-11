<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import = "java.sql.*" %>

<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
		
	if(id.equals("admin") && pw.equals("admin")) {
		session.setAttribute("memberLogin", "ok");
		if(request.getParameter("save") == null) {
			session.removeAttribute("loginSave");
		}
		else {
			session.setAttribute("loginSave", "check");
		}
		session.setAttribute("memberId", id);
		session.setAttribute("memberPwd", pw);
		session.setAttribute("memberName", "관리자");
		response.sendRedirect("../management/manager.jsp");
	}
	else if(id.equals("dong") && pw.equals("1234")) {
		session.setAttribute("memberLogin", "ok");
		if(request.getParameter("save") == null) {
			session.removeAttribute("loginSave");
		}
		else {
			session.setAttribute("loginSave", "check");
		}
		session.setAttribute("memberId", id);
		session.setAttribute("memberPwd", pw);
		session.setAttribute("memberName", "이용자");
		response.sendRedirect("../index.jsp?CONTENTPAGE=content.jsp");
	}
	else {
		session.setAttribute("loginPcs", "false");
		response.sendRedirect("../index.jsp?CONTENTPAGE=loginForm.jsp");
	}
%>