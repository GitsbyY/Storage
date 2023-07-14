<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JavascriptStringTest2</title>
</head>

<body id='root'>

	<div id='printTag'>
	
	</div>


</body>

<script type="text/javascript">
//	fixStr에 주어진 문자열은 절대 변경하지 않는다

//	div에 변경될 문자열을 출력한다

//	변경될 문자열: db를 db라

// 	-->이미 TextNode가 생성되어있기 때문에 새로운 노드가 생성이 안됨
// 	var tagTextObj = document.createTextNode(fixStr);
// 	printTag.appendChild(tagTextObj);

// 	-->이건 div에 들어가는게 아니다
//  document.write(fixStr + "<br />");
// 	document.write(fixStr.replaceAll("자바","db"));
 	
 	var fixStr = '자바를 자바라';
	var printTagObj = document.getElementById('printTag');
	printTagObj.setAttribute('style', 'border: 1px solid black;');
	
 	var fixedStr = fixStr.substring(4,6);
 	var afterStr = fixStr.substring(0, 3) + ' ' + '잡아' + fixStr.substring(6, 7);
 	printTagObj.innerHTML = '출력 : ' + afterStr;
 	
 	
 	
//  	document.getElementById('root').innerHTML = '<p>innerHTML의 힘</p>';

	
</script>

</html>

