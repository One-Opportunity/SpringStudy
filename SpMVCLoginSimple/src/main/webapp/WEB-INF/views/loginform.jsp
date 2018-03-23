<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
.padding{
padding: 1em;
}

</style>
</head>
<body>
	<form action="/simple/adminok.bita" method="post">
		<h2>로그인 결과화면입니다.</h2>
		<p>
			ID :	<input type="text" name="userId">
		</p>
		<p>
			PW :	<input type="password" name="pwd">
		</p>
		<p><input type="submit" value="로그인"></p>
	</form>
</body>
</html>