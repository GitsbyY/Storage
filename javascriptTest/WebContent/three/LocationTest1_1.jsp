<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LocationTest1_1.jsp</title>
<style type="text/css">
</style>

<script type="text/javascript">
	window.onload = function() {
		var pageChangeBtnObj
			= document.getElementById('pageChangeBtn');
		pageChangeBtnObj.addEventListener('click', function(e) {
			alert('page1_1');
			location.href = './LocationTest1_2.jsp';
	});
};
</script>
</head>

<body>
	<p>여기가 원래 시작 페이지</p>
	<button id='pageChangeBtn'>
		나 누루면 LocationTest1_2.jsp 이동함
	</button>
	
</body>
</html>

