<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>javascriptBasic5</title>
<style type="text/css">
	
	div {
		border: 1px solid black;
/* 		height: 100px; */
	}
	
</style>

</head>



<body>
	<div style="border: 1px solid black;">
		
		<div>
			<span>국어</span><input type="text" id="firstNum" value="">
		</div>

		<div>
			<span>영어</span><input type="text" id="secondNum" value="">
		</div>
		
		<div>
			<span>수학</span><input type="text" id="thirdNum" value="">
		</div>
		
	</div>
	
	<div id='resultTag' style="border: 1px solid red;">
		총점 : ???		평균: ???(소수점 3번째 자리에서 내림)
	</div>

	<div style="border: 1px solid black;">
		<button id='runBtn' onclick="sumCalcFnc();">
			나 누르면 총점 
		</button>
		<button id='runBtn1' onclick="avgCalcFnc();">
			나 누르면 평균
		</button>
	</div>


</body>


<script type="text/javascript">
	
// 	var firstNumObj = document.getElementById('firstNum');
// 	var secondNumObj = document.getElementById('secondNum');
// 	var thirdNumObj = document.getElementById('thirdNum');
	
// 	var firstNum = Number(firstNumObj.value);
// 	var secondNum = Number(secondNumObj.value);
// 	var thirdNum = Number(thirdNumObj.value);
		
// 	자바에서는 method 자바스크립트에서는 함수
	function sumCalcFnc(){
		
		var firstNumObj = document.getElementById('firstNum');
		var secondNumObj = document.getElementById('secondNum');
		var thirdNumObj = document.getElementById('thirdNum');
		
		var firstNum = Number(firstNumObj.value);
		var secondNum = Number(secondNumObj.value);
		var thirdNum = Number(thirdNumObj.value);
		
		var sumResultNum = firstNum + secondNum + thirdNum;
		var resultTagObj = document.getElementById('resultTag');
		
// 		resultTagObj.textContent = sumResultNum;
// 		resultTagObj.innerHTML = sumResultNum;

// 		resultTagObj.textContent = '<p>'+ sumResultNum + '</p>';
		resultTagObj.innerHTML = '<p>'+ sumResultNum + '</p>';
		
	}
	
	function avgCalcFnc(){
		
		var firstNumObj = document.getElementById('firstNum');
		var secondNumObj = document.getElementById('secondNum');
		var thirdNumObj = document.getElementById('thirdNum');
		
		var firstNum = Number(firstNumObj.value);
		var secondNum = Number(secondNumObj.value);
		var thirdNum = Number(thirdNumObj.value);
		
		var sumResultNum = firstNum + secondNum + thirdNum;
		var avgResultNum = Math.floor(sumResultNum * 1000) / 1000;
		var resultTagObj = document.getElementById('resultTag');
		
// 		resultTagObj.textContent = sumResultNum;
// 		resultTagObj.innerHTML = sumResultNum;

// 		resultTagObj.textContent = '<p>'+ sumResultNum + '</p>';
		resultTagObj.innerHTML = avgResultNum;
		
	}
	
	
	
</script>

</html>




