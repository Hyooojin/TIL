<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<a href="display">display voices</a>
<a href="text2speech">watson: text2speech</a>
<a href="weather">watson : Natural Language Classifier(날씨에 따른 온도와 조건구분)</a>
</body>
</html>
