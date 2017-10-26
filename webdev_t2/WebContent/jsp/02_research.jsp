<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon" href="/favicon.ico" />
</head>
<body>
	<h2>설문 조사 결과</h2>
	이름: <Strong><%=
		 request.getParameter("name")
	%></Strong><br /> 성별: <Strong><%=
		 request.getParameter("gender")
	%></Strong><br /> 당신이 좋아하는 계절은
	<Strong><%
	try {
		String[] season = request.getParameterValues("season");
		for (int i = 0; i < season.length; i++) {
			out.print(" " + season[i]);
		}
		out.print("입니다");
	} catch(NullPointerException e) {
		out.print("없습니다");
	}
	%></Strong>
	
	<br />

	<a href="javascript:history.back()"> 다시 </a>
</body>
</html>