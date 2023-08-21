<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>유효준</title>
</head>

<body>

</body>

<script type="text/javascript">
	
	var x = 10;
	console.log('1. 전역변수 x: ' + x);
	
	function checkListFnc() {
		var x = 5;
		var checkLocalVar = x;
		console.log('2. checkListFnc 지역변수 x: ' + checkLocalVar)	
		return x;
	
	}
	
	checkListFnc();
	console.log('3. 반환값 x: ' + x);
	console.log('반환값 변수의 범위: 전역변수');
	
	
</script>

</html>