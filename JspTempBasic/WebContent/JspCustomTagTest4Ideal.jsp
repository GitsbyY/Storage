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
 
         <c:forEach var="i" begin="1" end="6">
         	<c:if test='${i % 2 == 0}'>
            	<h${i} style="border:1px solid blue;"> ${i*100}</h${i}>
            	<br>
         	</c:if>
         	<c:if test='${i % 2 != 0}'>
            	<h${i} style="border:1px solid red;"> ${i*100}</h${i}>
            	<br>
        	 </c:if>
         </c:forEach>
         
</body>

</html>

