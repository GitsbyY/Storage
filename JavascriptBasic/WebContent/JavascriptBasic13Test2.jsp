<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JavascriptBasic13</title>
</head>

<body>




</body>

<script type="text/javascript">
	
//	2차원 배열 선언법 2
// 	var nameArr = [
// 		[1,2],[3,4],[5,6],
// 	];

	var nameArr = new Array();
	
	nameArr[0] = new Array();
	nameArr[1] = new Array();
	nameArr[2] = new Array();
	
// 	var nameArr1 = new Array();
	
// 	for (var i = 0; i < array.length; i++) {
// 		nameArr1[i] = newArray();
// 	}
	
	for (var i = 0; i < nameArr.length; i++) {
		for (var j = 0; j < nameArr.length-1; j++) {
			nameArr[i][j] = (i*2)+(j+1);
		}
	}
	
// 	nameArr[0][0] = 1;
// 	nameArr[1][0] = 3;
// 	nameArr[2][0] = 5;
	
// 	nameArr[0][1] = 2;
// 	nameArr[1][1] = 4;
// 	nameArr[2][1] = 6;
	
	
	for (var i = 0; i < nameArr.length; i++) {
// 							여기서는 -1을 사용하는 것보다 i를 사용하면 된다
		for (var j = 0; j < nameArr[i].length; j++) {
			document.write(nameArr[i][j]);
			document.write('<br>');
		}
	}
	
	
// 	document.write(nameArr[0][0]);
// 	document.write('<br>');
// 	document.write(nameArr[1][0]);
// 	document.write('<br>');
// 	document.write(nameArr[2][0]);
// 	document.write('<br>');
	
	
	
	
	
</script>

</html>

