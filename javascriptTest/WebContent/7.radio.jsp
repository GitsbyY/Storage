<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>6.select3</title>


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
		
		var inputList = document.getElementsByTagName('input');
// 		var val = document.getElementById("inputList").value
//  		alert(inputList[1].value);
		if(inputList[0].checked == true){
			alert(inputList[0].value);
		}else if(inputList[1].checked == true){
			alert(inputList[1].value);
 		}else if(inputList[2].checked == true){
 			alert(inputList[2].value);
 		}
	}
</script>
</head>
<body>
	<table>
		<tr>
			<td id="ti">즐겨하는 운동은?</td>
		</tr>
		<tr id="tt">
			<td>
				<input type="radio" name="sports" value="baseball" checked="checked">야구<br>
				<input type="radio" name="sports" value="soccer">축구<br> 
				<input type="radio" name="sports" value="basketball">농구<br>
				<input type="button" value="결정!" onclick="spman();">
			</td>
		</tr>
	</table>
</body>
</html>