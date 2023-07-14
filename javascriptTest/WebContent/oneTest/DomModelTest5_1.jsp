<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>DomModelTest5_1</title>

</head>
<body>

	
	<div id='theBox'>
		
	</div>
	
	
</body>

<script type="text/javascript">

	var newDivTag1 = document.createElement('div');
	var newDivTag2 = document.createElement('div');
	var newHTag = document.createElement('h1')
	var newButton1 = document.createElement('button');
	var newButton2 = document.createElement('button');
	var textObj1 = document.createTextNode('버튼1');
	var textObj2 = document.createTextNode('버튼2');
	var textObj3 = document.createTextNode('태그 생성 연습');
	
// 	var bodyTag = document.getElementsByTagName('body');
// 	var bodyList = bodyTag.children;
	
	newHTag.appendChild(textObj3);
	newDivTag1.style.border = '1px solid black';
// 	newHTag.style.border = '1px solid black'; ->경계선이 생김.
	
	newButton1.setAttribute('id', 'btn1');
	newButton1.setAttribute('title', '신기하네')
	newButton2.setAttribute('id', 'btn2');
	newButton2.style.backgroundColor = 'red';
	
	newButton1.appendChild(textObj1);
	newButton2.appendChild(textObj2);
	
	newDivTag2.appendChild(newButton1);
	newDivTag2.appendChild(newButton2);
	
// 	bodyList.appendChild(newDivTag1);
// 	bodyList.appendChild(newDivTag2);
	
// 	사용자들에게 보여지는 순간
	var theObj = document.getElementById('theBox');
	theObj.appendChild(newHTag);
	
	var bodyObj = theObj.parentNode;
	
	bodyObj.appendChild(newDivTag2);
	
</script>

</html>