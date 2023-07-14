<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>유효준 실습2</title>

<style type="text/css">

	#adaptSel{
		height: 40px;
		width: 100px;
		font-size: 20px;
	}
	#adaptSel option{
		background-color: black;
		color: white;
	}

</style>

</head>

<body>
	<br/>
	<br/>
	<h1>시험문제2</h1>
	<form action="#">
  		<label for="young">셀렉박스 css적용 되면 안된다:</label>
		  <select name="origin" id="originSel">
		    <option value="옵션1">옵션1</option>
		    <option value="옵션2">옵션2</option>
		    <option value="옵션3">옵션3</option>
		    <option value="옵션4">옵션4</option>
		  </select>
		  <br/>
		  <br/>
		  <br/>
		  <br/>
		  <br/>
		  <label for="old">셀렉박스 css적용시킨다:</label>
		  <select name="adaptCSS" id="adaptSel">
		    <option value="옵션1">옵션1</option>
		    <option value="옵션2">옵션2</option>
		    <option value="옵션3">옵션3</option>
		    <option value="옵션4" selected="selected">옵션4</option>
		  </select>
	</form>
	
</body>
<script type="text/javascript">
	
</script>
</html>