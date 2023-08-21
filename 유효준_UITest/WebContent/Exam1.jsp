<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<style type="text/css">
table, tr, td {
	border: 1px solid black;
}

table {
	border-collapse: collapse;
	width: 210px;
}

</style>

<title>회원가입</title>

<script type="text/javascript">
	
	function registerFnc() {
		
		 	var id = document.getElementById('id').value;
	        var name = document.getElementById('name').value;
	        var pwd = document.getElementById('pwd').value;
	        var pwdChk = document.getElementById('pwdChk').value;


	        // 아이디 입력 여부 확인
	        if (id === '') {
	            alert('아이디를 입력하세요!');
	            document.getElementById('id').focus();
	           	return;
	        }
	        // 이름 입력 여부 확인
	        if (name === '') {
	            alert('이름을 입력하세요!');
	            document.getElementById('name').focus();
	            return;
	        }
	        // 비밀번호 입력 여부 확인
	        if (pwd === '') {
	            alert('비밀번호를 입력하세요!');
	            document.getElementById('pwd').focus();
	            return;
	        }
	        // 비밀번호 확인 입력 여부 확인
	        if (pwdChk === '') {
	            alert('비밀번호 확인란을 입력하세요!');
	            document.getElementById('pwdChk').focus();
	            return;
	        }
	      
	        //비밀번호 비밀번호 확인 
	        if (pwd !== pwdChk) {
	            alert('패스워드가 틀립니다.\n다시 확인하세요!!'); 
	            document.getElementById('pwdChk').value = '';
	            document.getElementById('pwdChk').focus();
	            return;
        	}
	        
	        // 오류가 없을 경우 가입 처리를 진행
	        alert('성공적으로 가입이 되었습니다.');
	}
	
	function deleteAllFnc() {
		document.getElementById('id').value = '';
        document.getElementById('name').value = '';
        document.getElementById('pwd').value = '';
        document.getElementById('pwdChk').value = '';
	}

</script>
</head>
<body>

	<form action="#" method="post">
		<table id='userAccountTable'>
			<tr>
				<td>id</td>
				<td><input type="text" id='id' class='id' name="id" size="15"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" id='name' class='name' name="name" size="15"></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="password" id='pwd' class='pwd' name="pwd" size="15"></td>
			</tr>
			<tr>
				<td>password확인</td>
				<td><input type="password" id='pwdChk' class='pwdChk' name="pwdChk" size="15"></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: right;">
				<button type="button" class="joinBtn" onclick="registerFnc()">가입</button>
				<button type="button" class="cancelBtn" onclick="deleteAllFnc()">취소</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>