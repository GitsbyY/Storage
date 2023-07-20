<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	
	<style type="text/css">
	</style>
	
	<script type="text/javascript">
	
	</script>
</head>

<body>
	
	
	
</body>
<script type="text/javascript">
	
// 	String 객체

	var str = '문자열 다루기';
	
	document.write(str == '문자열 다루기');
	document.write('<br/>');
	document.write('<br/>');
	
	var newStr = new String('설마');
	
	document.write(newStr == '설마');
	document.write('<br/>');
	
	document.write(str === '문자열 다루기');
	document.write('<br/>');
	
	document.write(newStr === '설마');

	
// 	document.write(newStr.equals('설마')); 자바스크립트에는 equals가 없다
	
	
</script>
</html>






