<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>radio</title>
<style type="text/css">

table, tr, td{ 
	border: 1px solid black;	
} 

#ti {
	color: blue;
	font-family: 궁서체;
}

#tt {
	background-color: fuchsia;
	color: aqua;
	font-weight: bold;
}
</style>
<script type="text/javascript">

	function spman() {
		var radioOptionList = document.getElementsByName('sports');
		
// 		radioOptionList에 있는 모든 radio 
		for (var radio of radioOptionList) {
	        if (radio.checked) {
	            alert(radio.value);
	        }
	    }
	}
	
	
	
// 	function spman(){
// 		var inputList = document.getElementsByName("sports");
		
// 		for (var i = 0; i < inputList.length; i++) {
// 			if(inputList[i].checked) {
// 				alert(inputList[i].value);
// 			}
// 		}
// 	}

</script>
</head>
<body>
	<table>
		<tr>
			<td id="ti">즐겨하는 운동은?</td>
		</tr>
		<tr id="tt">
			<td>
				<input type="radio" name="sports" value="baseball">야구<br>
				<input type="radio" name="sports" value="soccer">축구<br> 
				<input type="radio" name="sports" value="basketball">농구<br>
				<input type="button" value="결정!" onclick="spman();">
			</td>
		</tr>
	</table>
</body>
</html>