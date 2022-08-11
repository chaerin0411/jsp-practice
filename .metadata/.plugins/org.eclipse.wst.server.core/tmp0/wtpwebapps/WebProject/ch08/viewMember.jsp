<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");

	String memberID = request.getParameter("memberID");
	String password = request.getParameter("password");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	
	// 1. JDBC 드라이버 로딩
	Class.forName("com.mysql.jdbc.Driver");

	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	try {
		String jdbcDriver = "jdbc:mysql://localhost:3306/jspdb?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC&useSSL=false";
		String dbUser = "root";
		String dbPass = "admin";
		
		String query = "select * from membertbl where MEMBERID = '" + memberID + "'";
		
		// 2. 데이터베이스 커넥션 생성
		conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
		
		// 3. Statement 생성
		stmt = conn.createStatement();
		
		// 4. 쿼리 생성
		rs = stmt.executeQuery(query);
		
		// 5. 쿼리 실행 결과 출력
		while(rs.next()) {
%>
			<table>
				<tr>
					<td><%= rs.getString("MEMBERID") %></td>
					<td><%= rs.getString("PASSWORD") %></td>
					<td><%= rs.getString("NAME") %></td>
					<td><%= rs.getString("EMAIL") %></td>
				</tr>
			</table>
<%
		}
	} catch(SQLException ex) {
		out.println(ex.getMessage());
		ex.printStackTrace();
	} finally {
		// 6. 사용한 Statement/커넥션 종료
		if(rs != null) try { rs.close(); } catch(SQLException ex) {}
		if(stmt != null) try { stmt.close(); } catch(SQLException ex) {}
		if(conn != null) try { conn.close(); } catch(SQLException ex) {}
	}
%>
</body>
</html>