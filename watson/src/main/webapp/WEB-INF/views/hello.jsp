<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon" href="../favicon1.ico"/>
</head>
<body>
${msg}
<c:forEach items='${voices}' var="voice">
${voice.description}<br/>
</c:forEach>
</body>
</html>