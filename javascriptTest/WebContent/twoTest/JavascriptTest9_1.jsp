<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JavascriptBasic9</title>
</head>

<body id='root'>

	<div id='printTag'>
	
	</div>


</body>

<script type="text/javascript">
//	fixStr에 주어진 문자열은 절대 변경하지 않는다

//	div에 변경될 문자열을 출력한다

//	변경될 문자열: db를 db라

	var fixStr = '자바를 자바라';
	var printTagObj = document.getElementById('printTag');
	printTagObj.setAttribute('style', 'border: 1px solid black;');
	
// 	->이 로직은 거의 사용하지 않는다. 팀장 정도는 되어야한다.
	var tagTextObj = document.createTextNode(fixStr);
	printTag.appendChild(tagTextObj);

// 	-->이건 div에 들어가는게 아니다
//  document.write(fixStr + "<br />");
// 	document.write(fixStr.replaceAll("자바","db"));
 	
 	
// 		printTagObj.setAttribute('style', 'border: 1px solid black;');
//  	var fixedStr = fixStr.replaceAll("자바","db");
//  	printTagObj.innerHTML = fixedStr;
 	

	
</script>

</html>

