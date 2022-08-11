<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="manager_error.jsp" import="java.util.*, memberManagement.*"%>

<!DOCTYPE HTML>
<html>
<head>
<link rel="stylesheet" href="../css/form.css" type="text/css" media="screen" />
<link rel="stylesheet" href="../css/index.css" type="text/css" media="screen" />

<script type="text/javascript">
	function check(member_id) {
		upwd = prompt('수정/삭제 하려면 비밀번호를 넣으세요');
		document.location.href="manager_control.jsp?action=edit&member_id="+member_id+"&upwd="+upwd;
	}
</script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원관리:목록화면</title>

</head>
<jsp:useBean id="datas" scope="session" class="java.util.ArrayList"/>
<body>
<br><br>
<header>
<!-- header 시작 -->	
<jsp:include page="top.jsp" flush="false"/>
<nav id="navi">
	<!-- navi 시작 -->
		<ul>
			<li><a href="../index.jsp?CONTENTPAGE=content.jsp">
				<img src="../img/home.png"></a></li>
			<li>&#5171;</li>
			<li>회원관리:목록화면</li>
		</ul>
</nav><!-- navi 끝 -->
</header><!-- header 끝 -->
	
<div align="center">
<br><br>
<h3>회원관리:목록화면</h3>
<hr><br><br>
<form>
<h2><a href="manager_form.jsp">[회원정보 입력]</a></h2><br>
<h2><a href="../reservation/reservation_control.jsp?action=list">[예약관리:목록화면]</a></h2>

		<table border="1">
			<tr>
				<th>아이디</th>
				<th>비밀번호</th>
			 	<th>이름</th>
			 	<th>생년월일</th>
				<th>전화번호</th>
				<th>이메일</th>
				<th>주소</th>
			</tr>
<%
		for(ManagementBook  mb : (ArrayList<ManagementBook>)datas) {
%>		
			<tr>
				<td><a href="javascript:check('<%=mb.getMember_id()%>')"><%=mb.getMember_id() %></a></td>
				<td><%=mb.getMember_pwd() %></td>
				<td><%=mb.getMember_name() %></td>
				<td><%=mb.getMember_birth() %></td>
				<td><%=mb.getMember_tel() %></td>
				<td><%=mb.getMember_email() %></td>
				<td><%=mb.getMember_addr() %></td>
			</tr>
<%
		}
 %>
		</table>
</form>
</div>
<footer>
	<jsp:include page="../module/bottom.jsp" flush="false"/>
</footer>
</body>
</html>