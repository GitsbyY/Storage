<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>newEventAddTest2</title>
	<style type="text/css">

	</style>

	<script type="text/javascript">
	
	window.onload = function() {
		
		var inputObj = document.getElementsByTagName('input');
		var inputBtn = inputObj[0];
		var fBtnObj = document.getElementById('fBtn')

		fBtnObj.addEventListener('click', function() {
			inputBtn.setAttribute('value', 'click');
			inputBtn.setAttribute('style', 'border : 1px solid red;');
		});
	
	}


	</script>
	
</head>

<body>
	<input type="button">
	
	<button id='fBtn'>
		날 누르면 위에있는 인풋 태그의 글자가 click이라고 뜸
		경계선도 1px 원하는 색상으로 변경됨
		익명함수 이벤트리스너
	</button>

</body>
<script type="text/javascript">
	
</script>
</html>