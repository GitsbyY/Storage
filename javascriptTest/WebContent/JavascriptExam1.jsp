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
		

		function checkPlaceholder() {
			var passwordObj = document.getElementById('password');
			if(passwordObj.value == ''){
				passwordObj.value = "비밀번호를 입력하세요.";
			}
		}
		
		
		function keyDown() {
			var passwordObj = document.getElementById('password');
			passwordObj.setAttribute('value', "");
		}
		
	</script>
</head>

<body>
<!-- 	플레이스홀더 구현하기 -->

	<input type="text" value="" placeholder="아이디를 입력해주세요.">
	
	<hr>
	<hr>
	
	<input id='password' type="text" value="비밀번호를 입력해주세요." 
		onkeydown="keyDown();" onblur="checkPlaceholder();">
	

</body>
<script type="text/javascript">
	
</script>
</html>