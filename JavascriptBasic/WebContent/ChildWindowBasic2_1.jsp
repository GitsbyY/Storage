<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>ChildWindowBasic2</title>
	
	<style type="text/css">
		*{margin:0; padding:0;}
	</style>
	
	<script type="text/javascript">
		function sendParentFnc() {
			
			var childObj = document.getElementById('childInfo');
			
			var parentObj 
				= window.openner.document.getElementById('userInput');
			
			parentObj.value = childObj.value;
			
			window.close();
		}
	</script>
</head>

<body>
	
	<div id='rootContainer'>
		<form action="">
			<input type='button' onclick="sendParentFnc();" 
				value='부모창 정보 전달'>
				
			<input type='text' id='childInfo' placeholder="엄마?">
		</form>S
	</div>
	
	<div id='closeWinDiv' onclick="sendParentFnc();">
		팝업창 닫기(자식창 닫기)
	</div>
	
</body>

</html>