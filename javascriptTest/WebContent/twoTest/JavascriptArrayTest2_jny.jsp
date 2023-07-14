<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>

</body>

<script type="text/javascript">
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

	var danArr = new Array();
	var numArr = new Array();
	var resultArr = new Array();

	var danRange = 0;
	var numRange = 0;

	danRange = 9;
	numRange = 9;

	for (var i = 0; i < danRange - 1; i++) {
		danArr[i] = i + 2;
	}

	for (var i = 0; i < numRange; i++) {
		numArr[i] = i + 1;
	}

	for (var i = 0; i < danArr.length; i++) {
		for (var j = 0; j < numArr.length; j++) {
			resultArr[(i * numArr.length) + j] = danArr[i] * numArr[j];
		}
	}

	for (var i = 0; i < danArr.length; i++) {
		document.write('<hr>');
		document.write(danArr[i] + '단');
		document.write('<br>');

		for (var j = 0; j < numArr.length; j++) {
			document.write(danArr[i] + ' * ' + numArr[j] + ' = '
					+ resultArr[(i * numArr.length) + j]);
			document.write('<br>');
		}
	}
</script>

</html>