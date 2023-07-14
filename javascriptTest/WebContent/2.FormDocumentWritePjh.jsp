<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>2.FormDocumentWrite</title>

<style type="text/css">
	table tr td {
		border: 1px solid black;
	}
	table {
		border-collapse: collapse;
	}	
</style>

<script type="text/javascript" src="./js/ex2Js.js"></script>

<script type="text/javascript">

	var inputObj = document.getElementsByTagName('input')[0];
	function age() {
		newExternalFnc();
	}

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
				<td>
					<span id="spanTest">이곳에 '제 나이는 ?? 입니다' 라고 출력하시오</span>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>