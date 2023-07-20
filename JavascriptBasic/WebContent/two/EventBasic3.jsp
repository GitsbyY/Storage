<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>EventBasic3</title>
</head>

<body>
	
<!-- 	onclick 이벤트 -->
	
	<button id='theBtn'>
		check
	</button>
	
	
	
</body>

<script type="text/javascript">
	
	//이벤트 분리형 방식
	
	function tempFnc() {
		alert('또 다른 이벤트 등록 방법');
	}
	
	var theBtnObj = document.getElementById('theBtn');
	//button에 onclick을 넣은 것과 동일하다. ()를 넣으면 호출이다. 실행이 아니다.
	theBtnObj.onclick = tempFnc;
	
</script>

</html>

