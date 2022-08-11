<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>4개의 영역과 속성</title>
</head>
<body>
	<h6>웹프로젝트실습 7주차</h6>
	<h5> 4개의 영역과 속성 알아보기</h5>
	
	<!-- String testId = "Chaerin"; -->
	<!-- <% pageContext.setAttribute("testId", "Chaerin"); %> testId 변수는 현재 01index.jsp 파일 내에서 사용 가능 -->
	<!-- <% request.setAttribute("testId", "Chaerin"); %> testId 변수는 클라이언트가 요청한 페이지 내에서 사용 가능 -->
	<% session.setAttribute("testId", "Chaerin"); %> <!-- testId 변수는 현재 브라우저 내에서 사용 가능 -->
	<!-- <% application.setAttribute("testId", "Chaerin"); %> testId 변수는 application 내에서 사용 가능 -->	
	
	<form action="01second.jsp" method="post">
		<input type="submit" value="2번째 페이지로">
	</form>
</body>
</html>