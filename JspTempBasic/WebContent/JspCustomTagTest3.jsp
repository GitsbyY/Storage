<%@page import="java.util.ArrayList"%>
<%@page import="ezen.com.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JspCustomTagBasicTest3</title>
	
	<script type="text/javascript">
		
	</script>
</head>
<body>
	
	<jsp:include page="./Header.jsp"/>
	<%	
		ArrayList<MemberDto> memberList = 
			(ArrayList<MemberDto>)request.getAttribute("memberList");
	%>
	
	<%
		for(MemberDto myList : memberList){
	%>		
		<div style="border: 1px solid pink;">
			번호 : <%=myList.getNo() %> 
			이름 : <%=myList.getName() %> 
			반이름 : <%=myList.getBanName() %>
		</div>
	<%
		}
	%>
	<jsp:include page="./Tail.jsp"/>
</body>
</html>