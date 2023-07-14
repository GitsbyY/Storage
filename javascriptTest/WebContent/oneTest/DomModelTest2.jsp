<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>웹 문서구조2</title>

</head>
<body>
	<div>
		<h1>선택자</h1>
		<h2 id="title">
			원거리 선택자
		</h2>
		<ul id='getElement'>
			<li class = 'elementTag'>
				getElementById
			</li>
			<li class = 'elementTag'>
				getElementsByTagnName
			</li>
		</ul>
		<h2 id="title2">
			근거리 선택자
		</h2>
		<ul id="list">
			<li class = 'myChoiveTag'>
				parentNode
			</li>
			<li class = 'myChoiveTag'>
				childNodes
			</li>
			<li class = 'myChoiveTag'>
				children
			</li>
			<li class = 'myChoiveTag'>
				firstChild
			</li>
			<li class = 'myChoiveTag'>
				previousSibling
			</li>
			<li class = 'myChoiveTag'>
				nextSibling
			</li>
		</ul>
	</div>
</body>

<script type="text/javascript">

// 	var myObj = document.getElementById('getElement');
	
// 	myObj.style.backgroundColor = 'pink';
	
	var myObjList = document.getElementsByClassName('elementTag');
	
	var myChoiceObj = myObjList[0];
	
	myChoiceObj.style.backgroundColor = 'pink';
	
	myChoiceObj = myObjList[1];
	
	myChoiceObj.style.backgroundColor = 'pink';
	
	var myObjList2 = document.getElementsByClassName('myChoiveTag');
	
	var myChoiceObj1 = myObjList2[0];
	
	myChoiceObj1.style.border = '2px solid rbg(20,20,20)';
	
	myChoiceObj1 = myObjList2[1];
	
	myChoiceObj1.style.border = '2px solid rbg(20,20,20)';
	
	myChoiceObj1 = myObjList2[2];
	
	myChoiceObj1.style.border = '2px solid rbg(20,20,20)';
	
	myChoiceObj1 = myObjList2[3];
	
	myChoiceObj1.style.border = '2px solid rbg(20,20,20)';
	
	myChoiceObj1 = myObjList2[4];
	
	myChoiceObj1.style.border = '2px solid rbg(20,20,20)';
	
	myChoiceObj1 = myObjList2[5];
	
	myChoiceObj1.style.border = '1px solid rbg(20,20,20)';
	
	
	
</script>

</html> 


