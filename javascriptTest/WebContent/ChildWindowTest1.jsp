<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>ChildWindowTest1</title>
	<style type="text/css">
		*{ 
			margin:0; padding:0;
		}
		#popUp{
			border: 1px solid black;
			width : 200px;
			background-color: red;
			font: bold;
		}
	</style>
	
	<script type="text/javascript">
		function closeWinFnc() {
			window.close();
		}
	
	</script>

</head>

<body>
	
	<h1>여기는 자식창이라고 부른다</h1>
	
	<div id='popUp'onclick="closeWinFnc();">팝업창 닫기(자식창 닫기)</div>
	
</body>
</html>

