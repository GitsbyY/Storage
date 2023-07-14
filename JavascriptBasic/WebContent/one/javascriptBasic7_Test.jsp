<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>javascriptBasic7</title>

	<style type="text/css">
	
		img{
			width : 50px;
			height: 50px
		}
	
	</style>

</head>

<body>

	<button onclick="sizeUp()">나 누루면 현재 날짜에 해당하는 이미지 변경하기</button>
<!-- 	버튼 누루면 내가 설정한 날짜가 화요일이면 -->
<!-- 	화요일의 이미지 크기와 높이가 50px로 변경 -->
<!-- 	다음에 토요일로 값 변경하고 버튼 누루면  -->
<!-- 	토요일의 이미지 크기와 높이가 50px로 변경하는 기능을 구현하시오 -->
<!-- 	50px -->
	<div id='weekCalc'>
		<img src="./week/mon.jpg" alt="월">
		<img src="./week/tue.jpg" alt="화">
		<img src="./week/wen.jpg" alt="수">
		<img src="./week/thur.jpg" alt="목">
		<img src="./week/fri.jpg" alt="금">
		<img src="./week/sat.jpg" alt="토">
		<img src="./week/sun.jpg" alt="일">
	</div>
	
	
</body>

<script type="text/javascript">
	
	function sizeUp(){
		
		var today=new Date();
		var nowDay=today.getDay();	//현재 요일 (0:일요일~6:토요일)
//	 	today.setDay();
		
		var weekObj = document.getElementById('weekCalc');
//		var imgList = weekObj.getElementsByTagName('img');
		
// 		var monImg = imgList[0];
// 		var tueImg = imgList[1];
// 		var wenImg = imgList[2];
// 		var thurImg = imgList[3];
// 		var friImg = imgList[4];
// 		var satImg = imgList[5];
// 		var sunImg = imgList[6];
// 		-->필요가 없다 왠지 모르겠지만
// 		weekObj.children[1]
		
		if(nowDay === 1){
			weekObj.children[0].setAttribute('style', 'width: 200px; height: 200px');
		}else if(nowDay === 2){
			weekObj.children[1].setAttribute('style', 'width: 200px; height: 200px');
		}else if(nowDay === 3){
			weekObj.children[2].setAttribute('style', 'width: 200px; height: 200px;');
		}else if(nowDay === 4){
			weekObj.children[3].setAttribute('style', 'width: 200px; height: 200px');
		}else if(nowDay === 5){
			weekObj.children[4].setAttribute('style', 'width: 200px; height: 200px');
		}else if(nowDay === 6){
			weekObj.children[5].setAttribute('style', 'width: 200px; height: 200px');
		}else if(nowDay === 0){
			weekObj.children[6].setAttribute('style', 'width: 200px; height: 200px');
		}

	}
	
</script>

</html>


