<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
					<!-- include-head -->
<%@ include file="/WEB-INF/include/include-head.jspf" %>
<style>
	h3.war{
		color : red;
	}
</style>
</head>
<body>
	
	<header>
		<h2>관리자 페이지</h2>
	</header>
	
					<!-- include-navigation -->
	<%@ include file="/WEB-INF/include/include-nav.jspf" %>

	<article>
		<h3 class="war">관리자로 로그인 해야 합니다.</h3>
		
		<p></p>
		<p><a href="/login/login.good">로그인 바로가기</a> </p>

	</article>
	
					<!-- include-footer -->
	<%@ include file="/WEB-INF/include/include-footer.jspf" %>

</body>
</html>