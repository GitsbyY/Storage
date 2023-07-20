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
	
	fBtnStr = '';
	sBtnStr = '';
	window.onload = function() {
		var fBtnObj = document.getElementById('fBtn')
		var sBtnObj = document.getElementById('sBtn')
		fBtnStr = fBtnObj.innerHTML;
		sBtnStr = sBtnObj.innerHTML;
		fBtnObj.addEventListener('click',fButton);
		sBtnObj.addEventListener('dblclick',sButton);
	
		function fButton() {
			alert(fBtnStr);
		}

		function sButton() {
			alert(sBtnStr);
		}
	
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