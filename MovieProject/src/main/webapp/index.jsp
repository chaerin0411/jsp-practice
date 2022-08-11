<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>영화 그 이상의 감동. CGV</title>
    <link rel="stylesheet" href="css/test.css" type="text/css" media="screen" />
<%
	String contentPage = request.getParameter("CONTENTPAGE");
	if(contentPage == null) { contentPage = "content.jsp"; }
%>
</head>
<body>
	<header>
		<jsp:include page="module/top.jsp" flush="false"/>
	</header>
	<jsp:include page='<%= "module/" + contentPage %>' flush="false"/>
	<footer>
		<jsp:include page="module/bottom.jsp" flush="false"/>
	</footer>
</body>
</html>