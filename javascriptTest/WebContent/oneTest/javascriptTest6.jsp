<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>javascriptTest6</title>

<style type="text/css">
	
</style>

</head>



<body>
	
</body>


<script type="text/javascript">

// 	for (var i = 2; i <= 9  ; i++){
// 	      document.write('<div>' + i+'단<br/>');
// 	      for (var j = 1; j <= 9 ; j++) {
// 	         document.write('<span>' + i+'*'+j+"="+(i*j)+'</span><br/>');
// 	      }
// 	      document.write('</div><br/>');
// 	   }
	
	document.write('<div style="width:60px; float:left;">'+'2단</div>');
	document.write('<br/>');
 	for (var i = 1; i <= 9; i++) {
 		document.write('<div style="width:60px; float:left;"><span>2*' +
 				i +'=' +(2*i)+ '</span></div>');
 	}
	
 	document.write('<br/>');
	document.write('<div>3단</div>');
	document.write('<br/>');
 	for (var i = 1; i <= 9; i++) {
 		document.write('<div><span>3*' +
 				i +'=' +(3*i)+ '</span></div>');
 	}
	
 	
//  	var danStartNum = 2;
//      var danEndNum = 3;
    
//     for (var i = danStartNum; i <= danEndNum  ; i++){
//        document.write('<div>' + i+'단</div>');
//        for (var j = 1; j <= 9 ; j++) {
//           document.write('<div><span>' + i+'*'+j+"="+(i*j)+'</div></span>');
          
//        }
//        document.write('<br/>');
//     }
 	
//  	   for (var i = danStartNum; i <= danEndNum  ; i++){
//       document.write('<div style="width:100px; float:left;">' + i+'단');
//       for (var j = 1; j <= 9 ; j++) {
//          document.write('<div><span>' + i+'*'+j+"="+(i*j)+'</span></div>');
         
//       }
//       document.write('</div>');
//    }
 	
</script>

</html>




