<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문서 제목</title>
</head>
<body>
	안녕하세요. <br>
	<!-- html 주석 -->
	<%-- jsp 주석 --%>

	<!-- 스크립트릿 -->
	<% 
		// 자바 주석 
		/* 자바 주석 */ 
		String bookTitle = "JSP 기초"; // 메소드 내 지역변수
		String author = "김동양";
		// java.util.Date da = new java.util.Date();
		Date da = new Date();
		// out.println("<h5>" + bookTitle + "</h5>");
	%>
	
	<!-- 선언부 -->
	<!-- 멤버변수(필드) 선언이나 메서드 선언이 올 수 있음 -->
	<%! String ddddd="난 선언부"; // 클래스 내 필드 %>
	
	<!-- 표현식 -->
	<!-- 변수이름이나 함수(메소드), 문장의 끝에 세미콜론(;) 붙이지 않음 -->
	<h5><%= bookTitle %></h5>
	저자는 (<%= author %>)입니다. <br>
	현재 날짜와 시간은 : <%= da %>
</body>
</html>