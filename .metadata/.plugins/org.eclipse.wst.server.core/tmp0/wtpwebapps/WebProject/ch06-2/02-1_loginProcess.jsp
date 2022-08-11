<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>02-1_loginProcess.jsp</title>
</head>
<body>
	<%
		String i = request.getParameter("id");
		String p = request.getParameter("pw");
		
		if(i.equals("dong") && p.equals("123")) {
			session.setAttribute("memLogin", "ok");
			if(request.getParameter("idSave") == null) {
				session.removeAttribute("memSave");
			} 
			else {
				session.setAttribute("memSave", "check");
			}
			session.setAttribute("memId", i);
			session.setAttribute("memPw", p);
			
			response.sendRedirect("02-1_loginForm.jsp");
		}
		else {
			response.sendRedirect("02-1_loginForm.jsp");
		}
	%>
	
</body>
</html>