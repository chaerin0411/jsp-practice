/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-11-28 12:09:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.reservation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import reservationManagement.*;

public final class reservation_005fedit_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/form.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	function delcheck() {\r\n");
      out.write("		result = confirm(\"정말로 삭제하시겠습니까 ?\");\r\n");
      out.write("	\r\n");
      out.write("		if(result == true){\r\n");
      out.write("			document.reservation.action.value=\"delete\";\r\n");
      out.write("			document.reservation.submit();\r\n");
      out.write("		}\r\n");
      out.write("		else\r\n");
      out.write("			return;\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>회원관리:수정화면</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      reservationManagement.ReservationBook rb = null;
      synchronized (session) {
        rb = (reservationManagement.ReservationBook) _jspx_page_context.getAttribute("rb", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (rb == null){
          rb = new reservationManagement.ReservationBook();
          _jspx_page_context.setAttribute("rb", rb, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<H2>항공권 예약:수정화면 </H2>\r\n");
      out.write("<HR>\r\n");
      out.write("<form name=reservation method=post action=reservation_control.jsp>\r\n");
      out.write("<input type=hidden name=\"member_id\" value=\"");
      out.print(rb.getMember_id());
      out.write("\">\r\n");
      out.write("<input type=hidden name=\"action\" value=\"update\">\r\n");
      out.write("\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th>날짜</th>\r\n");
      out.write("    <td><input type=\"date\" name=\"date\" value=\"");
      out.print(rb.getDate() );
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th>출발지</th>\r\n");
      out.write("    <td><select name=\"start_port\">\r\n");
      out.write("		<option value=\"");
      out.print(rb.getStart_port() );
      out.write('"');
      out.write('>');
      out.print(rb.getStart_port() );
      out.write("\r\n");
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
      out.write("		<option value=\"");
      out.print(rb.getEnd_port() );
      out.write('"');
      out.write('>');
      out.print(rb.getEnd_port() );
      out.write("\r\n");
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
      out.write("    <td><input type=\"number\" name=\"passenger_number\" value=\"");
      out.print(rb.getPassenger_number() );
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th>좌석등급</th>\r\n");
      out.write("    <td><select name=\"grade\">\r\n");
      out.write("		<option value=\"");
      out.print(rb.getGrade() );
      out.write('"');
      out.write('>');
      out.print(rb.getGrade() );
      out.write("\r\n");
      out.write("		<option value=\"이코노미\">이코노미\r\n");
      out.write("		<option value=\"비지니스\">비지니스\r\n");
      out.write("		<option value=\"퍼스트\">퍼스트\r\n");
      out.write("	</select></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th>좌석</th>\r\n");
      out.write("    <td><input type=\"text\" name=\"seat\" value=\"");
      out.print(rb.getSeat() );
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th>항공사이름</th>\r\n");
      out.write("    <td><select name=\"airplane_no\">\r\n");
      out.write("		<option value=\"");
      out.print(rb.getAirplane_no() );
      out.write('"');
      out.write('>');
      out.print(rb.getAirplane_no() );
      out.write("\r\n");
      out.write("		<option value=\"AA\">아시아나항공\r\n");
      out.write("		<option value=\"AI\">에어인천\r\n");
      out.write("		<option value=\"AP\">에어부산\r\n");
      out.write("		<option value=\"AS\">에어서울\r\n");
      out.write("		<option value=\"ET\">이스타항공\r\n");
      out.write("		<option value=\"FK\">플라이강원\r\n");
      out.write("		<option value=\"JA\">진에어\r\n");
      out.write("		<option value=\"JJ\">제주항공\r\n");
      out.write("		<option value=\"TW\">티웨이항공\r\n");
      out.write("	</select></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th>출발시간</th>\r\n");
      out.write("    <td><input type=\"datetime\" name=\"departure_time\" value=\"");
      out.print(rb.getDeparture_time() );
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th>도착시간</th>\r\n");
      out.write("    <td><input type=\"datetime\" name=\"arrival_time\" value=\"");
      out.print(rb.getArrival_time() );
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=2 align=center><input type=submit value=\"수정\"><input type=reset value=\"취소\"><input type=\"button\" value=\"삭제\" onClick=\"delcheck()\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
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
