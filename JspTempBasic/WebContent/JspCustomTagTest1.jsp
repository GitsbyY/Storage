<%@page import="ezen.com.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JspCustomTagBasic1</title>

	<script type="text/javascript">
	
	</script>
</head>

<body>
<!-- 	학생   번호 -->
<!-- 	이름 -->
<!-- 	반명       -->
<!-- 	DTO클래스  -->
	      
<!-- 	3명의 임의의 학생을 list에 담고 -->
	      
<!-- 	익스프레션을 활용하여 div태그에 각각 학생 정보를 출력하시오 -->
	
	<h1>회원목록</h1>
	<%
		MemberDto member1 = new MemberDto(1, "임정빈", "API");
		MemberDto member2 = new MemberDto(2, "박지훈", "백엔드");
		MemberDto member3 = new MemberDto(3, "이승준", "DB");
		
		ArrayList<MemberDto> memberList = new ArrayList<MemberDto>();
		
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
		
		for(MemberDto memberDto : memberList){
			
	%>
		<div style="border: 1px solid black; width : 200px;">
			<%=memberDto.getNo()%>
			<%=memberDto.getName()%>
			<%=memberDto.getBanName()%>
		</div><br>
			<%
		}
			%>
</body>

</html>