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


	// 		0	1	2	3	4	5	6
	// 0	0	1	2	3	4	5	6
	// 1	7	8	9	10	11	12	13
	// 2	14	15	16	17	18	19	20

	var nameArr = new Array();
	
	nameArr[0] = new Array();
	nameArr[1] = new Array();
	nameArr[2] = new Array();
	nameArr[3] = new Array();
	nameArr[4] = new Array();
	nameArr[5] = new Array();
	nameArr[6] = new Array();
	
	
// 	for (var i = 0; i < 3; i++) {
// 		nameArr[i] = new Array();
// 		for (var j = 0; j < 7; j++) {
// 			nameArr[i][j] = new Array();
// 		}
// 	}
	
	//입력
	for (var i = 0; i < 3; i++) {
		for (var j = 0; j < nameArr.length; j++) {
			nameArr[i][j] = (i*7) + (j);
		}
	}

// 	alert(nameArr);
	//출력
	for (var i = 0; i < 3; i++) {
		
		for (var j = 0; j < nameArr[i].length; j++) {
			document.write(nameArr[i][j]);
			document.write('  ');
		}
		document.write('<br>');
	}

	
	
	
	
	

	// 	nameArr[0][0] = 1;
	// 	nameArr[1][0] = 3;
	// 	nameArr[2][0] = 5;

	// 	nameArr[0][1] = 2;
	// 	nameArr[1][1] = 4;
	// 	nameArr[2][1] = 6;

	// 	document.write(nameArr[0][0]);
	// 	document.write('<br>');
	// 	document.write(nameArr[1][0]);
	// 	document.write('<br>');
	// 	document.write(nameArr[2][0]);
	// 	document.write('<br>');
</script>

</html>

