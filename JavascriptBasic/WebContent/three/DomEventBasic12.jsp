<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>DomEventBasic12</title>
	<style type="text/css">
		
	</style>
	
	<script type="text/javascript">
	
// 	@브라우저 객체의 종류
// 	window
// 		location	위치(url)고나련 정보를 제공하는 객체
// 		history		인터넷 방문 기록에 대한 정보를 제공하는 객체
// 						(가능하면 사용 금지)

	
	</script>
</head>

<body>
	
	<h1>세번째이자 마지막이라고 하자</h1>
	
	<div>
	
		<input type="button" value="이전 페이지 이동"
			onclick="history.back();">
		<input type="button" value="다음 페이지 이동"
			onclick="history.go();">
		<input type="button" value="foward버튼?"
			onclick="history.foward();">
	</div>
	
	
</body>

</html>