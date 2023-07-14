<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>GlobalLocalTest1</title>
<script type="text/javascript">
// 	numberingOtherFnc();  -->선언이 되어있지 않기 때문에 쓸 수 없다.
	
// 	alert(test); -->변수도 아래에 선언이 되어있기 때문에 사용 할 수 없다.
	
	var globalNum = 10;
	globalNum2 = 20;
	
	function numbering() {
		globalNum3 = 30;
		var localNum = 40;
		
		document.write('globalNum= ' + globalNum + "<br>");
		document.write('globalNum2= ' + globalNum2 + "<br>");
		document.write('globalNum3= ' + globalNum3 + "<br>");
		document.write('localNum= ' + localNum + "<br>");
		
	}
	
	numbering();
</script>

</head>
<body>

</body>

<script type="text/javascript">
	numbering();
	
// 	var test = '전역 변수는 선언하기 전에 사용 할 수 있을까?';
	
	function numberingOtherFnc() {
		document.write('아무곳에서나 선언하면 위 아래 상관없다' + "<br>");
	}
	
</script>

</html>