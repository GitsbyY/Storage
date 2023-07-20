<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>window_open()</title>
<script type="text/javascript">
	var optionStr = '';
	optionStr =	'width=400px, height=550px, left=200px, top=20px';
	optionStr += ', scrollbars=no, toolbar=no, location=no';
	
	
	function childWinCallFnc() {
		window.open("./12.Window_close.jsp","myWindow",optionStr);
	}

	function mover() {
		var todayToYear = document.getElementById('parentInfo');
		var today = new Date();
		todayToYear.innerHTML = today;
	}
	
</script>
</head>

<body onLoad="alert('이미지에 마우스를 올려보세요')">
	
	<img src="./images/img2.jpg" onmouseover="mover();" hspace="100" vspace="200">
	
	<div id='parentInfo'>
		현재 월/일/년도가 이곳에 나오도록 하시오.
		ex) 11/28/2016
	</div>
</body>
</html>