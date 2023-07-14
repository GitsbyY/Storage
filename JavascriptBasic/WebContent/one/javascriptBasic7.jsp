<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>javascriptBasic7</title>
	
	<style type="text/css">
	</style>
	
	<script type="text/javascript">
	
	document.write("<h1>현재날짜/시간 정보</h1>")
	var today=new Date();
	var nowMonth=today.getMonth()+1; //현재 월  (0~11)
	var nowDate=today.getDate();     //현재 일
	var nowDay=today.getDay();		 //현재 요일 (0:일요일~6:토요일)
	var nowHours=today.getHours();	 //현재 시간
	var nowMinutes=today.getMinutes();//현재 분
	var nowSeconds=today.getSeconds();//현재 초
	var nowTime=today.getTime();	  //1970년1월1일부터 밀리초 경과된 시간
	
//  	document.write(today); // ->지금 요일 월 일 년도 시분초가 나온다.
	document.write("월: "+nowMonth+"<br />");
	document.write("일: "+nowDate+"<br />");
	document.write("요일: "+nowDay+"<br />");
	document.write("시: "+nowHours+"<br />");
	document.write("분: "+nowMinutes+"<br />");
	document.write("초: "+nowSeconds+"<br />");
	document.write("경과시간: "+nowTime+"<br />");


	document.write("<h1>날짜 바꾸기</h1>")
	today.setMonth(11); //월을 12월로 지정
	today.setDate(25);   //일을 25일로 지정

	document.write("월: "+nowMonth+"<br />");
	document.write("일: "+nowDate+"<br />");
	
	</script>
	
</head>

<body>

</body>


<script type="text/javascript">
	
</script>
</html>