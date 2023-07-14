<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>IDon</title>
</head>

<body>
	
	<div id='rootDiv'>
		<div id='tableParentDiv'>
			<table id='contentTable'>
				<tr>
					<td>제목</td>
					<td>내용</td>
				</tr>
				<tr>
					<td>오늘이 금요일이라고?</td>
					<td>놀아야지</td>
				</tr>
				<tr>
					<td>야후</td>
					<td>또 가야지</td>
				</tr>
			</table>
		</div>
	</div>
	
</body>

<script type="text/javascript">

//    경계선 공통적으로 넣어주고 경계선 색 다르게 
//    테이블 width 300px div는 테이블보다 width 100px씩 증가
	
	var rootObj = document.getElementById('rootDiv');
	var tabPObj = document.getElementById('tableParentDiv');
	var conTObj = document.getElementById('contentTable');
	
	
	rootObj.style.border = '1px solid green';
	rootObj.style.width = '500px';

 	tabPObj.style.border = '2px solid yellow';
 	tabPObj.style.width = '400px';
 	
	conTObj.style.border = '1px solid black';
	conTObj.style.width = '300px';
	
	var tdList = conTObj.getElementsByTagName('td');
	
	
// 	alert(tdList[0]);
// 	var tdList = conTObj.getElementsByTagName(td);
	
// 	alert(tdList.length);
	
	for (var i = 0; i < tdList.length; i++) {
		tdList[i].style.border = '1px solid blue';
	}
	

	
</script>

</html>