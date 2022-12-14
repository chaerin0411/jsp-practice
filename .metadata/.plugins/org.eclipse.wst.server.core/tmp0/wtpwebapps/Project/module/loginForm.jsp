<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>항공권 예약 사이트 - 로그인</title>
<link rel="stylesheet" type="text/css" href="css/login.css">
</head>
<body>
<%
	String member_id  = (String)session.getAttribute("member_id");
	String member_pwd = (String)session.getAttribute("member_pwd");
	String loginSave  = (String)session.getAttribute("loginSave");
	String loginPcs = (String)session.getAttribute("loginPcs");
	String joinEnd = (String)session.getAttribute("joinEnd");
	String firstLogin = (String)session.getAttribute("firstLogin");
 	String idStr = null, pwStr = null, checkStr = null; 
 	
 	if (loginSave == null) { idStr = ""; pwStr = ""; checkStr = ""; }
 	else { idStr = member_id; pwStr = member_pwd; checkStr = "checked"; }

 	if (loginPcs == "false") {
 		%><script>alert("아이디/비밀번호가 틀렸습니다!");</script><%
		session.removeAttribute("loginPcs");
 	}
 	if (joinEnd != null) {
 		%><script>alert("회원가입이 완료되었습니다!");</script><%
		session.removeAttribute("joinEnd");
 	}
 	if (firstLogin != null) {
 		%><script>alert("로그인 이후 접근 가능한 페이지입니다!");</script><%
		session.removeAttribute("firstLogin");
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
				<li><a href="index.jsp?CONTENTPAGE=loginForm.jsp">로그인</a></li>
			</ul>
		</nav><!-- navi 끝 -->
	</header><!-- header 끝 -->

	<section id="main">
	<!-- section main 시작 -->
		<h3>로그인 - Log in Page</h3>
		<form id="login" name="form2" action="module/loginProcess.jsp"
			method="get">
			<fieldset id="login_form">
				<legend class="hidden">로그인</legend>

				<div id="id_area">
					<div class="input_row">
						<div class="img"><img src="img/id.png"></div>
						<div class="input_box">
							<input id="id" type="text" name="member_id"
								placeholder="아이디" value="<%= idStr %>">
						</div>
					</div>
				</div>

				<div id="pw_area">
					<div class="input_row">
						<div class="img"><img src="img/pw.png"></div>
						<div class="input_box">
							<input id="pw" type="password" name="member_pwd"
								placeholder="비밀번호" value="<%= pwStr %>">
						</div>
					</div>
				</div>

				<div id="etc_area">
					<div id="linkbox">
						<ul>
							<li class="bdright"><a href="#">아이디 찾기</a></li>
							<li><a href="#">비밀번호 찾기</a></li>
						</ul>
					</div>
					<div id="checkbox">
						<input type="checkbox" name="save" <%= checkStr %>>
						<label for="login_check">아이디/비밀번호 저장</label>
					</div>
				</div>
			</fieldset>
			
			<div id="submit_area"><input type="submit" value="로그인"></div>
		</form>
		<form action="index.jsp?CONTENTPAGE=joinForm.jsp" method="post">
			<button id="signup_btn">회원가입</button>
		</form>
	</section><!-- section main 끝 -->
</body>
</html>