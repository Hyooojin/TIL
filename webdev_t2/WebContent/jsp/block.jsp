<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	int count = 0;
	String bad_user_ip = "70.12.50.52";
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
실습 :
옆사람이 접근시 declaration에 접속카운트를 저장하는 변수를 누적
짝수번째 접근시 차단 메시지....

홀수번째 접근시는 "당신의 아이피는 x,x,x,x입니다."
짝수번째 접근시는 "당신은 불량유저이므로 접속을 차단합니다." 
-->
<%

if (request.getRemoteAddr().equals(bad_user_ip)) {
	count++;
	if (count % 2 != 0) {
		out.println("당신의 아이피는 " + bad_user_ip + "입니다.");
	} else {
		out.println("당신은 불량유저이므로 접속을 차단합니다.");
	}
}
%>
<img src="../img/richard.jpg" width="800" />
</body>
</html>