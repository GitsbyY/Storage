<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>JavascriptArrayTest2</title>
	
	<style type="text/css">
	ba {
		background-color: ;
	}
	</style>
	
	<script type="text/javascript">
	</script>
</head>

<body>
	
	
	
</body>
<script type="text/javascript">
	
// 	-->배열이 아니라 ArrayList라고 생각하면 된다. 
// 		그렇기에 숫자와 문자열을 함께 사용해도 오류가 아니다

// 구구단을 배열을 통해 구하시오
// 배열 3개를 쓴다
// 2 * 1 = 2
// 1. 2~9까지 들어있는 배열
// 2. 1 ~9까지 들어있는 배열
// 3. 2*1 ~ 2*9까지 들어있는 배열
// 구구단을 배열을 통해 구하시오
// 배열에 결과를 넣는다
// 2 * 1 = 2
// 이런 경우 2만
// 2 * 9 = 18
// 이런 경우 18만 배열에 저장
// 구구단을 완성한다

	var danArr = [2,3,4,5,6,7,8,9];
	var numArr = [1,2,3,4,5,6,7,8,9];
	var resultArr = new Array();
	
	var indexNum = 0;
	
	for (var i = 0; i <= 7; i++) {
		for (var j = 0; j <= 8; j++) {
			resultArr[indexNum] = danArr[i]*numArr[j];
			indexNum++;
		}
	}
	
	
// 	document.write(resultArr[1]);
// 	for (var i = 0; i < resultArr.length-1; i++) {
// 		document.write(resultArr[i]);
// 		document.write('<br/>');
// 	}

// 	document.write(danArr[0]);
// 	document.write(' * ');
// 	document.write(numArr[0]);
// 	document.write(' = ');
// 	document.write(resultArr[0]);
	
	indexNum = 0;

	for (var i = 0; i <= 7; i++) {
		document.write('<hr>');
		document.write(danArr[i] + '단');
		document.write('<hr>');
		for (var j = 0; j <= 8; j++) {
				document.write(danArr[i] + ' * ' + numArr[j]
				+ ' = ' + resultArr[indexNum]);
				indexNum++;
				document.write('<br/>');
			}	
	}
	
	
</script>
</html>









