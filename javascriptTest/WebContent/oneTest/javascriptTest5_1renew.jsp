<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>javascriptTest5renew</title>
	
	
</head>

<body>

	<div style="border: 1px solid black;">
		<div>
			<span>국어</span><input type="text" id="korNum" value="">
		</div>
		<div>
			<span>영어</span><input type="text" id="engNum" value="">
		</div>
		<div>
			<span>수학</span><input type="text" id="mathNum" value="">
		</div>
	</div>
	<br>
	
	<div id='resultTag' style="border: 1px solid red;">
		<span id='sumTag'>총점: ???</span>	<span id='avgTag'>평균: ???</span>
	</div>
	
	<br>
	<div style="border: 1px solid black;">
		<button id='runSumBtn' onclick="threeSumFnc();">
			나 누루면 총점 나옴
		</button>
		<button id='runAvgBtn' onclick="sumAvgFnc();">
			나 누루면 평균 나옴
		</button>
	</div>
</body>

<!-- 총 input 3개를 통해서 국영수 점수를 입력받는다 -->
<!-- 각 버튼을 누루면 -->
<!-- 총점과 평균을 구하시오 -->

<script type="text/javascript">
// method
// 함수
	
	function threeSumFnc(){
		
		var firstNumObj = document.getElementById('korNum');
		var secondNumObj = document.getElementById('engNum');
		var thirdNumObj = document.getElementById('mathNum');

		var firstNum = Number(firstNumObj.value);
		var secondNum = Number(secondNumObj.value);
		var thirdNum = Number(thirdNumObj.value);
		
		var sumResultNum = firstNum + secondNum + thirdNum;
		
		var resultSumTagObj = document.getElementById('sumTag');
	
		resultSumTagObj.innerHTML = '총점: ' + sumResultNum;
		
	}
	
	function sumAvgFnc(){
		var firstNumObj = document.getElementById('korNum');
		var secondNumObj = document.getElementById('engNum');
		var thirdNumObj = document.getElementById('mathNum');

		var firstNum = Number(firstNumObj.value);
		var secondNum = Number(secondNumObj.value);
		var thirdNum = Number(thirdNumObj.value);
		
		var sumResultNum = firstNum + secondNum + thirdNum;
		var avgResultNum = sumResultNum/3;
		var floorNum = Math.floor((avgResultNum) * 100) / 100
		var resultAvgTagObj = document.getElementById('avgTag');
		resultAvgTagObj.innerHTML = '평균 : ' + floorNum;
		
	}
	

</script>

</html>


