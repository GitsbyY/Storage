<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>2.FormDocumentWrite</title>
	
	<style type="text/css">
	table {
		border-collapse: collapse;
	}
	
	table,tr {
		border: 1px solid black;
	}
	</style>
	
	<script type="text/javascript">
	
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
<script type="text/javascript">

// 	var fNumObj = document.getElementById('fNum');
// 	var sNumObj = document.getElementById('sNum');
	
// 	var fNum = fNumObj.value;
// 	var sNum = sNumObj.value;
	
// 	fNum = Number(fNum);
// 	sNum = Number(sNum);
	
	var inputList = document.getElementsByTagName('input');
// 	var spanString = document.getElementById("spanTest");
// 	alert(spanString.value);
	function age() {
		
		var spanStringObj = document.getElementById("spanTest");
		var myAge = inputList[0].value;
		myAge = Number(myAge);
		if(myAge.isNaN == true){
			spanStringObj.innerHTML = '숫자로 입력 해 주시길 바랍니다.';
		}else{
			spanStringObj.innerHTML = '제 나이는' + myAge + '입니다';
		}
		
	}
</script>
</html>