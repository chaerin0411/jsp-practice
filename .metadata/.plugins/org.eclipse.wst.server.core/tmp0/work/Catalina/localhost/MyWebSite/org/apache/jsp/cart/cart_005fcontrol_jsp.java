/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-12-10 14:24:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.cart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cartManagement.*;
import memberManagement.*;
import java.util.*;

public final class cart_005fcontrol_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("cartManagement");
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
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
      			"manager_error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
 request.setCharacterEncoding("utf-8"); 
      out.write("\r\n");
      out.write("\r\n");
      cartManagement.CartBean cbean = null;
      synchronized (session) {
        cbean = (cartManagement.CartBean) _jspx_page_context.getAttribute("cbean", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (cbean == null){
          cbean = new cartManagement.CartBean();
          _jspx_page_context.setAttribute("cbean", cbean, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write(' ');
      out.write('\r');
      out.write('\n');
      cartManagement.CartBook cb = null;
      synchronized (session) {
        cb = (cartManagement.CartBook) _jspx_page_context.getAttribute("cb", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (cb == null){
          cb = new cartManagement.CartBook();
          _jspx_page_context.setAttribute("cb", cb, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      cartManagement.CartBook pb = null;
      synchronized (session) {
        pb = (cartManagement.CartBook) _jspx_page_context.getAttribute("pb", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (pb == null){
          pb = new cartManagement.CartBook();
          _jspx_page_context.setAttribute("pb", pb, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      memberManagement.ManagementBook mb = null;
      synchronized (session) {
        mb = (memberManagement.ManagementBook) _jspx_page_context.getAttribute("mb", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (mb == null){
          mb = new memberManagement.ManagementBook();
          _jspx_page_context.setAttribute("mb", mb, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("cb"), request);
      out.write(" \r\n");
      out.write("\r\n");
 
	String action = request.getParameter("action"); // ???????????? ?????? ????????????
	String memberLogin = (String)session.getAttribute("member_login"); // ????????? ?????? ????????????

	// ??????????????? ?????? ?????? ??????
	// ?????? ????????? ????????? ??????
	if(action.equals("alist")) {
		ArrayList<CartBook> cDatas = cbean.getAllDBList();
		session.setAttribute("cDatas", cDatas);
		response.sendRedirect("cart_list.jsp");
	}
	
	// ?????? ?????? ????????? ????????? ??????
	else if(action.equals("list")) {
		ArrayList<CartBook> cDatas = cbean.getDBList(mb.getMember_id());
		session.setAttribute("cDatas", cDatas);
		response.sendRedirect("../index.jsp?CONTENTPAGE=myList.jsp");
	}
	
	// ?????? ???????????? ?????? ?????? ????????? ??????
	else if(action.equals("aSearch")) {
		ArrayList<CartBook> pDatas = cbean.getProductDBList();
		session.setAttribute("pDatas", pDatas);
		response.sendRedirect("../product/product_list.jsp");
	}
	
	// ?????? ???????????? ?????? ????????? ??????
	else if(action.equals("search")) {
		if(memberLogin == null) {
			session.setAttribute("firstLogin", "yet");
			response.sendRedirect("../index.jsp?CONTENTPAGE=loginForm.jsp");
		}
		else { // ????????? ????????????
			CartBook cbook = cbean.getProductDB(request.getParameter("product_no"));
			session.setAttribute("cb",cbook);
			response.sendRedirect("cart_control.jsp?action=insert");
		}
	}
	
	// ????????? ?????? ????????? ????????? ??????
	else if(action.equals("edit")) {
		CartBook cbook = cbean.getDB(cb.getCart_no());
		session.setAttribute("cb",cbook);
		response.sendRedirect("../index.jsp?CONTENTPAGE=cart_edit_form.jsp");
	}
	
	// ????????? ?????? ????????? ??????
	else if(action.equals("insert")) {
		if(cbean.cartCheck(cb.getProduct_no(), mb.getMember_id())) {
			session.setAttribute("verified", "error");
			response.sendRedirect("../index.jsp?CONTENTPAGE=information.jsp");
		} else if(cbean.insertDB(cb, mb.getMember_id())) {
			response.sendRedirect("cart_control.jsp?action=list");
		} else throw new Exception("DB ????????????");		
	}
	
	// ????????? ?????? ????????? ??????
	else if(action.equals("delete")) {
		if(cbean.deleteDB(cb.getCart_no())) {
			response.sendRedirect("cart_control.jsp?action=list");
		} else throw new Exception("DB ?????? ??????");
	}
	
	// ???????????? ?????? ????????? ????????? ??????
	else if(action.equals("productEdit")) {
		CartBook pbook = cbean.getProductDB(cb.getProduct_no());
		session.setAttribute("pb",pbook);
		response.sendRedirect("../index.jsp?CONTENTPAGE=product_edit_form.jsp");
	}
	
	// ?????? ?????? ????????? ??????
	else if(action.equals("productInsert")) {
		if(cbean.insertProductDB(cb)) {
			response.sendRedirect("cart_control.jsp?action=aSearch");
		} else throw new Exception("DB ????????????");		
	}
	
	// ?????? ?????? ????????? ??????
	else if(action.equals("productUpdate")) {
		if(cbean.updateProductDB(cb)) {
			response.sendRedirect("cart_control.jsp?action=aSearch");
		} else throw new Exception("DB ?????? ??????");
	}
	
	// ?????? ?????? ????????? ??????
	else if(action.equals("productDelete")) {
		if(cbean.deleteProductDB(cb.getProduct_no())) {
			response.sendRedirect("cart_control.jsp?action=aSearch");
		} else throw new Exception("DB ?????? ??????");
	}
	else out.println("<script>alert('action ??????????????? ????????? ?????????!')</script>");

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
