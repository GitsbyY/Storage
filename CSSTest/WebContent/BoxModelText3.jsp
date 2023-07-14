<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>BoxModelTest1.jsp</title>
   <style type="text/css">
      
      .rightDiv {
         width: 300px;
         height: 200px;
         margin-top: 50px;
      }
     
      .leftDiv {
         width: 300px;
         height: 200px;
         margin-top: 50px;
         margin-left: 60px;
         margin-right: 80px;
      }
    
     .bigDiv {
         border: 1px solid black;
         width: 800px;
         height: 600px;
         margin: 15px;
      }	
       table,th, td  {
   		 border: 1px solid black;
   		 border-collapse: collapse;
  		}
  		
</style>
</head>
	
<body>
	
	<div class='bigDiv'>
		<div class='leftDiv' style="float: left;">
	      <table>
	      
	         <tr>
	            <td colspan='4'>
	            	공연요금
	            </td>
	         </tr>
	         
	         <tr>
	            <td>
	            	구분
	            </td>
	            <td>
	            	S석
	            </td>
	            <td colspan='2'>
	            	VIP
	            </td>
	         </tr>
	         
	         <tr>
	            <td>
	            	성인
	            </td>
	            <td>
	            	30,000원
	            </td>
	            <td colspan='2'>
	            	50,000원
	            </td>
	         </tr>
	         
	         <tr>
	            <td>
	            	청소년
	            </td>
	            <td>
	            	40,000원
	            </td>
	            <td colspan='2'>
	            	60,000원
	            </td>
	         </tr>
	         
	         <tr>
	            <td>
	            	소인
	            </td>
	            <td colspan='3'>
	            	미취학 아동 일반 요금의 50%
	            </td>
	         </tr>
	        
	         <tr>
	            <td rowspan='2'>
	            	공연시간
	            </td>
	            <td>
	            	1회
	            </td>
	             <td colspan='2'>
	            	13:00시 - 15:00시
	            </td>
	         </tr>
	         <tr>
	            <td>
	            	2회
	            </td>
	             <td colspan='2'>
	            	17:00시 - 19:00시
	            </td>
	         </tr>
	         
	      </table>
	   </div>
	
	   <div class='rightDiv' style="float: left;">
	      <table>
	      
	         <tr>
	            <td colspan='4'>
	            	공연요금
	            </td>
	         </tr>
	         
	         <tr>
	            <td>
	            	구분
	            </td>
	            <td>
	            	S석
	            </td>
	            <td colspan='2'>
	            	VIP
	            </td>
	         </tr>
	         
	         <tr>
	            <td>
	            	성인
	            </td>
	            <td>
	            	30,000원
	            </td>
	            <td colspan='2'>
	            	50,000원
	            </td>
	         </tr>
	         
	         <tr>
	            <td>
	            	청소년
	            </td>
	            <td>
	            	40,000원
	            </td>
	            <td colspan='2'>
	            	60,000원
	            </td>
	         </tr>
	         
	         <tr>
	            <td>
	            	소인
	            </td>
	            <td colspan='3'>
	            	미취학 아동 일반 요금의 50%
	            </td>
	         </tr>
	        
	         <tr>
	            <td rowspan='2'>
	            	공연시간
	            </td>
	            <td>
	            	1회
	            </td>
	             <td colspan='2'>
	            	13:00시 - 15:00시
	            </td>
	         </tr>
	         <tr>
	            <td>
	            	2회
	            </td>
	             <td colspan='2'>
	            	17:00시 - 19:00시
	            </td>
	         </tr>
	         
	      </table>
	      
	   </div>
	   
	   <div class='leftDiv' style="float: left;">
	      <table>
	      
	         <tr>
	            <td colspan='4'>
	            	공연요금
	            </td>
	         </tr>
	         
	         <tr>
	            <td>
	            	구분
	            </td>
	            <td>
	            	S석
	            </td>
	            <td colspan='2'>
	            	VIP
	            </td>
	         </tr>
	         
	         <tr>
	            <td>
	            	성인
	            </td>
	            <td>
	            	30,000원
	            </td>
	            <td colspan='2'>
	            	50,000원
	            </td>
	         </tr>
	         
	         <tr>
	            <td>
	            	청소년
	            </td>
	            <td>
	            	40,000원
	            </td>
	            <td colspan='2'>
	            	60,000원
	            </td>
	         </tr>
	         
	         <tr>
	            <td>
	            	소인
	            </td>
	            <td colspan='3'>
	            	미취학 아동 일반 요금의 50%
	            </td>
	         </tr>
	        
	         <tr>
	            <td rowspan='2'>
	            	공연시간
	            </td>
	            <td>
	            	1회
	            </td>
	             <td colspan='2'>
	            	13:00시 - 15:00시
	            </td>
	         </tr>
	         <tr>
	            <td>
	            	2회
	            </td>
	             <td colspan='2'>
	            	17:00시 - 19:00시
	            </td>
	         </tr>
	         
	      </table>
	   </div>
	
	   <div class='rightDiv' style="float: left;">
	      <table>
	      
	         <tr>
	            <td colspan='4'>
	            	공연요금
	            </td>
	         </tr>
	         
	         <tr>
	            <td>
	            	구분
	            </td>
	            <td>
	            	S석
	            </td>
	            <td colspan='2'>
	            	VIP
	            </td>
	         </tr>
	         
	         <tr>
	            <td>
	            	성인
	            </td>
	            <td>
	            	30,000원
	            </td>
	            <td colspan='2'>
	            	50,000원
	            </td>
	         </tr>
	         
	         <tr>
	            <td>
	            	청소년
	            </td>
	            <td>
	            	40,000원
	            </td>
	            <td colspan='2'>
	            	60,000원
	            </td>
	         </tr>
	         
	         <tr>
	            <td>
	            	소인
	            </td>
	            <td colspan='3'>
	            	미취학 아동 일반 요금의 50%
	            </td>
	         </tr>
	        
	         <tr>
	            <td rowspan='2'>
	            	공연시간
	            </td>
	            <td>
	            	1회
	            </td>
	             <td colspan='2'>
	            	13:00시 - 15:00시
	            </td>
	         </tr>
	         <tr>
	            <td>
	            	2회
	            </td>
	             <td colspan='2'>
	            	17:00시 - 19:00시
	            </td>
	         </tr>
	         
	      </table>
	      
	   </div>
	   
	</div>
	   
</body>
</html>