<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>DomModelBasic5_1</title>

</head>

<body>
	

	<div id='theBox'>
		
	</div>
	
	 
	 
</body>

<script type="text/javascript">
// 	태그 생성

	var newDivTag = document.createElement('div');
	var newButton1 = document.createElement('button');
	var newButton2 = document.createElement('button');
	
// 	텍스트 생성

	var textObj1 = document.createTextNode('버튼1');
	var textObj2 = document.createTextNode('버튼2');
	
// 	속성부여

	newButton1.setAttribute('id', 'btn1');
	newButton2.setAttribute('id', 'btn2');
	
// 	선택 태그에 자식 태그를 추가

	newButton1.appendChild(textObj1);
	newButton2.appendChild(textObj2);
	
	newDivTag.appendChild(newButton1);
	newDivTag.appendChild(newButton2);
	
	var theObj = document.getElementById('theBox');
	theObj.appendChild(newDivTag);
	
</script>

</html> 


