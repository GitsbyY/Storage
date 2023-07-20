<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LocationTest1_2.jsp</title>
<style type="text/css">

	#btnTag {
		text-decoration: underline;
		color: purple;
	}
	
</style>
	
<script type="text/javascript">
	
	window.onload = function() {
		
		var aTagObj = document.getElementById('aTag');
		
		aTagObj.addEventListener('click', function(e) {
			alert('page1_2');
			event.preventDefault();
			location.href = './LocationTest1_1.jsp';
		});
		
	};	//문법이 들어가 있다. window.onlaod하면 닫아야한다. '=' 할당연산자가 있어서 닫아줘야 한다.
	
	
</script>
</head>

<body>
	<p id='btnTag'>여기가 다른 시작 페이지</p>
	
	<div style="border: 1px solid black;">
		<a id='aTag' href='https://www.msn.com/'>나 누루면 이전 페이지로 돌아감</a>
	</div>
	
</body>
</html>

