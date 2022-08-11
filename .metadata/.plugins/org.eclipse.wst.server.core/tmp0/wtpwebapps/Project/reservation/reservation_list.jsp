<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="manager_error.jsp" import="java.util.*, reservationManagement.*"%>

<!DOCTYPE HTML>
<html>
<head>
<link rel="stylesheet" href="../css/form.css" type="text/css" media="screen" />
<link rel="stylesheet" href="../css/index.css" type="text/css" media="screen" />

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>예약관리:목록화면</title>

</head>
<jsp:useBean id="rDatas" scope="session" class="java.util.ArrayList"/>
<body>
<br><br>
<header>
<!-- header 시작 -->	
<jsp:include page="../management/top.jsp" flush="false"/>
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
<h3>예약관리:목록화면</h3> 
<hr><br><br>
<form>
<h2><a href="../management/manager_list.jsp">[회원관리:목록화면]</a></h2>

		<table border="1">
			<tr>
						<th>예약번호</th>
						<th>예약자</th>
						<th>탑승일</th>
						<th>출발지</th>
						<th>도착지</th>
						<th>탑승인원</th>
						<th>좌석등급</th>
						<th>좌석</th>
						<th>항공사이름</th>
						<th>출발시간</th>
						<th>도착시간</th>
						<th>운임료</th>
					</tr>
<% 
		for(ReservationBook rb : (ArrayList<ReservationBook>)rDatas) {
%>
			<tr>
				<td><a href="javascript:check(<%=rb.getReservation_no() %>)">
					<%=rb.getReservation_no() %>
				</a></td>
				<td>
					<%=rb.getMember_id() %>
				</td>
				<td>
					<%=rb.getDate() %>
				</td>
				<td>
					<%=rb.getStart_port() %>
				</td>
				<td>
					<%=rb.getEnd_port() %>
				</td>
				<td>
					<%=rb.getPassenger_number() %>
				</td>
				<td>
					<%=rb.getGrade() %>
				</td>
				<td>
					<%=rb.getSeat() %>
				</td>
				<td>
					<%=rb.getAirplane_no() %>
				</td>
				<td>
					<%=rb.getDeparture_time() %>
				</td>
				<td>
					<%=rb.getArrival_time() %>
				</td>
				<td>
					<%=rb.getFreightfee() %>
				</td>
				</tr>
	<% } %>
		</table>
</form>
</div>
<footer>
	<jsp:include page="../module/bottom.jsp" flush="false"/>
</footer>
</body>
</html>