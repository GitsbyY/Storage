<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	
	<style type="text/css">
	</style>
	
	<script type="text/javascript">
	
	function selTest() {
		//미영
// 		var val = document.getElementById("selList").value;
// 		alert(val);
		//태윤
// 		var selList = document.getElementById("selList");
//  	alert(selList.options[selList.selectedIndex].value);
// 		document.write(selList.options[0].value);
// 		document.write(selList.selectedIndex);

		//우연
// 		var selList = document.getElementById("selList");
// 		var selVal = document.getElementById("selList").value;
// 		if(selVal == selList[0].value){
// 			alert(selList[0].value)
// 		}else if(selVal == selList[1].value){
// 			alert(selList[1].value)
// 		}else if(selVal == selList[2].value){
// 			alert(selList[2].value)
// 		}
	
	}
	
	</script>
</head>

<body>
	
	<form>
		<select id="selList" onchange="selTest();" size="1">
			<!-- 셀렉박스 내용 변경 시 선택한 value를 경고창으로 출력하시오 -->
			<option value="http://www.naver.com">네이버</option>
			<option value="http://www.daum.net">다음</option>
			<option value="http://www.gmail.com">G메일</option>
		</select>
	</form>
	
</body>
<script type="text/javascript">
	
</script>
</html>