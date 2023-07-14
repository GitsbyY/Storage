<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>DomControlBasic2</title>

</head>

<body>
	
<!-- 	태그 CRUD -->
	
<!-- 	문서 객체 조작 -->
<!-- 	태그를 CRUD한다 -->
	
	
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
	
// 	태그 복제

// 	var copyLObj = liList[3].cloneNode(false);
// 	->false라고 하더라도 아이디나 타이틀 등 속성은 복사가 된다
// 	var tagTextObj = document.createTextNode('리스트1');
	
// 	copyLObj.appendChild(tagTextObj);
	
// // 	선택 태그1의 자식인 선택 태그2 앞에 새로운 자식 태그를 추가
// // 	선택태그(부모).insertBefore(선택태그1, 선택태그2);
// 	theList.insertBefore(copyLObj, liList[0]);
// 	theList.removeChild(liList[4]);

// 	태그복제

// 	true, flase가 존재한다
// 	flase : 본인 노드와 본인에 지정 된 속성값들만 복제한다
	
// 	true : false 포함, 자신의 입장에서 자식들의 정보를 모두 복제한다
	
	var copyLObj = liList[3].cloneNode(true);
	
</script>

</html> 


