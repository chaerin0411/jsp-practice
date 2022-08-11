<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ch08 : insert1.jsp</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");

	String memberID = request.getParameter("memberID");
	String password = request.getParameter("password");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection conn = null;
	Statement pstmt = null;
	int a = 0;
	
	try {
		String jdbcDriver = "jdbc:mysql://localhost:3306/jspdb?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC&useSSL=false";
		String dbUser = "root";
		String dbPass = "admin";
		
		conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
		pstmt = conn.createStatement();
		
		a = pstmt.executeUpdate("insert into membertbl values ('" + memberID + "', '" + password + "', '" + name + "', '" + email + "');");
	} finally {
		if(pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
		if(conn != null) try { conn.close(); } catch(SQLException ex) {}
	}
%>
<%= a %>개의 레코드를 MEMBER 테이블에 새로운 레코드를 삽입했습니다
</body>
</html>