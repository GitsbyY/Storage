<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>JspCustomTagBasic2</title>
	
</head>

<body>
	
	<%
		int num = (int)request.getAttribute("num");
		String str = (String)request.getAttribute("str");
		int num2 = (int)request.getAttribute("num2");
		String str2 = (String)request.getAttribute("str2");
	%>
	
	<div>
		<%=num %>, <%=str %>
	</div>
	
</body>

</html>



