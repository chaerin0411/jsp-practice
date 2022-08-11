<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="memberManagement.*"%>
    
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>나의 정보</title>
<link rel="stylesheet" href="css/form.css" type="text/css" media="screen" />
</head>

<jsp:useBean id="mbean" class="memberManagement.ManagementBean" scope="session"/> 
<jsp:useBean id="mb" class="memberManagement.ManagementBook" scope="session"/>

<body>
<header>
	<!-- header 시작 -->
		<nav id="navi">
		<!-- navi 시작 -->
            <ul>
                <li><a href="index.jsp?CONTENTPAGE=content.jsp"><img src="img/home.png"></a></li>
                <li>&#5171;</li>
                <li><a href="index.jsp?CONTENTPAGE=myPage.jsp">마이페이지</a></li>
                <li>&#5171;</li>
                <li><a href="index.jsp?CONTENTPAGE=myInformation.jsp">나의 정보</a></li>
            </ul>
        </nav> <!-- navi 끝 -->
    </header> <!-- header 끝 -->

<section id="main">
<div align="center">
<H3>나의 정보 </H3>
<HR>
<form name=form2 method=post action=management/manager_control.jsp>
<input type=hidden name="member_id" value="<%=mb.getMember_id()%>">
<input type=hidden name="member_pwd" value="<%=mb.getMember_pwd() %>">
<input type=hidden name="action" value="infoUpdate">

<table border="1">
  <tr>
    <th>이름</th>
    <td><input type="text" name="member_name" value="<%=mb.getMember_name() %>"></td>
  </tr>
      <tr>
    <th>생년월일</th>
    <td><input type="date" name="member_birth" value="<%=mb.getMember_birth() %>"></td>
  </tr>
  <tr>
    <th>전화번호</th>
    <td><input type="text" name="member_tel" value="<%=mb.getMember_tel() %>"></td>
  </tr>
  <tr>
    <th>이메일</th>
    <td><input type="email" name="member_email" value="<%=mb.getMember_email() %>"></td>
  </tr>
  <tr>
    <th>주소</th>
    <td><input type="text" name="member_addr" value="<%=mb.getMember_addr() %>"></td>
  </tr>
  <tr>
    <td colspan=2 align=center><input type=submit value="수정"><input type=reset value="취소"></td>
  </tr>
</table>
</form>
</div>
</section>
</body>
</html>