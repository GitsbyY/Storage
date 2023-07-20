<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>checkboxBasic</title>
	
	<style type="text/css">
	
		div{
			border: 1px solid black;
			margin-bottom: 20px;
		}
	
	</style>
		
	<script type="text/javascript">
	
	</script>
</head>

<body>
	<div>
		<form action="/action_page.php">
		  <p>Please select your favorite Web language:</p>
		  <input type="checkbox" id="html" name="fav_language" value="HTML">HTML
		  <input type="checkbox" id="css" name="fav_language" value="CSS">CSS
		  <input type="checkbox" id="javascript" name="fav_language" value="JavaScript">JavaScript
<!-- 	자바를 삽입했는데 그룹으로 이어지지 않았다. why? name이라는 그룹이 빠져있어서! -->
<!-- 	그룹을 넣어주면(name을 넣어주면) 하나의 그룹으로 작동한다 -->
		  <input type="checkbox" name="fav_language" value='자바'>자바?
		</form>
	</div>
	<div>
		<p>Please select your age:</p>
		<input type="checkbox" id="age1" name="age" value="30">30
		<input type="checkbox" id="age2" name="age" value="60">60
		<input type="checkbox" id="age3" name="age" value="100">100
		<input type="submit" value="Submit">
	</div>
</body>
<script type="text/javascript">
	
</script>
</html>