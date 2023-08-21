<%@page import="spms.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>회원정보</title>
</head>
<body>
	<jsp:useBean 
	id="memberDto"
	scope="session"
	class="spms.dto.MemberDto"/>      
	
	<h1>회원정보 수정</h1>
	<form action='./update' method='post'>
		번호 : <input type='text' name='mNo' value='<%=memberDto.getNo()%>' readonly='readonly'><br>
		이름 : <input type='text' name='name' value='<%=memberDto.getName()%>'><br>
		이메일 : <input type='text' name='email' value='<%=memberDto.getEmail()%>'><br>
		<input type='submit' value='저장'>
		<input type='button' value='삭제' onclick="location.href='./delete?no=mNo'">
		<input type='reset' value='최소' onclick="location.href='../member/list'">
	</form>
</body>
</html>