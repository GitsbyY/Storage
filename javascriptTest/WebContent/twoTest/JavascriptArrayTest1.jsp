<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>JavascriptArrayTest1</title>
	
	<style type="text/css">
	</style>
	
	<script type="text/javascript">
	</script>
</head>

<body>
	
	
	
</body>
<script type="text/javascript">
	
// 	-->배열이 아니라 ArrayList라고 생각하면 된다. 
// 		그렇기에 숫자와 문자열을 함께 사용해도 오류가 아니다
	var nameArr = ['Son','Jo','Lim','Park'];
	var numArr = [27,3,9];
	
// 	   배열로 동기들 4명
// 	   자신이 좋아하는 3가지 숫자를 각각의 배열로 저장한 후
// 	  ---------------------------------- 
// 	   동기들 이름을 역순으로 출력하고
	   
// 	   숫자는 1씩 증가한 값으로 출력하시오
	for (var i = 0; i < nameArr.length; i++) {
		document.write(nameArr[i]);
		document.write('<br/>');
	}
	
	for (var i = 0; i < numArr.length; i++) {
		document.write(numArr[i]);
		document.write('<br/>');
	}
	
	document.write('<hr>');
// 	sort는 정리 해 준다. 배열이 아닌 리스트라는 걸 보여준다
 	
// 	numArr[0] = 28;
// 	numArr[1] = 4;
// 	numArr[2] = 10;
// 	nameArr.sort();
// 	nameArr.reverse();
	
	for (var i = nameArr.length-1; i >= 0; i--) {
		document.write(nameArr[i]);
		document.write('<br/>');
	}
	
	for (var i = 0; i < numArr.length; i++) {
		document.write(numArr[i]+1);
		document.write('<br/>');
	}
	
</script>
</html>









