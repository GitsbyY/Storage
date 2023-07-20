<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>newEventAddTest1</title>
	
	<style type="text/css">

	</style>

	<script type="text/javascript">
	window.onload = function() {
		var fBtnObj = document.getElementById('fBtn')
		var sBtnObj = document.getElementById('sBtn')

		fBtnObj.addEventListener('click',gotNameFnc);
		sBtnObj.addEventListener('dblclick',namelessObj);
	}
	function gotNameFnc() {
		alert('이름이 있는 거 출력.');
	}

	var namelessObj = function() {
		alert('이름없이 만든 거 출력');
	}

	</script>
	
</head>

<body>

	<button id='fBtn'>버튼1</button>
	<button id='sBtn'>버튼2</button>

</body>
<script type="text/javascript">
	
</script>
</html>