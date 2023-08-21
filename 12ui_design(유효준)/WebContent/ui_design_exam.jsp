<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<style type="text/css">
	table, tr, td {
		border: 1px solid black;
		border-collapse: collapse;
	}

	table {
		width: 240px;
	}
	
	#businessCardDiv{
		border: 1px solid black;
		width: 300px;
		height: 180px;
	}
	
	</style>


<title>개인 정보 등록하기</title>

<script type="text/javascript">
	
// 	var inputList = document.getElementsByTagName("input");
// 	for (var i = 0; i < inputList.length-1; i++) {
// 		inputList[i].style.width = "130px";
// 	}

	function businessCardMakeFnc() {
	
		var inputList = document.getElementsByTagName("input");

		var businessCardDiv = document.getElementById('businessCardDiv');

		
		if (inputList[1].value == "") {
			alert("이름을 입력해주세요");
		} else {

			businessCardDiv.children[0].innerHTML = inputList[0].value;

			businessCardDiv.children[1].innerHTML = inputList[1].value;

			businessCardDiv.children[2].innerHTML = inputList[2].value;

			businessCardDiv.children[3].innerHTML = inputList[3].value;

			businessCardDiv.children[4].innerHTML = inputList[4].value;

		}

	};

</script>
</head>

<body>

	<form action="#" method="get">
		<table>
			<tr>
				<td>회&nbsp;사&nbsp;명</td>
				<td><input type="text" name="companyName"></td>
			</tr>
			<tr>
				<td>이&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;름</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>메&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;일</td>
				<td><input type="text" name="mail" value=""></td>
			</tr>
			<tr>
				<td>주&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;소</td>
				<td><input type="text" name="addr"></td>
			</tr>
			<tr>
				<td>전&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;화</td>
				<td><input type="text" name="tel" maxlength="13"></td>
			</tr>
		</table>
		<input type="button" style="width: 100px;" value="명함 만들기"
			onclick="businessCardMakeFnc();">
	</form>

	<h2>명함</h2>
	<div id='businessCardDiv'>
		<div></div>
		<div></div>
		<div></div>
		<hr style="background-color: gray;">
		<div></div>
		<div></div>
	</div>

</body>

</html>