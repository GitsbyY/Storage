<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>ParentWindowBasic2</title>
	
	<style type="text/css">
		#temp{
			background: #ff0064;
		}
	</style>

<script type="text/javascript">
	var optionStr = '';
	optionStr =	'width=400px, height=550px, left=200px, top=20px';
	optionStr += ', scrollbars=no, toolbar=no, location=no';
	
	var staticWinObj = null;
	
	function childWinCallFnc() {
		staticWinObj = 
			window.open("./ChildWindowBasic2.jsp","myWindow",optionStr);
	}
	
	function sendChildFnc() {
		
		var userInputObj = document.getElementById('userInput');
		
		var childInputObj = staticWinObj.document.getElementById('childInfo');
		
		childInputObj.value = userInputObj.value;
	}
	

</script>
</head>

<body>
	
	<h1 onclick="popUpFnc();">Parent</h1>
	
	<div>
		
		<input type='text' id='userInput' value=''>
		
		<input type='button' id='temp'
			onmouseleave="childWinCallFnc();" value='오픈업!'>

	</div>
	
	<button onclick="sendChildFnc();">
		내가 눌리면 부모값이 자식으로 전달 된다
	</button>
	
</body>

</html>




