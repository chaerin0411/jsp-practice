<%@ tag body-content="scriptless" pageEncoding="UTF-8"%>

<%@ attribute name="bgcolor" %>
<%@ attribute name="border" %>

<jsp:useBean id="product" class="ch10.jspbook.Product"/>

<h2><jsp:doBody/></h2>
<table border="${border}" bgcolor="${bgcolor}" width="15px">
	<% 
		for(String item : product.getProductList()) {
			out.println("<tr><td>" + item + "</td></tr>");
		}
	%>
</table>