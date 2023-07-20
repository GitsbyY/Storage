<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>JavascriptBasic10</title>
	
	<style type="text/css">
	</style>
	
	<script type="text/javascript">
	</script>
</head>

<body>
	
	
	
</body>
<script type="text/javascript">
// 	배열 선언법1
// 	-->배열이 아니라 ArrayList라고 생각하면 된다. 
// 		그렇기에 숫자와 문자열을 함께 사용해도 오류가 아니다
	var nameArr = [1,2,3,4,10];
	
	
	
// 	document.write(nameArr[0]);
// 	document.write('<br/>');
	
// 	document.write(nameArr[1]);
// 	document.write('<br/>');
	
// 	document.write(nameArr[2]);
// 	document.write('<br/>');
	
// 	document.write(nameArr[3]);
// 	document.write('<br/>');
	
// 	document.write(nameArr[4]);
// 	document.write('<br/>');
// 	-->Undefined라고 표기되지만 오류가 뜨지는 않는다.
// 	document.write(nameArr[5]);
// 	document.write('<br/>');
	
	for (var i = 0; i < nameArr.length; i++) {
		document.write(nameArr[i]);
		document.write('<br/>');
	}
// 	-->hr은 horizen이라는 뜻으로 선이 그어진다.
	document.write('<hr>');
// 	sort는 정리 해 준다. 배열이 아닌 리스트라는 걸 보여준다
// 	nameArr.sort();
	nameArr.push('WoW');
	nameArr[7] = 999;  
	//->새로운 배열을 넣거나 아무 곳이나 데이터를 덮어 씌울 수 있다
// 	nameArr.pop('WoW');
	for (var i = 0; i < nameArr.length; i++) {
		document.write(nameArr[i]);
		document.write('<br/>');
	}
	
</script>
</html>









