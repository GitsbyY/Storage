<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JavascriptFunctionTest4.jsp</title>
</head>

<body>

	<div id='randomColor'>
		 나의 배경색을 변경해줘
	</div>

</body>

<script type="text/javascript">

	var colorDivObj = document.getElementById('randomColor');

	var randomColorCode = "#" + Math.floor(Math.random() * 0xffffff).toString(16);

	alert(randomColorCode);
	
	onclickUseFnc(randomColorCode);
	
	function onclickUseFnc(randomColorCode) {
		colorDivObj.style.backgroundColor = randomColorCode;
	}
	
	
// 	var pickColor = [ 'yellow', 'red', 'blue', 'green', 'hotpink' ];

// 	var colorNum = parseInt(Math.random() * pickColor.length);
// 	var divList = document.getElementsByTagName('div');

// 	//	    console.log(colorNum);
// 	//	    console.log(pickColor[colorNum]);
// 	onclickUseFnc(colorNum);

// 	function onclickUseFnc(colorNum) {

// 		divList[0].style.backgroundColor = pickColor[colorNum];

// 	}
</script>

</html>

