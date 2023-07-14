<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JavascriptFunctionTest3</title>
</head>

<body>
	
	<h2>Text field</h2>
	<p>
		The <strong>input type="text"</strong> defines a one-line text input field:
	</p>
	
	<div id="validationCheck" style='border: 1px solid black;'>
		<form action="#">
			<label for="fNum">First Number:</label>
			<br>
			<input type="text" id="fNum" name="fNum">
			<br>
			<label for="sNum">Second Number:</label>
			<br>
			<input type="text" id="sNum" name="sNum">
			<br>
			<br>
			<input type="button" value="실행버튼" 
				onclick="inputValueValidationCheckFnc();">
		</form>	
	</div>
	
</body>

<script type="text/javascript">

   function inputValueValidationCheckFnc(){
	   
      var fNumObj = document.getElementById('fNum');
      var sNumObj = document.getElementById('sNum');
    
      var fNum = fNumObj.value;
      var sNum = sNumObj.value;
      
      fNum = Number(fNum);
      sNum = Number(sNum);
      
      
      if (Number.isInteger(fNum) == false) {
    	  alert('First Number이 숫자가 아닙니다\nFirst Number를 다시 입력해주세요');
      }else if(Number.isInteger(sNum) == false) {
           alert('sNum이 숫자가 아닙니다.\nSecond Number를다시 입력하세요');
       }else {
    	   alert(fNum+sNum);
       } 
   }
      
      
      
      
//       if (Number.isInteger(fNum) == true &&
//     		  Number.isInteger(sNum) == true) {
//          alert(fNum+sNum);
//       }else if(Number.isInteger(fNum) == true &&
//      		  Number.isInteger(sNum) == false) {
//            alert(sNum);
//            alert('sNum이 숫자가 아닙니다.\nSecond Number를다시 입력하세요');
//        }else {
//         	alert(fNum);
//           	alert('First Number이 숫자가 아닙니다\nFirst Number를 다시 입력해주세요');
//        } 
//    }
   
//    else if(Number.isInteger(fNum) == false &&
//  		  Number.isInteger(sNum) == true) {
//        alert(fNum);
//        alert('First Number이 숫자가 아닙니다.\nFirst Number다시 입력하세요');
//     }
   
</script>


</html>