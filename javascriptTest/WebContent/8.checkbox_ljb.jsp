<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>checkbox</title>
<!-- checkbox는 체크가 되면 true를 반환한다      -->
<script type="text/javascript">

	// bool = this.checked : name이 all인 체크박스의 체크속성( ture, false )
// 		function allSel(bool){
// 		var songList = document.getElementsByName('rain');
// 		for(var i = 0; i < songList.length; i++){
// 			songList[i].checked = bool;
// 		}
// 	}
	var checkSelectAll = false;
	function allSel() {
		var songList = document.getElementsByName('rain');
		
		if(checkSelectAll) {
			for (var i = 0; i < songList.length; i++) {
				songList[i].checked = false;
			}
			checkSelectAll = !checkSelectAll;
		}else {
			for (var i = 0; i < songList.length; i++) {
				songList[i].checked = true;
			}
			checkSelectAll = !checkSelectAll;
		}
	}
	
	function likeSong() {
		
		var songListStr = '';
		var songList = document.getElementsByName('rain');
		
		var count = 0;
		
		for (var i = 0; i < songList.length; i++) {
			if(songList[i].checked){
				if(count > 0){
					songListStr = songListStr + ', ';
					count--;
				}
				songListStr = songListStr + songList[i].value;
				count++;
			}
		}
		alert(songListStr);
	}
	
</script>
<style type="text/css">
table ,tr, td{ 
 	border: 1px solid;
 	padding: 5px;
 	border-spacing: 0px;
 	
 } 
</style>
</head>
<body>
	<form>
		<table>
			<tr>
				<td>비오는 날 들으면 죽여주는 노래?</td>
			</tr>
			<tr>
				<td>
					<input type="checkbox" onclick="allSel(this.checked);">전체선택<br>
					<!-- this는 자신의 값을 반환 -->
					<input type="checkbox" name="rain" value="비오는 날의 수채화">비오는 날의 수채화<br>
					<input type="checkbox" name="rain" value="사랑은 비를 타고">사랑은 비를 타고<br>
					<input type="checkbox" name="rain" value="rainism">rainism<br>
					<input type="checkbox" name="rain" value="비와당신">비와당신<br>
				</td>
			</tr>
			<tr>
				<td>
					<input type="button" value="노래목록!!" onclick="likeSong();">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>