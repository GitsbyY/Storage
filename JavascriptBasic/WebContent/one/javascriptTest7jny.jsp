<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>javascriptBasic7</title>
</head>

<body>

	<button onclick='todayFnc()'>나 누루면 현재 날짜에 해당하는 이미지 변경하기</button>
	<!-- 	버튼 누루면 내가 설정한 날짜가 화요일이면 -->
	<!-- 	화요일의 이미지 크기와 높이가 200px로 변경 -->
	<!-- 	다음에 토요일로 값 변경하고 버튼 누루면  -->
	<!-- 	토요일의 이미지 크기와 높이가 200px로 변경하는 기능을 구현하시오 -->

	<!-- 	50px -->
	<div id='weekCalc'>
		<img src='./images/Monday.PNG' alt="월" /> 
		<img src='./images/Tuesday.PNG' alt="화" />
		<img src='./images/Wednesday.PNG' alt="수" /> 
		<img src='./images/Thursday.PNG' alt="목" /> 
		<img src='./images/Friday.PNG' alt="금" /> 
		<img src='./images/Saturday.PNG' alt="토" /> 
		<img src='./images/Sunday.PNG' alt="일" />
	</div>

</body>

<script type="text/javascript">
	var weekCalcObj = document.getElementById('weekCalc');
	var imgList = weekCalcObj.getElementsByTagName('img');


	for (var i = 0; i < imgList.length; i++) {
		imgList[i].setAttribute('style', 'width: 50px; height: 50px');
	}
	
	function todayFnc() {
		var today = new Date();
		
// 		var nowDay = today.getDay();

		var nowDay = 6;
		
		switch (nowDay) {
		case 1:
			imgList[0].setAttribute('style', 'width: 200px; height: 200px');
			break;

		case 2:
			imgList[1].setAttribute('style', 'width: 200px; height: 200px');
			break;

		case 3:
			imgList[2].setAttribute('style', 'width: 200px; height: 200px');
			break;

		case 4:
			imgList[3].setAttribute('style', 'width: 200px; height: 200px');
			break;

		case 5:
			imgList[4].setAttribute('style', 'width: 200px; height: 200px');
			break;

		case 6:
			imgList[5].setAttribute('style', 'width: 200px; height: 200px');
			break;
			
		case 0:
			imgList[6].setAttribute('style', 'width: 200px; height: 200px');
			break;
		}
	}
	
</script>

</html>


