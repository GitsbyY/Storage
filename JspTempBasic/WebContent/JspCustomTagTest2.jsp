<%@page import="java.util.ArrayList"%>
<%@page import="ezen.com.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>JspCustomTagTest2</title>
</head>

<body>
		<%
		ArrayList<MemberDto> memberList = 
    		(ArrayList<MemberDto>)request.getAttribute("memberList");
	
	for(MemberDto memberDto : memberList){
          %>
<!--    		expression -->
		<div style=" width : 230px; border: 1px solid black; border-collapse: collapse;">
		   	No.<%=memberDto.getNo()%>,
		    Mr.<%=memberDto.getName()%>,
		    <%=memberDto.getBanName()%> Director
		   	<br>
	   </div>
	   <%
	      }
	   %>
		
</body>

</html>