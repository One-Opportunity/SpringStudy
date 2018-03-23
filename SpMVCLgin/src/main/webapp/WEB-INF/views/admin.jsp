<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
					<!-- include-head -->
<%@ include file="/WEB-INF/include/include-head.jspf" %>
</head>
<body>
	
	<header>
		<h2>관리자 페이지</h2>
	</header>
	
					<!-- include-navigation -->
	<%@ include file="/WEB-INF/include/include-nav.jspf" %>

	<article>
		<h3>관리자페이지에 접속되었습니다.</h3>
		
		<p>ID : ${sessionScope.admin.userId }</p>
		<p>PW : ${sessionScope.admin.pwd }</p>
		<p>PW : ${sessionScope.admin.auth}</p>
		<p>PW : ${sessionScope.admin.auth}</p>
		<p>
		<p><a href = "/login/logout.good">로그아웃</a></p>
	</article>
	
					<!-- include-footer -->
	<%@ include file="/WEB-INF/include/include-footer.jspf" %>

</body>
</html>