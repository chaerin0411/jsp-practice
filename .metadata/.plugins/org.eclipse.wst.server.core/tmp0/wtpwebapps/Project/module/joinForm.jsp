<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>항공권 예약 사이트 - 회원가입</title>
<link rel="stylesheet" href="css/form.css" type="text/css" media="screen" />
<script src="js/join.js"></script>
</head>
<body>
	<%
		String verified = (String)session.getAttribute("verified");
		if (verified != null) { %>
			<script>alert("이미 존재하는 아이디입니다!");</script><%
			session.removeAttribute("verified");
		}
	 %>
	<header>
	<!-- header 시작 -->
		<nav id="navi">
		<!-- navi 시작 -->
			<ul>
				<li><a href="index.jsp?CONTENTPAGE=content.jsp">
					<img src="img/home.png"></a></li>
				<li>&#5171;</li>
				<li><a href="index.jsp?CONTENTPAGE=joinForm.jsp">회원가입</a></li>
			</ul>
		</nav><!-- navi 끝 -->
	</header><!-- header 끝 -->

	<section id="main">
		<!-- section main 시작 -->
		<div align="center">

			<h3>회원가입 - Sign up Page</h3>
			<hr>
			<form name="join" method=post onsubmit="return check()"
				action="management/manager_control.jsp">
				<input type=hidden name="action" value="join">
				<table border="1">
					<tr>
						<th>아이디</th>
						<td><input type="text" name="member_id" maxlength="10"></td>
					</tr>
					<tr>
						<th>비밀번호</th>
						<td><input type="password" name="member_pwd" maxlength="50"></td>
					</tr>
					<tr>
						<th>이름</th>
						<td><input type="text" name="member_name" maxlength="20"></td>
					</tr>
					<tr>
						<th>생년월일</th>
						<td><input type="date" name="member_birth"></td>
					</tr>
					<tr>
						<th>전화번호</th>
						<td><input type="text" name="member_tel" maxlength="20"></td>
					</tr>
					<tr>
						<th>이메일</th>
						<td><input type="email" name="member_email"></td>
					</tr>
					<tr>
						<th>주소</th>
						<td><input type="text" name="member_addr"></td>
					</tr>
					<tr>
						<td colspan=2 align=center><input type=submit value="회원가입">
						<input type=reset value="취소"></td>
					</tr>
				</table>
			</form>

		</div>
	</section>
	<!-- section main 끝 -->
</body>
</html>