<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>top.jsp</title>
</head>
<body>
<%
 	String memLogin = (String)session.getAttribute("memLogin");
 	String id = (String)session.getAttribute("memberId");
 	String pw = (String)session.getAttribute("password");
 	String check = (String)session.getAttribute("memSave");
 	String idStr = null, pwStr = null, checkStr = null;
 
 	if(check == null) {
 		idStr = ""; pwStr = ""; checkStr = "";
 	} else {
 		idStr = id; pwStr = pw; checkStr = "checked";
 	}
 	if(memLogin == null) {
%>
 	<form method="post" action="module/loginProcess.jsp">
 		아이디 : <input type="text" name="id" value= <%=idStr %>>
 		비밀번호 : <input type="password" name="pw" value= <%=pwStr %>>
 		<input type="submit" value="확인"> <br>
 		<input type="checkbox" name="idSave" value="c1" <%=checkStr %>> 아이디/비번 저장
	</form>
<%
	} else {
%>

	<h3><%=id %> 님, 환영합니다!</h3>
	<form method="post" action="module/logoutProcess.jsp">
		<input type="submit" value="로그아웃">
	</form>
<%
	}
%>
</body>
</html>