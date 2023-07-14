<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>javascriptBasic4</title>
</head>

<body>
	
</body>

<script type="text/javascript">
	// 프롬프트
// 	var gender = prompt('당신의 성별은?', '남성');
// 	var age = prompt('당신의 나이는');
	
// 	alert(gender + '   :   ' + age);
	
// 	두 개의 숫자를 입력받는다
	
// 	이 들 중 첫번째 숫자가 크면 
	
// 	출력 예:
// 	만약 10 2가 입력되었다면
	
// 	첫번째 값: 10   VS  두번째 값: 2
	
// 	첫번째 값이 큽니다
	
// 	만약 두 숫자가 5 5로 입력되었다면
	
// 	첫번째 값: 5   VS  두번째 값: 5
	
// 	첫번째, 두번째 값이 동일한 크기입니다
// 	라고 출력되도록 구현하시오
// 	출력은 document.write()로 출력한다
	
	var num1 = prompt('첫 번째 숫자를 입력하세요.','숫자 입력');
	var num2 = prompt('두 번째 숫자를 입력하세요.','숫자 입력');
	
	if (num1 - num2 > 0) {
		document.write('첫번째 값: ' + num1 + '   VS  두번째 값: ' + num2);
		document.write('<br>');
		document.write('첫 번째 값이 큽니다');
	} else if (num1 - num2 < 0) {
		document.write('첫번째 값: ' + num1 + '   VS  두번째 값: ' + num2);
		document.write('<br>');
		document.write('두 번째 값이 큽니다');
	} else if (num1 === num2) {
		document.write('첫번째 값: ' + num1 + '   VS  두번째 값: ' + num2);
		document.write('<br>');
		document.write('첫번째, 두번째 값이 동일한 크기입니다');
	} else {
		document.write('첫번째 값: ' + num1 + '   VS  두번째 값: ' + num2);
		document.write('<br>');
		document.write('올바른 숫자를 입력하세요');
	}
	
</script>

</html>


