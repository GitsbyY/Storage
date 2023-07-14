<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>EventTest1</title>
	
	<style type="text/css">
	
	img {
		width : 100px;
		height: 100px;
	}
	
	</style>
	
</head>

<body>
	
<!-- 	onclick 이벤트 -->
	
	
	<div id='myTag'>
		<img alt="음" src="./images/img2.jpg" 
			onmouseover="bigImg();" onmouseout="normalImg();">
	</div>
	
	
</body>

<script type="text/javascript">
	

// 	function bigImg(x) {
// 	  x.style.height = "110px";
// 	  x.style.width = "110px";
// 	}

// 	function normalImg(x) {
// 	  x.style.height = "100px";
// 	  x.style.width = "100px";
// 	}

	var divObj = document.getElementById('myTag');
	var imgObj = divObj.children[0];
// 	var imgObj = divObj.childNodes[0]; //하자가 있다.
	
	function bigImg() {
		imgObj.style.height = "110px";
		imgObj.style.width = "110px";
// 		imgObj.style.height = parseInt(imgObj.style.height)*1.1+"px";
// 	    imgObj.style.width = parseInt(imgObj.style.width)*1.1+"px";
	}

	function normalImg() {
		imgObj.style.height = "100px";
		imgObj.style.width = "100px";
	}
	
	

	
</script>

</html>

