<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>ELTest1</title>

	<script type="text/javascript">
	
	</script>
</head>

<body>
	
	<%
		ArrayList<String> listA = new ArrayList<String>();
		listA.add("손진원");
		listA.add("조남용");
		listA.add("임찬우");
		listA.add("박지훈");
		listA.add("임정빈");
		request.setAttribute("listAE", listA);
		request.setAttribute("nameList", new String[]{"손진원","임찬우","박지훈","조남용","임정빈"});
	%>
	
	
	
	<c:forEach var="test" items="${nameList}">
		<div>
			${test}
			<hr>
		</div>
	</c:forEach>
	
	<c:forEach var="test1" items="${listAE}">
		<div>
			${test1}
			<hr>
		</div>
	</c:forEach>
	
	
	
	
</body>

</html>