<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>웹 문서구조</title>

</head>
<body>
<!-- div태그들 중에서 시작해서 body태그에 배경색을 자신이 원하는 색으로 변경하시오 -->

	<div id='firstDiv'>
		<h1>DOM</h1>
		<p>나는 글자크기가 30px이고 배경색이 파란색이다</p>
		
		<ol class='ulTagGroup'>
			<li>1</li>
			<li>2</li>
			<li>3</li>
			<li>4</li>
		</ol>
	</div>
	
	<div id='secondDiv'>
		<h1>DOM2 나는 글자들이 가운데 정렬이다</h1>
		<p>두번째? 첫번째?</p>
		
		<ul class='ulTagGroup'>
			<li>1이곳의 li들은 글자들이 하</li>
			<li>2하하</li>
			<li>3하하하</li>
			<li>4하하하하 변경되도록 한다 원래 글자는 1,2,3,4였다</li>
		</ul>
	</div>
	
</body>

<script type="text/javascript">

	var firstDivObj = document.getElementById('firstDiv');
	
	firstDivObj.parentNode.style.backgroundColor = 'lightgreen';
	
	firstDivObj.getElementsByTagName('p')[0].style.fontSize = '30px';
	firstDivObj.getElementsByTagName('p')[0].style.backgroundColor = 'blue';
	
	var secondDivObj = document.getElementById('secondDiv');
	
	secondDivObj.getElementsByTagName('h1')[0].style.textAlign = 'center';
	
	var secondUlChildList = secondDivObj.getElementsByClassName('ulTagGroup')[0].children;
	
	for (var i = 0; i < secondUlChildList.length; i++) {
		var str = '';
		for (var j = 0; j <= i; j++) {
			str = str + '하';
		}
		secondUlChildList[i].innerHTML = str;
	}
		
	
</script>

</html>