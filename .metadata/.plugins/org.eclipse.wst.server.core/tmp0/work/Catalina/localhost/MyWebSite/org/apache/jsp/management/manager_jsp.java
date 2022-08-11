/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-11-23 05:53:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.management;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class manager_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

	String memberId		= (String)session.getAttribute("memberId");
	String memberPwd	= (String)session.getAttribute("memberPwd");
	String memberLogin	= (String)session.getAttribute("memberLogin");
	String loginPcs		= (String)session.getAttribute("loginPcs");
	String loginSave	= (String)session.getAttribute("loginSave");
 
      out.write("\r\n");
      out.write("<!-- contentM.jsp -->\r\n");
      out.write("<div>\r\n");
      out.write("	<p>MEMBER 테이블의 내용</p>\r\n");
      out.write("	<a href=\"../module/logoutProcess.jsp\">로그아웃</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<form>\r\n");
      out.write("<table width=\"100%\" border=\"1\">\r\n");
      out.write("<tr>\r\n");
      out.write("	<th>회원아이디</th>\r\n");
      out.write("	<th>비밀번호</th>\r\n");
      out.write("	<th>이름</th>\r\n");
      out.write("	<th>생년월일</th>\r\n");
      out.write("	<th>전화번호</th>\r\n");
      out.write("	<th>이메일</th>\r\n");
      out.write("	<th>주소</th>\r\n");
      out.write("	<th>회원정보수정</th>\r\n");
      out.write("	<th>회원삭제</th>\r\n");
      out.write("</tr>\r\n");

	Class.forName("com.mysql.jdbc.Driver");

	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	try {
		String jdbcDriver = "jdbc:mysql://localhost:3306/tripdb?" +
							"useUnicode=true&characterEncoding=utf-8&" +
							"serverTimezone=UTC&useSSL=false";
		String dbUser = "root";
		String dbPass = "admin";

		String query = "select * from member order by MEMBER_ID";
		conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
		stmt = conn.createStatement();
		rs = stmt.executeQuery(query);
		
		while(rs.next()) { 
      out.write("\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>");
      out.print( rs.getString("MEMBER_ID") );
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print( rs.getString("MEMBER_PWD") );
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print( rs.getString("MEMBER_NAME") );
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print( rs.getString("MEMBER_BIRTH") );
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print( rs.getString("MEMBER_TEL") );
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print( rs.getString("MEMBER_EMAIL") );
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print( rs.getString("MEMBER_ADDR") );
      out.write("</td>\r\n");
      out.write("			<td><input type=\"submit\" value=\"수정\"></td>\r\n");
      out.write("			<td><input type=\"submit\" value=\"삭제\"></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		");
 }
	} catch (SQLException ex) {
		out.println(ex.getMessage());
		ex.printStackTrace();
	} finally {
		if (rs != null) try { rs.close(); } catch (SQLException ex) {}
		if (stmt != null) try { stmt.close(); } catch (SQLException ex) {}
		if (conn != null) try { conn.close(); } catch (SQLException ex) {}
	}

      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</form>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
