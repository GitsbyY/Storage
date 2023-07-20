<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DomEventBasic4</title>

<style type="text/css">
	#rootDiv {
		border: 5px solid red;
		padding: 30px;
	}
	
	#parentP {
		border: 5px solid green;
		padding: 30px;
	}
	
	#childLink {
		border: 5px solid black;
		padding: 30px;
	}
	
	#parentP2 {
		border: 5px solid green;
		padding: 30px;
		margin-top: 10px;
	}
	
	#childBtn2 {
		border: 5px solid black;
		padding: 30px;
	}
</style>

<script type="text/javascript">
	
	function rootDivFnc() {
		alert('rootDiv');
	}
	function parentPFnc() {
		alert('parentP');
	}
	function childLinkFnc() {
		alert('childLink');
// 		특별한 태그의 기본 이벤트를 막는 기술, 즉 수행을 하지 않는다.
// 		event.preventDefault(); //->기본값을 막는다.
		//->a태그는 href값만 주면 마우스 왼쪽 클릭이  기본값을 지니고 있는데, 그걸 막는다.
// 		전파 금지
		event.stopPropagation();
		
	}
	
// 	버블업 방식?	전파?
// 	캡처링 방식?
// 	버블링을 막자?
	
	window.onload = function () {
		
		
		//true 와 false 에 따라서 수행 순서가 달라진다.
		//본래는 false다. false라면 나부터 시작해서 멀어진다.
		var rootDivObj = document.getElementById('rootDiv');
		rootDivObj.addEventListener('click', rootDivFnc);
		
		var parentPObj = document.getElementById('parentP');
		parentPObj.addEventListener('click', parentPFnc);
	
		var childLinkObj = document.getElementById('childLink');
		childLinkObj.addEventListener('click', childLinkFnc);
		
	}
	
</script>
</head>

<body>

	rootDiv
	<div id='rootDiv'>
		parentP
		<p id='parentP'>
			<a id='childLink' href="https://www.w3schools.com/">
				새로운 페이지로 이동
<!-- 				a태그는 새로운 페이지로 이동하는 것이 기본값(default)이다. -->
			</a> 
		</p>
	</div>


</body>

</html>