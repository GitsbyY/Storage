
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>오류</title>
	
	<style type="text/css">
	</style>
	
	<script type="text/javascript">
	
	</script>
</head>

<body>
	
	<%=(String)request.getAttribute("msg")%>
	<p>
		요청을 처리하는데 문제가 생겼습니다.
		입력된 주소가 정확하지 않거나
		페이지가 삭제 되었을 수 있습니다
		주소를 다시 확인해주세요
		만약 계속해서 이 문제가 발생된다면 시스템 운영팀(사내번호: 8282)에
		문의부탁드립니다.
	</p>
	
	
</body>

</html>