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
		<ul>
			<li>
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
			<li>
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
			<li>
				nextSibling
			</li>
		</ul>
	</div>
</body>

<script type="text/javascript">
	
// 	원거리 선택자
// 	id 선택자
	
// 	선택대상.getElementById("아이디명");
// 	대상 객체를 리턴한다
	
	var myObj = document.getElementById('title2');
	
	myObj.style.fontSize = '200px';
	
	myObj = document.getElementById('list');
	
	myObj.style.backgroundColor = 'grey';
	
	
	

	
</script>

</html> 


