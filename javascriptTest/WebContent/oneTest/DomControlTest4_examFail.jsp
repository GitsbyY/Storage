<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>DomControlTest4ExamFail</title>
</head>

<body>
	
	<div>
		<ul id='theList'>
			<li>리스트2</li>
			<li>리스트3</li>
			<li>리스트1</li>
			<li>리스트4</li>
		</ul>
	</div>
	
	<h1>문서 객체 조작</h1>
	
	<div id='secondDiv'>
	
	</div>
	
	
	
</body>

<script type="text/javascript">
	var theList = document.getElementById('theList');
	var liList = theList.getElementsByTagName('li');
	
// 	태그 복제
// 	var copyLiObj = liList[3].cloneNode(false);
// 	var tagTextObj = document.createTextNode('리스트1');
// 	copyLiObj.appendChild(tagTextObj);
	
// 	true, false
// 	false: 본인 노드와 본인에 지정된 속성값들만 복제한다
	
// 	true: false 포함, 자신의 입장에서 자식들의 정보를 모두 복제한다
	var copyLiObj = liList[3].cloneNode(true);

// 	선택태그1의 자식인 선택 태그2 앞에 새로운 자식 태그를 추가
// 	선택태그(부모).insertBefore(선택태그1, 선택태그2);
	
	theList.insertBefore(copyLiObj, liList[0]);
	
	theList.removeChild(liList[4]);
	theList.removeChild(liList[3]);
	theList.removeChild(liList[0]);
	
	var copyLiObj1 = liList[1].cloneNode(false);
	var tagTextObj = document.createTextNode('리스트1');
	copyLiObj1.appendChild(tagTextObj);
	theList.insertBefore(copyLiObj1, liList[0]);
	
	var secondDiv = document.getElementById('secondDiv');
	var copyLi = theList.cloneNode(true);
	secondDiv.appendChild(copyLi);
	
	secondDiv.setAttribute('style', 'border: 1px solid black;')
	copyLi.setAttribute('style', 'background-color: black;');
	copyLi.setAttribute('id', 'copyList;');
	
	var secondLi = document.getElementById('copyList');
	var copyliList = copyLi.getElementsByTagName('li');
// 	copyliList.setAttribute('style', 'border: 1px solid black;');
// 	copyliList.setAttribute('style', 'color: white;');
	
	var newLi = document.createElement('li');
	tagTextObj = document.createTextNode('리스트4');
	newLi.appendChild(tagTextObj);
	secondLi.appendChild(newLi);
	secondLi.insertBefore(newLi, copyliList[3]);
	secondLi.removeChild(liList[4]);
	newLi = document.createElement('li');
	tagTextObj = document.createTextNode('리스트3');
	secondLi.insertBefore(newLi, copyliList[3]);
	secondLi.removeChild(liList[4]);
	
// 	copyLiObj = copyLi[0].cloneNode(false);
// 	tagTextObj = document.createTextNode('리스트4');
// 	copyLiObj.appendChild(tagTextObj);
// 	copyLi.appendChild(copyLiObj);
	
</script>

</html>

