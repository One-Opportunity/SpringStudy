<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
.war {
	color: red;
}
.info{
	color: blue;
}

</style>
</head>
<body>
<header>
	<h2>로그인을 해야합니다.</h2>
</header>

<article>
	<h5 class="info"> ${param.msg}</h5>
	<a href="/simple/login.bita">로그인 하기</a>
</article>
</body>
</html>