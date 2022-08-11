<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    	session.removeAttribute("memLogin");
    	response.sendRedirect("02-1_loginForm.jsp");
    %>