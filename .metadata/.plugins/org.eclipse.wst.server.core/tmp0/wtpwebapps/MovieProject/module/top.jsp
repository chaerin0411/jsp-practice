<!-- top.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String memberName	= (String)session.getAttribute("member_name");
	String memberLogin	= (String)session.getAttribute("member_login");
	String memberStr = "", loginStr = null, linkStr = null;
	
	if (memberLogin == null) {
		loginStr	= "로그인";
		linkStr		= "index.jsp?CONTENTPAGE=loginForm.jsp";
	}
	else {
		memberStr	= memberName+"님";
		loginStr	= "로그아웃";
		linkStr		= "module/logoutProcess.jsp";
	}
%>

<!-- header 시작 -->
<!-- section top 시작 -->
<section id="top">
	<h1>
		<a id="logo" href="index.jsp"><img id="logo_img" src="img/logoRed.png" alt="CGV"></a>
		<span>CULTUREPLEX</span>
	</h1>
	<nav id="top_menu">
		<ul>
			<li><%= memberStr %></li>
			<li>
				<a href="<%= linkStr %>"></a>
				<img src="img/loginPassword.png" alt="로그인">
				<span><%= loginStr %></span>
			</li>
			<li>
				<a href="index.jsp?CONTENTPAGE=joinForm.jsp"></a>
				<img src="img/loginJoin.png" alt="회원가입">
				<span>회원가입</span>
			</li>
			<li>
				<a href="reservation/reservation_control.jsp?action=myPage"></a>
				<img src="img/loginMember.png" alt="MY CGV">
				<span>MY CGV</span>
			</li>
			<li>
				<a href="index.jsp?CONTENTPAGE=joinForm.jsp"></a>
				<img src="img/loginCustomer.png" alt="고객센터">
				<span>고객센터</span>
			</li>
		</ul>
	</nav>
	<nav id="main_menu">
		<ul>
			<li><a href="index.jsp">영화</a></li>
			<li><a href="reservation/reservation_control.jsp?action=search">극장</a></li>
			<li><a href="index.jsp?CONTENTPAGE=information.jsp">예매</a></li>
			<li><a href="reservation/reservation_control.jsp?action=myPage">스토어</a></li>
			<li><a href="reservation/reservation_control.jsp?action=myPage">이벤트</a></li>
			<li><a href="reservation/reservation_control.jsp?action=myPage">혜택</a></li>
		</ul>
	</nav>
</section><!-- section top 끝 -->
<!-- header 끝 -->