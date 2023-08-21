<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>회원등록</title>
	
	<style type="text/css">
	</style>
	
	<script type="text/javascript">
	
	</script>
</head>

<body>
		
		
		<h1>회원등록</h1>
<!-- 	//a Tag, location Tag, form Tag 는 화면 전환이 된다. -->
<!-- 	//그 중에서 form은 데이터를 가지고 이동하는 태그이다. -->
<!-- 							//doPost를 호출한다. -->
		<form action='add' method='post'>
		이름 : <input type='text' name='name'><br>
		이메일 : <input type='text' name='email'><br>
		암호 : <input type='password' name='password'><br>
<!-- 				//submit을 사용하면 사용자의 인풋이 같이 넘어간다. -->
		<input type='submit' value='추가'>
		<input type='reset' value='취소' onclick="location.href='../member/list'">
		</form>

</body>

</html>