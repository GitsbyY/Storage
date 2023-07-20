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
		

		function changeColor(e) {
			e.style.backgroundColor = 'yellow';
			e.style.borderRadius = '3px';
		}
		
		function backColor(e) {
			e.style.backgroundColor =  'white';
		}
		
	
		
		
	</script>
</head>

<body>
<!-- 	플레이스홀더 구현하기 -->
	
	Enter your name : 
	<input id='fistInput' type="text" onfocus="changeColor(this);" onblur="backColor(this);">

	<input id='secondInput' type="text" onfocus="changeColor(this);" onblur="backColor(this);">
	

</body>
<script type="text/javascript">
	
</script>
</html>