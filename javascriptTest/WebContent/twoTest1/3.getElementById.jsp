<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>3.getElementById</title>
	
	<style type="text/css">
	</style>
	
	<script type="text/javascript">
		
		var spanObj = document.getElementById('span1')
		var strD = 'drink';
		var strT = 'tea';
		
		function spanChange() {
// 			var strD = 'drink';
// 			var strT = 'tea';
			var spanObj = document.getElementById('span1');
// 			var textCon = spanObj.value;
			if(spanObj.innerHTML == 'drink'){
				spanObj.innerHTML = 'tea';
			}else if(spanObj.innerHTML == 'tea'){
				spanObj.innerHTML = 'drink';
			}
		}	
// 			spanObj.innerHTML = strT;
// 			if(countMod == 0) {
// 				spanObj.innerHTML = strD;
// 			}else{
// 				spanObj.innerHTML = strT;
// 			}
// 			count=++;
		spanObj.onclick = spanChange;
	</script>
</head>

<body>

	<body>
	<form>
		<table border="1">
			<tr>
				<td>
					<span id="span1">drink</span> 
			<!-- drink를 change버튼 클릭시 tea로 변경, tea글자에선 drink로 변경하시오 -->
					<input type="button" value="change" onclick="spanChange();"/>
				<td/>
			</tr>
		</table>
	</form>
</body>

</body>
<script type="text/javascript">
	
</script>
</html>