<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	int global_count = 0;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int local_count = 0;

	++local_count; 
	++global_count;
	out.println("local_count : " + local_count + "<br/>");
	out.println("global_count : " + global_count + "<br/>");
%>
</body>
</html>