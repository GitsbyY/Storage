<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>ParentWindowTest1</title>
	
<!-- 	window객체는 모든 객체의 최상위 객체이다 -->
<!-- 	새 창을 생성하는 역할등을 한다 -->
<!-- 	팝업 기능? -->

	<script type="text/javascript">
	
		
// 		새창을 여는데 옵션은 가로 500
// 		세로 600의 값이다
		var optionStr = '';
		optionStr =	'width=500px, height=600px, left=200px, top=20px';
		optionStr += ', scrollbars=no, toolbar=no, location=no';
		function popUpFnc() {
			window.open("./ChildWindowTest1.jsp","myWindow",optionStr);
		}
	</script>

</head>

<body>
	<h1>
		여기서 브라우저가 시작되는데
		이미지를 클릭하면 팝업창이 열린다
	</h1>
	
	<img onclick="popUpFnc();" src="./images/1.jpg">
	
</body>
</html>

