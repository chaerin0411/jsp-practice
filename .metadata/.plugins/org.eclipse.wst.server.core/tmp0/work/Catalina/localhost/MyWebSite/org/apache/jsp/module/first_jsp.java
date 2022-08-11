/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-12-10 14:06:52 UTC
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

public final class first_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
      reservationManagement.ReservationBean rbean = null;
      synchronized (session) {
        rbean = (reservationManagement.ReservationBean) _jspx_page_context.getAttribute("rbean", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (rbean == null){
          rbean = new reservationManagement.ReservationBean();
          _jspx_page_context.setAttribute("rbean", rbean, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      reservationManagement.ReservationBook rb = null;
      synchronized (session) {
        rb = (reservationManagement.ReservationBook) _jspx_page_context.getAttribute("rb", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (rb == null){
          rb = new reservationManagement.ReservationBook();
          _jspx_page_context.setAttribute("rb", rb, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<head><link rel=\"stylesheet\" href=\"css/seat.css\" type=\"text/css\" media=\"screen\" /></head>\r\n");
      out.write("\r\n");
      out.write("<!-- first.jsp -->\r\n");
      out.write("<body>\r\n");
      out.write("<header><!-- header 시작 -->\r\n");
      out.write("	<nav id=\"navi\"><!-- navi 시작 -->\r\n");
      out.write("		<ul>\r\n");
      out.write("			<li><a href=\"index.jsp?CONTENTPAGE=content.jsp\">\r\n");
      out.write("				<img src=\"img/home.png\"></a></li>\r\n");
      out.write("			<li>&#5171;</li>\r\n");
      out.write("			<li><a href=\"index.jsp?CONTENTPAGE=reservation.jsp\">항공권 예약</a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("	</nav><!-- navi 끝 -->\r\n");
      out.write("</header><!-- header 끝 -->\r\n");
      out.write("\r\n");
      out.write("<!-- section main 시작 -->\r\n");
      out.write("<section id=\"main\">\r\n");
      out.write("	<h3>좌석 선택</h3>\r\n");
      out.write("	<form name=\"floor1\" method=post\r\n");
      out.write("		action=reservation/reservation_control.jsp>\r\n");
      out.write("		<input type=hidden name=\"grade\" value=\"");
      out.print(rb.getGrade());
      out.write("\">\r\n");
      out.write("		<input type=hidden name=\"action\" value=\"seat\">\r\n");
      out.write("		\r\n");
      out.write("		<table style=\"width: 380px;\"><!-- table 시작 -->\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>V</th>\r\n");
      out.write("				<th>이동통로</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV01\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV02\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV03\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV04\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV05\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV06\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV07\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV08\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV09\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV10\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV11\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV12\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV13\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV14\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV15\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV16\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV17\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV18\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV19\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV20\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV21\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV22\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV23\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV24\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"seat\" type=\"submit\" value=\"AV25\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table><!-- table 끝 -->\r\n");
      out.write("	</form>\r\n");
      out.write("</section><!-- section 끝 -->\r\n");
      out.write("</body>");
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