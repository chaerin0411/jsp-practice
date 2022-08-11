/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-12-02 06:56:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.module;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- content.jsp -->\r\n");
      out.write("\r\n");
      out.write("<section id=\"main\">\r\n");
      out.write("<!-- section main 시작 -->\r\n");
      out.write("	<section id=\"category1\">\r\n");
      out.write("	<!-- section category1 시작 -->\r\n");
      out.write("		<div id=\"category1_carousel\">\r\n");
      out.write("			<div class=\"window\">\r\n");
      out.write("				<ul class=\"container\">\r\n");
      out.write("					<li><img class=\"cimg selected\" src=\"img/c1.jpg\"></li>\r\n");
      out.write("					<li><img class=\"cimg\" src=\"img/c2.jpg\"></li>\r\n");
      out.write("					<li><img class=\"cimg\" src=\"img/c3.jpg\"></li>\r\n");
      out.write("					<li><img class=\"cimg\" src=\"img/c4.jpg\"></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<ul class=\"buttons\">\r\n");
      out.write("				<li><div id=\"1\" class=\"button selected\"></div></li>\r\n");
      out.write("				<li><div id=\"2\" class=\"button\"></div></li>\r\n");
      out.write("				<li><div id=\"3\" class=\"button\"></div></li>\r\n");
      out.write("				<li><div id=\"4\" class=\"button\"></div></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<button id=\"clarr\" class=\"prev carr\"><img src=\"img/larrow.png\"></button>\r\n");
      out.write("			<button id=\"crarr\" class=\"next carr\"><img src=\"img/rarrow.png\"></button>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div id=\"category1_menu\">\r\n");
      out.write("			<ul>\r\n");
      out.write("				<li class=\"selected\"><a href=\"index.jsp?CONTENTPAGE=myReservation.jsp\"><b>&#128467;</b> 예약 조회</a></li>\r\n");
      out.write("				<li><a href=\"index.jsp?CONTENTPAGE=myPage.jsp\"><b>&#128477;</b> 체크인</a></li>\r\n");
      out.write("				<li><a href=\"index.jsp?CONTENTPAGE=reservation.jsp\"><b>&#9992;</b> 항공권 현황</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section> <!-- section category1 끝 -->\r\n");
      out.write("	<br>\r\n");
      out.write("\r\n");
      out.write("	<section id=\"category2\">\r\n");
      out.write("	<!-- section category2 시작 -->\r\n");
      out.write("		<div id=\"category2_title\"><h3>여행지 추천</h3></div>\r\n");
      out.write("		<div id=\"category2_travel\">\r\n");
      out.write("		<!-- category2_travel 시작 -->           \r\n");
      out.write("			<div class=\"items\">\r\n");
      out.write("				<a href=\"index.jsp?CONTENTPAGE=reservation.jsp\"><img src=\"img/osaka.jpg\"></a>\r\n");
      out.write("				<div class=\"itemp\">\r\n");
      out.write("				<p class=\"title\">서울/인천 - 오사카</p>\r\n");
      out.write("				<p class=\"comment\">일반석 왕복</p>\r\n");
      out.write("				<p class=\"price\">KRW 270,000원 ~</p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>                    \r\n");
      out.write("			<div class=\"items\">\r\n");
      out.write("				<a href=\"index.jsp?CONTENTPAGE=reservation.jsp\"><img src=\"img/hongkong.jpg\"></a>\r\n");
      out.write("				<div class=\"itemp\">\r\n");
      out.write("					<p class=\"title\">서울/인천 - 홍콩</p>\r\n");
      out.write("					<p class=\"comment\">일반석 왕복</p>\r\n");
      out.write("					<p class=\"price\">KRW 380,000원 ~</p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>                                       \r\n");
      out.write("			<div class=\"items\">\r\n");
      out.write("				<a href=\"index.jsp?CONTENTPAGE=reservation.jsp\"><img src=\"img/brazil.jpg\"></a>\r\n");
      out.write("				<div class=\"itemp\">\r\n");
      out.write("					<p class=\"title\">서울/인천 - 브라질</p>\r\n");
      out.write("					<p class=\"comment\">일반석 왕복</p>\r\n");
      out.write("					<p class=\"price\">KRW 520,000원 ~</p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>                    \r\n");
      out.write("			<div class=\"items\">\r\n");
      out.write("				<a href=\"index.jsp?CONTENTPAGE=reservation.jsp\"><img src=\"img/hawaii.jpg\"></a>\r\n");
      out.write("				<div class=\"itemp\">\r\n");
      out.write("					<p class=\"title\">서울/인천 - 하와이</p>\r\n");
      out.write("					<p class=\"comment\">일반석 왕복</p>\r\n");
      out.write("					<p class=\"price\">KRW 700,000원 ~</p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>                    \r\n");
      out.write("		</div> <!-- category2_travel 끝 -->\r\n");
      out.write("\r\n");
      out.write("		<div id=\"category2_travel_img\">\r\n");
      out.write("			<div id=\"category2_travel_imgcmt\">\r\n");
      out.write("				<p><b>여행의 모든 것</b></p>\r\n");
      out.write("				<p><b>TRIP으로 한번에</b></p>\r\n");
      out.write("				<p class=\"firstp\">흩어져 있는 여행정보를 한눈에</p>\r\n");
      out.write("				<p>깔끔하고 자세한 도시별 가이드</p>\r\n");
      out.write("				<p>여행을 공유하는 소통의 장소</p>\r\n");
      out.write("				<p>검색 지옥에서 해방될 시간</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<img src=\"img/triple.png\">\r\n");
      out.write("		</div>\r\n");
      out.write("	</section> <!-- section category2 끝 -->\r\n");
      out.write("</section> <!-- section main 끝 -->");
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
