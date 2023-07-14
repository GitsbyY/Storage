<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JavascriptStringTest3</title>
</head>

<body>

	<div id='printTag' style='border: 1px solid black;'>
		
	</div>


</body>

<script type="text/javascript">
	var fixStr = '문자열 안에서 마지막 문자 앞 글자가 무엇인지 출력하시오(자바를 자바라)';
	var printTagObj = document.getElementById('printTag');
// 	document.write(fixStr.length); ->40
	document.write(fixStr.length);
// 	document.write(fixStr.charAt(38));
	printTagObj.innerHTML = fixStr.charAt(fixStr.length-2);
	
// 	출력: 라		
	
	
	
</script>

</html>

