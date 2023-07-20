<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>DomEventBasic2</title>
	<link type="text/css" rel="stylesheet"  
      href="./css/DomEventBasic1.css">
	<style type="text/css">

	</style>

	<script type="text/javascript">
// 	지연 로딩, lazy
	window.onload = function() {
		var myBtnObj = document.getElementById('myBtn')
// 		myBtnObj.onclick = myNameFnc;
// 		myBtnObj.onclick = namelessObj; 
// 					-> 할당은 마지막에 된 것만 작동한다.
		
// 		그래도 현업에서 사용하는 이벤트 등록방식
// 		표준 이벤트 등록 방식					3번째 생략하면 false
// 		이벤트대상.addEventListener('이벤트명, 함수명, false)
		myBtnObj.addEventListener('click',myNameFnc);
		myBtnObj.addEventListener('click',namelessObj);
// 					->이벤트 리스너로 등록을 하면 상관없이 작동한다.
	}
// 	수행 시점의 문제?
		var myBtnObj = document.getElementById('myBtn')
		
// 		이름있는 함수
		function myNameFnc() {
			alert('이름이 있는 메서드를 새로 등록한 것.');
		}
// 		람다식에서 나온  개념 : 익명함수
		var namelessObj = function() {
			alert('이름이 없는 메서드');
		}
		
// 		myNameFnc();
// 		();//익명함수는 어떻게 호출하지?
		namelessObj();
	</script>
	
</head>

<body>


	<div id='eventTest'>
		이걸 이제 알게 된다.
	</div>
	<button id='myBtn'>
		새로운 이벤트 연결
	</button>

</body>
<script type="text/javascript">
	
</script>
</html>