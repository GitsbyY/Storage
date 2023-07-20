<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JavascriptFunctionBasic4</title>
</head>

<body>
	
	<input type="button" value="버튼1" 
		onclick="amazingGreetFnc('반갑습니다','1234');">
	<input type="button" value="버튼2" onclick="amazingGreetFnc('신기하네');">
   
</body>

<script type="text/javascript">

// 	function amazingGreetFnc(args,asd){
// 		alert('매개변수 활용: ' + args);
// 		alert('매개변수 활용: ' + asd);
		
// // 		return args + '리턴값 활용?';
// 	}
	
	function amazingGreetFnc(args){
		alert('매개변수 활용: ' + args);
		//리턴은 중간과정. 이제는 거의 사용하지 않는다.
		return args + '리턴값 활용?';
	}
	
// 	함수 명명규칙
// 	의미있는 이름을 적고 끝에는 fnc를 적는다.
	var resultStr = '';
	
	resultStr = amazingGreetFnc('여기에 넣으나 저기에 넣으나 똑같다.');
	
	document.write(resultStr);
   
</script>

</html>