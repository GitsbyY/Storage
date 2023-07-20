<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>DomEventBasic3</title>
	
	<script type="text/javascript">
// 		this
		
		function tempTest1Fnc() {
			alert('난 매개변수가 없어');
			alert(this);
		}
		
		function tempTest1Fnc(myObj) {
			alert('난 매개변수야');
			alert(this);
			alert('이게 this와 같다.'
				+ document.getElementById('btnTag2'));
			alert(myObj); //->HTML button Obj라고 뜬다.
		}
		
		window.onload = function () {
			var btnTag3Obj = document.getElementById('btnTag3');
			
			btnTag3Obj.addEventListener('click', function() {
				alert('난 이벤트리스너로 등록했어');	
				alert(this);
				this.style.backgroundColor = 'red';
			});
		}
		

	</script>
</head>

<body>
	<button onclick="tempTest1Fnc();">버튼1</button>
	<button id='btnTag2' onclick="tempTest1Fnc(this);">버튼2</button>
	<button id='btnTag3'>버튼3</button>
</body>

<script type="text/javascript">

</script>

</html>