<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>4개의 영역과 속성</title>
</head>
<body>
	<h1>2번째 페이지</h1>
	
	<%= (String)session.getAttribute("testId") %>
	
	<form action="01third.jsp" method="post">
		<input type="submit" value="3번째 페이지로">
	</form>
	
	<jsp:include page="01second2.jsp" flush="false" />
</body>
</html>