<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>JavascriptExam1</title>
	
	<style type="text/css">
	</style>
	
	<script type="text/javascript">
		

		function changeColor() {
			var fistInputObj = document.getElementById('fistInput');
			fistInputObj.style.backgroundColor = 'yellow';
			fistInputObj.style.borderRadius = '3px';
		}
		
		
		function backColor() {
			var fistInputObj = document.getElementById('fistInput');
			fistInputObj.style.backgroundColor = 'white';
		}
		
		function changeSecColor() {
			var secondInputObj = document.getElementById('secondInput');
			secondInputObj.style.backgroundColor = 'yellow';
			secondInputObj.style.borderRadius = '3px';
		}
		
		
		function backSecColor() {
			var secondInputObj = document.getElementById('secondInput');
			secondInputObj.style.backgroundColor = 'white';
		}
		
		
	</script>
</head>

<body>
<!-- 	플레이스홀더 구현하기 -->
	
	Enter your name : 
	<input id='fistInput' type="text" onfocus="changeColor();" onblur="backColor();">

	<input id='secondInput' type="text" onfocus="changeSecColor();" onblur="backSecColor();">
	

</body>
<script type="text/javascript">
	
</script>
</html>