<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
<link rel="stylesheet" href="05style.css">
</head>
<body>
<header>
	<!-- <%@ include file="05top.jsp" %> -->
	<jsp:include page="05top.jsp" flush="false"/>
</header>
<section>
	<h2> 메인 페이지입니다. </h2>
</section>
<footer>
	<!-- <%@ include file="05top.jsp" %> -->
	<jsp:include page="05footer.jsp" flush="false"/>
</footer>
</body>
</html>