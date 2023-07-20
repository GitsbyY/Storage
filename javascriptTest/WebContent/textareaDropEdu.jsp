<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	
	<style type="text/css">
		div {
			background-color: rgb(241, 196, 15);
			width: 750px;
			height: 455px;
		}
		#btn {
			background-color: rgb(52, 152, 219);
			width: 105px;
			height: 36px;
			border-radius: 10px;
			color: rgb(255, 255, 255);
			border: none;
			margin-left: 50px;
			margin-top: 50px;
		}
		#textarea {
			width: 300px;
			height: 60px;
			background-color: rgb(255, 255, 255);
			margin-left: 300px;
			margin-top: -50px;
			border-radius: 5px;
			padding-top: 8px;
			padding-left: 8px;
		}
		#originSel {
			margin-left: 300px;
			width: 305px;
			height: 40px;
			margin-top: 30px;
		}
	</style>
	
	<script type="text/javascript">
	
	</script>
</head>

<body>
	<div>
		<button id='btn'>button</button>
		<textarea id="textarea" name="textarea">textarea로 문자열 입력가능</textarea>
		<br/>
		<select name="dropSelect" id="originSel">
		    <option selected="selected" hidden="">날씨</option>
		    <option> 집중호우</option>
		    <option> 장마</option>
		 </select>
	</div>
</body>
<script type="text/javascript">
	
</script>
</html>