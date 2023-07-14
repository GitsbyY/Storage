<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Test3</title>

</head>
<body>
	<div id='topTag'>
		<h1>선택자</h1>
		<h2 id="title">
			원거리 선택자
		</h2>
		<ul>
			<li>
				getElementById
			</li>
			<li class='odd'>
				getElementsByTagnName
			</li>
		</ul>
		<h2 id="title2">
			근거리 선택자
		</h2>
		<ul id="list">
			<li>
				parentNode
			</li>
			<li class='odd'>
				childNodes
			</li>
			<li>
				children
			</li>
			<li class='odd'>
				firstChild
			</li>
			<li>
				previousSibling
			</li>
			<li class='odd'>
				nextSibling
			</li>
		</ul>
	</div>
</body>

<script type="text/javascript">
	
// 	topTag를 활용하여 ul태그들은 경계선을 동일하게
// 	검은색으로 설정한다
	

	
	var myObj = document.getElementById('topTag');
	
	var myUlist = myObj.getElementsByTagName('ul');
	
	myUlist[0].style.border = '1px solid black';
	
	myUlist[1].style.border = '1px solid black';
	
// 	topTag를 활용하여 전체 li 중 홀수 번째의 태그들에 class를 설정하여
// 	글자들의 크기를 10px씩 증가시키시오

	var myOddList = myObj.getElementsByClassName('odd');
	
	myOddList.style.fontSize = '26px';
	
</script>


</html>