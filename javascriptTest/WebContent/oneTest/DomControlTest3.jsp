<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>DomControlTest3</title>

</head>

<body>
	
	<h1>태그 생성 연습</h1>
	<ul id='theList'>
		<li>리스트2</li>
		<li>리스트3</li>
		<li>리스트4</li>
		<li>리스트1</li>
	</ul>

	 
	 
</body>

<script type="text/javascript">
	
	var theList = document.getElementById('theList');
	var liList = theList.getElementsByTagName('li');
	var copyLObj = document.getElementsByTagName('ul').cloneNode(true);
	
	document.body.appendChild(copyLObj);
	
// 	태그 복제

// 	var copyLObj = liList[3].cloneNode(false);
// 	var tagTextObj = document.createTextNode('리스트1');
	
// 	copyLObj.appendChild(tagTextObj);
	
// // 	선택 태그1의 자식인 선택 태그2 앞에 새로운 자식 태그를 추가
// // 	선택태그(부모).insertBefore(선택태그1, 선택태그2);
// 	theList.insertBefore(copyLObj, liList[0]);
// 	theList.removeChild(liList[4]);

// 	태그복제
	
	
</script>

</html> 


