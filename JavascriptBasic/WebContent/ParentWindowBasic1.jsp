<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>ParentWindowBasic1</title>
	
	<style type="text/css">
	
	</style>
<!-- 	window 객체는 모든 객체의 최상위 객체이다 -->
<!-- 	새 창을 생성하는 역할등을 한다 -->
<!-- 	팝업기능? -->
	<script type="text/javascript">
	var optionStr = '';
	optionStr =	'width=400px, height=550px, left=200px, top=20px';
	optionStr += ', scrollbars=no, toolbar=no, location=no';
	
// 	새 창으로 문서를 열 때 사용
// 	open('경로','window 이름','옵션들');
	
//  window.open("./ChildWindowBasic1.jsp","myWindow",optionStr);
// 	window.open("https://www.naver.com/","naver",optionStr);
	
	function popUpFnc() {
			//open이 있으면 내가 부모고 새로 만들어지는 페이지가 자식이다 라고 만들었다
			//사람들은 popup창이라고 부른다.
		window.open("./ChildWindowBasic1.jsp","myWindow",optionStr);
	}

	</script>
</head>

<body>
	<h1 onclick="popUpFnc();">오프너페이지</h1>
</body>

</html>