<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>(최종)다나와 홈페이지</title>

<script type="text/javascript">
	function loginScreenFnc() { // 이미지 클릭하면 로그인 화면으로 이동
		window.open("loginForm.jsp","_self");		
	}
	function findLogFormFnc() { // 아이디 찾기 
		window.open("findLogin.jsp","_self");
	}
	function findPasswordFnc() { // 비밀번호 찾기
		window.open("findPassword.jsp","_self");
	}
	function newMemberShipFormFnc() { // 회원가입
// 		window.open("","_self");
	}
	function partnerManagerFnc() {
		window.open("partnerManager.jsp","_self");		
	} 
	function generalMembershipFnc() { // 일반 회원가입
		window.open("loginForm.jsp","_self");		
	}
</script>
<style>
*{
	font-family: "Malgun Gothic","맑은 고딕", "Apple SD Gothic Neo";
}

html, body {
	    width: 100%;
	    height: 100%;
	    position: relative;
	    margin: auto;
	}
body{
	background-color:#f5f5f5;
}
 #bodyEntire { 
 	width:600px;
 	height:930px; 
 	background-color:#ffffff; 
 	margin:0 auto; 
 	text-align: center; 
 } 
 #header { 
 	padding:16px; 
 	margin-top:20px; 
 	background-color: #ffffff;
 } 
 
.danawaImg{ /*다나와 이미지 */
	float:left;	
	width:128px;
	height:28px;
	margin-left:70px;
}
.notLogin{
	border:1px solid gray;
	float:right;
	margin-right:70px;
	padding:0 8px;
	margin-top:9px;
}
#checkboxLogin { /* 체크박스 */
	padding-top:62px;
	
	  
}
.logMaintain {
	text-align: center;
	margin-left:30px;
}
.members{
	margin-left:70px;
}

#formId { /* 로그인,비번 창*/
	width:441px;
	height:50px;
	margin-left: 70px;
	padding: 10px 80px 10px 21px;
}

#findLog { /* 찾기 */
	padding: 10px;
	text-align:center;
}
a{ /* 아이디 찾기 ,비번 찾기,회원가입 */
	font-size:13px;
	color:#666666;
	text-decoration: none;
}
#fontSize{ /* 이미지 아래 폰트 사이즈 */
	font-size: 13px;
 	margin-left:80px; 
}
.logMaintain{
	text-align:left;
}
#boxSize1{
	text-align:center;
	float:left;
	margin-left:50px;
}
#boxSize2{
	text-align:center;
	float:left;
	margin-left:10px;
}
#boxSize3{
	text-align:center;
	float:left;
	margin-left:10px;
}
#boxSize4{
	text-align:center;
	float:left;
	margin-left:10px;
}

#loginForm{
	text-align:center;
	width:600px;
	hegiht:146px;
	border-radius:30px;
}
.input_wrap1 input{
	width:380px;
	height:29px;
	margin:5px;
}
input:focus{
	outline: 1px solid blue;
}
.input_wrap2 input{
	width:380px;
	height:29px;
	margin:5px;
}
.input_wrap3 button{
	width:400px;
	height:50px;
	margin:5px;
	background-color:#2070eb;
	border-color:#2070eb;
	color: white;
	cursor: pointer;
}
#bannerEvent { /*광고배너*/
	width:200px;
	margin-top:29px;
}
#tailExplan{
	font-size:9px;
	width:430px;
	height:110px;
 	text-align:center; 
	margin-left:84px;
	margin-top:50px;
	position:absolute;
	bottom:0;
}
</style>
</head>

<body>
	<div id="bodyEntire"> <!-- body 전체 -->
		<div>
			<jsp:include page="/Header.jsp"/>
			<span><a href="https://www.naver.com/" class="notLogin">
				비로그인 주문조회
			</a></span>
		</div>
		<!-- 선택란 -->
		
		<div id="checkboxLogin">
			<label>
				<input type="checkbox" value="" class="logMaintain">로그인 상태 유지
			</label>
			<label class="members">				
				<input type="radio" value="" onclick="generalMembershipFnc()">일반회원
			 	<input type="radio" value="협력관리자로그인 페이지로 이동" onclick="partnerManagerFnc()">협력사관리자
			</label>
		</div>
		<!-- 로그인   -->
		<form method="post" id="loginForm" action='./loginForm'>
			<div class="input_wrap1">  <!--  337*29 --> 
				<input type="text" placeholder="아이디/인증 이메일" required
					style="padding:10px" name="id">
			</div>	
<!-- 			 서치바 안에 저장 버튼 <input type="button" value="저장">   -->
			<div class="input_wrap2">
				<input type="password" placeholder="비밀번호" required
					style="padding:10px" name="pwd">
			</div>
			<div class="input_wrap3">
				<button type="submit" id="loginBtn">로그인</button>
			</div>					
		</form>
			<!-- 아이디,비번,회원가입 -->
			<div id="findLog">
				<a href="findLogin.jsp">아이디 찾기 | </a>
				<a href="findPassword.jsp">비밀번호 찾기 | </a>
				<a href="../join/JoinForm.jsp">회원가입</a>
			</div>
			<!-- 이미지 4개   -->
		<div id="fontSize">
			<div id="boxSize1">
				<span><img alt="네이버" src="../img/naverlogo.jpg"
					style="width: 68px; height: 68px;">
				<br>네이버</span>
			</div>
			<div id="boxSize2">
				<span><img alt="카카오" src="../img/kakaologo.jpg"
					style="width: 68px; height: 68px;">
				<br>카카오 로그인</span>
			</div>
			<div id="boxSize3">
				<span><img alt="페이스북" src="../img/facebook.png"
					style="width: 68px; height: 68px;">
				<br>페이스북 로그인</span>
			</div>
			<div id="boxSize4">
				<span><img alt="구글" src="../img/enurilogo.jpg"
					style="width: 68px; height: 68px;">
				<br>에누리 로그인</span>
			</div>
			
			<div id="bannerEvent">
				<a href="https://www.google.com/webhp?hl=ko&sa=X
				&ved=0ahUKEwiHrv-gkdGAAxXJ-zgGHefDBK0QPAgI">
				<img alt="광고 배너" src="../img/banner.png" 
					style="width:400px; height:80px; margin:14px;" onclick="">
				</a>	
			</div>
		</div>
			<!-- footer -->
		<div>
			<jsp:include page="/Tail.jsp"/>
		</div>
	</div>
</body>



</html>