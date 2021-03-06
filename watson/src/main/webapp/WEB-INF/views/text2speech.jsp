<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon" href="../favicon1.ico"/>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="<c:url value="/resources/js/jquery-3.2.1.js"/>"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" ></script>

<script type="text/javascript">
$(document).ready(function(){
	$('#speak').click(function(){
		$('#myaudio').stop();
		$('#myaudio').attr('src','speaker?&' + $('#myform').serialize());
		$('#myaudio').attr('autoplay','autoplay');
	});
});
</script>

</head>
<body>

<form id="myform" method="post"> <!-- view파일에서 form이 하나 필요하다. -->
text2speech sample example<br/>
	<div class="container">
		<div class="jumbotron">
			<h2>text2speech sample example</h2>
			<br />
			<p>텍스트의 내용은 선택한 보이스의 언어와 일치해야 합니다. 혼합언어 (예: 영어 텍스트와 일본 여성음성)는
				유효한 결과를 생성하지 않습니다. 한글은 조만간 지원됩니다.</p>
		</div>
	
	<div class="row">
		<div class="col-lg-12 col-sm-12">
			<textarea rows="7" name="statement" class="form-control">
いかに利己的であるように見えようと、
人間本性のなかには、他人の運命に関心をもち、
他人の幸福をかけがえのないものにするいくつかの推進力が含まれている。
人間がそれから受け取るものは、
それを眺めることによって得られる喜びの他に何もない。
哀れみや同情がこの種のもので、他人の苦悩を目の当たりにし、
事態をくっきりと認識したときに感じる情動に他ならない。
		</textarea>
	</div>
</div><br/>

			<div class="row">
				<div class="col-lg-10 col-sm-10">
					<select name="voice" class="form-control">
						<c:forEach items="${voices}" var="voice">
							<option value="${voice.name}">${voice.language }:
								${voice.description}</option>
						</c:forEach>
					</select>
				</div>
				<div class="col-lg-2 col-sm-2">
					<input type="button" id="speak" value="읽기"
					class="btn btn-default btn-success btn-block" />
				</div>
			</div>
		</div>
		
		
<div class="container">
	<div class="row">
		<div class="col-lg-12">
			<audio id="myaudio" controls="controls" preload="auto" />
		</div>
	</div>
</div>
</form>
</body>
</html>