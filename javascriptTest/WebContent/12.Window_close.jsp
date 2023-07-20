<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<script type="text/javascript">
	
</script>
<style type="text/css">
	img {
		width: 300px;
		height: 300px;
	}
	
	#rootContainer {
	    margin: auto;
	    width: 50%;
	    border: 3px solid green;
	    padding: 10px;
	}
</style>
<script type="text/javascript">
	
	function dateshow(){
		var day = new Date();
		var inputObj = document.getElementById('childInfo');
		
		var dateStr = (day.getMonth()+1)+"/"+day.getDate()
			+"/"+(day.getYear()+1900);
		
		inputObj.value = day;
	}
	
	function sendParent(){
		var childObj = document.getElementById('childInfo');
		
		var parentObj = 
			window.opener.document
			.getElementById('parentInfo');
		
		parentObj.innerHTML = childObj.value;
		
	}
</script>
</head>
<body onLoad="dateshow()">
	<div id='rootContainer'>
		<img src="./images/1.jpg">
		<form>
			<input type="button" value="부모창 정보 전달" onclick="sendParent();">
			<input type="text" id='childInfo' value="부모창으로 정보 전달">
		</form>
	</div>
</body>
</html>