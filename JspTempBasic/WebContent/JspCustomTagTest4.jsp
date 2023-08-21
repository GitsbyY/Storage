<%@page import="ezen.com.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JspCustomTagTest4</title>

<script type="text/javascript">
	
</script>
</head>

<body>

<%-- 	<c:forEach begin="1" end="6" step="1" varStatus="i"> --%>
<!-- 		<h1></h1> -->
<%-- 	</c:forEach> --%>
<%-- 	<c:if test="${i%2 == 0}" var="result"> --%>
<!-- <!-- 				나머지 영 --> -->
<%-- 	</c:if> --%>


<%-- 	${pageScope.result} --%>

	<%
 		pageContext.setAttribute("numArr", new int[] { 1, 2, 3, 4, 5, 6 }); 
 	%> 

	<c:forEach var="tagNum" items="${numArr}">
		<c:if test="${tagNum % 2 == 1}" var="result">
			<div style="border: 1px solid red;">
				<h ${tagNum}>${100 * tagNum}</h${tagNum}>
			</div>
		</c:if>
		
		<c:if test="${tagNum % 2 == 0}" var="result">
			<div style="border: 1px solid blue;">
				<h ${tagNum}>${100 * tagNum}</h${tagNum}>
			</div>
		</c:if>
		<br>
	</c:forEach>

		${pageScope.result2}

		<c:if test="조건" var="변수명" scope="변수를 담을 장소">
				조건이 맞으면 수행 될 내용들
		</c:if>

</body>

</html>