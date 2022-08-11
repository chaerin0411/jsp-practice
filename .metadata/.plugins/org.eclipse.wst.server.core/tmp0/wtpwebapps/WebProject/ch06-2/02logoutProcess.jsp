<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    	session.removeAttribute("MEMBERID");
    	response.sendRedirect("02loginForm.jsp");
    %>