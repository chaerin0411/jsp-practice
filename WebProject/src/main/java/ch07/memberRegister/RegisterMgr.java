package ch07.memberRegister;

import java.sql.*;import java.util.Vector;

public class RegisterMgr {
	private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private final String JDBC_URL = "jdbc:mysql://localhost:3306/jspdb?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC&useSSL=false";
	private final String USER = "root";
	private final String PASS = "admin";
	
	public RegisterMgr() {
		try {
			Class.forName(JDBC_DRIVER);			
		} catch(Exception e) {
			System.out.println("Error : ");
		}
	} // MemberMgr()
	
	public Vector getMemberList() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Vector vecList = new Vector();
	
		try {
			conn = DriverManager.getConnection(JDBC_URL, USER, PASS);
			String strQuery = "select * from membertbl";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(strQuery);
			
			while(rs.next()) {
				RegisterBean regBean = new RegisterBean();
				
				regBean.setMemberid(rs.getString("memberid"));
				regBean.setPassword(rs.getString("password"));
				regBean.setName(rs.getString("name"));
				regBean.setEmail(rs.getString("email"));
				vecList.add(regBean);
			}
			rs.close();
		} catch(SQLException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(SQLException ex) {}
			if(stmt != null) try { stmt.close(); } catch(SQLException ex) {}
			if(conn != null) try { conn.close(); } catch(SQLException ex) {}
		}
		return vecList;
}
	
	public void insertMember(RegisterBean mem) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(JDBC_URL, USER, PASS);
			pstmt = conn.prepareStatement("insert into membertbl values (?, ?, ?, ?)");
			pstmt.setString(1, mem.getMemberid());
			pstmt.setString(2, mem.getPassword());
			pstmt.setString(3, mem.getName());
			pstmt.setString(4, mem.getEmail());
			
			pstmt.executeUpdate();
		} catch(Exception ex) {
			System.out.println("Exception" + ex);
		} finally {
			if(rs != null) try { rs.close(); } catch(SQLException e) {};
			if(pstmt != null) try { pstmt.close(); } catch(SQLException e) {};
			if(conn != null) try { conn.close(); } catch(SQLException e) {};
		}
		return;
	}
	
	
}