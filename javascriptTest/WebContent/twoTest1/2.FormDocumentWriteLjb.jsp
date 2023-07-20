<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>

<style type="text/css">
	table {
		border: 1px;
	}
</style>

<script type="text/javascript">
// 	var spanObj = document.getElementById('spanTest');
// 	alert(spanObj);
</script>
</head>
<body>
	<form>
		<table>
			<tr>
				<td>
					<input type="text" name="st">
					<input type="button" value="당신의 나이는?" onclick="age();">
				</td>
			</tr>
			<tr>
				<td>	<!-- spanTest는 null이 뜬다. (바디 위에 있었기 때문이다)-->
						<!-- 이제는 바디 위에 스크립트를 항상 먼저 짠다. -->
					<span id="spanTest">이곳에 '제 나이는 ?? 입니다' 라고 출력하시오</span>
				</td>
			</tr>
		</table>
	</form>
</body>

<script type="text/javascript">
	var spanObj = document.getElementById('spanTest');
	alert(spanObj);
</script>

</html>