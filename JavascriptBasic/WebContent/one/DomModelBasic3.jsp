<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>DomModelTest1</title>

</head>
<body>
	<div>
		<h1>선택자</h1>
		<h2 id="title">
			원거리 선택자
		</h2>
		<ul>
			<li class='myChoiveTag'>
				getElementById
			</li>
			<li>
				getElementsByTagnName
			</li>
		</ul>
		<h2 id="title2">
			근거리 선택자
		</h2>
		<ul id="list">
			<li class='myChoiveTag'>
				parentNode
			</li>
			<li>
				childNodes
			</li>
			<li>
				children
			</li>
			<li>
				firstChild
			</li>
			<li>
				previousSibling
			</li>
			<li class='myChoiveTag'>
				nextSibling
			</li>
		</ul>
	</div>
</body>

<script type="text/javascript">

// 	tag선택자
// 	document.getElementsByTagName('태그명');
	
	var myUlist = document.getElementsByTagName('ul');
	
	var myObj = myUlist[0].getElementsByTagName('li')[1];
	
	myObj.style.border = '1px solid blue';
	
</script>

</html> 


