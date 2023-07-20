<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DomEventBasic3</title>

<style type="text/css">
	#rootDiv {
		border: 5px solid red;
		padding: 30px;
	}
	
	#parentP {
		border: 5px solid green;
		padding: 30px;
	}
	
	#childBtn {
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
	function childBtnFnc() {
		alert('childBtn');
	}
	
	window.onload = function () {
		
		
		//true 와 false 에 따라서 수행 순서가 달라진다.
		//본래는 false다. false라면 나부터 시작해서 멀어진다.
		var rootDivObj = document.getElementById('rootDiv');
		rootDivObj.addEventListener('click', rootDivFnc, true);
		
		var parentPObj = document.getElementById('parentP');
		parentPObj.addEventListener('click', parentPFnc, true);
		
// 		parentPObj.addEventListener("", function(e) {
// 		}, capture)
		
		
		var childBtnObj = document.getElementById('childBtn');
		childBtnObj.addEventListener('click', childBtnFnc, true);
		
	}
	
</script>
</head>

<body>

	rootDiv
	<div id='rootDiv'>
		parentP
		<p id='parentP'>
			<button id='childBtn'>버튼1</button>
		</p>
	</div>


</body>

</html>