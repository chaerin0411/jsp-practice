/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-12-02 06:57:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.module;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import reservationManagement.*;
import memberManagement.*;

public final class reservation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("memberManagement");
    _jspx_imports_packages.add("reservationManagement");
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
      response.setContentType("text/html; charset=UTF-8");
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
      java.util.ArrayList sDatas = null;
      synchronized (session) {
        sDatas = (java.util.ArrayList) _jspx_page_context.getAttribute("sDatas", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (sDatas == null){
          sDatas = new java.util.ArrayList();
          _jspx_page_context.setAttribute("sDatas", sDatas, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!DOCTYPE HTML>\r\n");
      out.write("	<html>\r\n");
      out.write("\r\n");
      out.write("	<head>\r\n");
      out.write("		<link rel=\"stylesheet\" href=\"css/reservation.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("		<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("		<title>reservation.jsp</title>\r\n");
      out.write("\r\n");
      out.write("	</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("		<!-- header 시작 -->\r\n");
      out.write("		<nav id=\"navi\">\r\n");
      out.write("			<!-- navi 시작 -->\r\n");
      out.write("			<ul>\r\n");
      out.write("				<li><a href=\"index.jsp?CONTENTPAGE=content.jsp\">\r\n");
      out.write("						<img src=\"img/home.png\"></a></li>\r\n");
      out.write("				<li>&#5171;</li>\r\n");
      out.write("				<li><a href=\"index.jsp?CONTENTPAGE=reservation.jsp\">항공권 예약</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</nav><!-- navi 끝 -->\r\n");
      out.write("	</header><!-- header 끝 -->\r\n");
      out.write("\r\n");
      out.write("<div id=\"main\" align=\"center\">\r\n");
      out.write("<form name=reservation method=post action=reservation/reservation_control.jsp>\r\n");
      out.write("<input type=hidden name=\"action\" value=\"csearch\">\r\n");
      out.write("\r\n");
      out.write("<h3>여정/날짜 선택</h3>\r\n");
      out.write("<input type=\"button\" value=\"왕복\" style=\"background-color: #bbb;\">\r\n");
      out.write("<input type=\"button\" value=\"편도\">\r\n");
      out.write("\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th>날짜</th>\r\n");
      out.write("    <td><input type=\"date\" name=\"date\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th>출발지</th>\r\n");
      out.write("    <td><select name=\"start_port\">\r\n");
      out.write("		<option value=\"BKK\">방콕\r\n");
      out.write("		<option value=\"CDG\">파리\r\n");
      out.write("		<option value=\"CJU\">제주\r\n");
      out.write("		<option value=\"GMP\">김포\r\n");
      out.write("		<option value=\"GRU\">상파울로\r\n");
      out.write("		<option value=\"HKG\">홍콩\r\n");
      out.write("		<option value=\"HNL\">하와이\r\n");
      out.write("		<option value=\"ICN\">인천\r\n");
      out.write("		<option value=\"JFK\">뉴욕\r\n");
      out.write("		<option value=\"KIX\">오사카\r\n");
      out.write("		<option value=\"LHR\">런던\r\n");
      out.write("		<option value=\"NRT\">도쿄\r\n");
      out.write("		<option value=\"PEK\">베이징\r\n");
      out.write("		<option value=\"PUS\">부산\r\n");
      out.write("	</select></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th>도착지</th>\r\n");
      out.write("    <td><select name=\"end_port\">\r\n");
      out.write("		<option value=\"BKK\">방콕\r\n");
      out.write("		<option value=\"CDG\">파리\r\n");
      out.write("		<option value=\"CJU\">제주\r\n");
      out.write("		<option value=\"GMP\">김포\r\n");
      out.write("		<option value=\"GRU\">상파울로\r\n");
      out.write("		<option value=\"HKG\">홍콩\r\n");
      out.write("		<option value=\"HNL\">하와이\r\n");
      out.write("		<option value=\"ICN\">인천\r\n");
      out.write("		<option value=\"JFK\">뉴욕\r\n");
      out.write("		<option value=\"KIX\">오사카\r\n");
      out.write("		<option value=\"LHR\">런던\r\n");
      out.write("		<option value=\"NRT\">도쿄\r\n");
      out.write("		<option value=\"PEK\">베이징\r\n");
      out.write("		<option value=\"PUS\">부산\r\n");
      out.write("	</select></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th>탑승인원</th>\r\n");
      out.write("    <td><input type=\"number\" name=\"passenger_number\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th>좌석등급</th>\r\n");
      out.write("    <td><select name=\"grade\">\r\n");
      out.write("		<option value=\"이코노미\">이코노미\r\n");
      out.write("		<option value=\"비지니스\">비지니스\r\n");
      out.write("		<option value=\"퍼스트\">퍼스트\r\n");
      out.write("	</select></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("</table>\r\n");
      out.write("<input id=\"search\" type=\"submit\" value=\"항공권 조회\">\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
