<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>EventTest2</title>
</head>

<body>
	
<!-- 	onclick 이벤트 -->
	

	<form action="">
<!-- 		나한테 포커스 되면 배경색이 노래져 -->
		<input> 나는 글자 입력이 가능해
	</form>
	
	<input type="button" value="나 마우스 더블 클릭하면 위에 글자 값이 경고창에 출력 됨">
	
</body>

<script type="text/javascript">
	
	//이벤트 분리형 방식
// 	var formList = document.getElementsByTagName('form');
	
	var inputList = document.getElementsByTagName('input');
	inputList[0].setAttribute('type', 'text');
	
	
	function doubleClickFnc() {
		alert(inputList[0].value);
	}
	
	function focusFnc() {
// 		inputList[0].setAttribute('style', 'background-color : yellow;');
		inputList[0].style.backgroundColor = yellow;
// 		formList[0].style.backgroundColor = "yellow";
	}
	
	
	inputList[0].onfocus = focusFnc;
	inputList[1].ondblclick = doubleClickFnc;
	
	
	
// 	//button에 onclick을 넣은 것과 동일하다. ()를 넣으면 호출이다. 실행이 아니다.
// 	theBtnObj.onclick = tempFnc;
	
</script>

</html>

