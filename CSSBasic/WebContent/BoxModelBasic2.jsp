<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>BoxModelBasic1</title>
	<style type="text/css">
		
		div {
			background-color: green;
 			width: 300px; 
 			height: 150px; 
 			text-align: center;
 			border: 1px solid black; 
/*  			padding: 20px;  
						위/아래 오른쪽/왼쪽		*/
/*  			padding: 20px 40px;   
					위	오른쪽	아래	왼쪽*/
			padding: 20px 40px 0px 70px;
/* 			padding-top: 30px; */
/* 			padding-right: 0px; */
/* 			padding-bottom: 30px; */
/* 			padding-left: 40px; */
		}
		
</style>
</head>

<body>
	
	<div>
		Demonstrating the Box Model
	</div>
	
	<div id='testDiv'>
		This text is the content of the box. 
	</div>
	
	<div>
		Demonstrating the Box Model
	</div>
	
	
</body>
</html>