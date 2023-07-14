<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JavascriptStringTest4.jsp</title>
</head>

<body>

	<div id='printTag' style='border: 1px solid black;'>
		
	</div>


</body>

<script type="text/javascript">
	var fixStr = 'thank psu Very MUCH';
// 	출력: THANK YOU very much!!	

	var divObj = document.getElementById('printTag');
	var fixStrList = fixStr.split(" ");
	
// 	document.write(fixStrList[0]);
// 	document.write('<br/>');
// 	document.write(fixStrList[1]);
// 	document.write('<br/>');
// 	document.write(fixStrList[2]);
// 	document.write('<br/>');
// 	document.write(fixStrList[3]);
	
	fixStrList[0] = fixStrList[0].toUpperCase();
	fixStrList[1] = fixStrList[1].replace("psu","YOU");
	fixStrList[2] = fixStrList[2].toLowerCase();
	fixStrList[3] = fixStrList[3].toLowerCase();
	
	var finalStr = fixStrList[0]+' '+fixStrList[1]+' '+fixStrList[2]
	+' '+fixStrList[3]+'!!';
	
	divObj.innerHTML = finalStr;
	
// 	슬라이스와 substring의 차이
// 	슬라이스는 배열을 분리하는 것
// 	substring은 문자열을 분리하는 것
</script>

</html>

