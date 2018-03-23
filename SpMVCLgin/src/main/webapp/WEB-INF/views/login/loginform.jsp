<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- include-head -->
<%@ include file="/WEB-INF/include/include-head.jspf"%>
<style>
h3.info {
	color: blue;
}
.war {
	color: red;
}
</style>
</head>
<body>

	<header>
		<h2>로그인</h2>
	</header>

	<!-- include-navigation -->
	<%@ include file="/WEB-INF/include/include-nav.jspf"%>

	<article>
		<form action="/login/loginok.good" method="post">
			<h3 class="info">로그인 정보를 입력한 후 버튼을 누르세요</h3>
			<script type="text/javascript">
			alert(param.login_message);
			</script>
			<h4 class="war">${param.login_message}</h4>

			<p>
				ID : <input type="text" name="userId">
			</p>

			<p>
				PW : <input type="password" name="pwd">
			</p>

			<p>
				<input type="submit" value="로그인">
		</form>
	</article>

	<!-- include-footer -->
	<%@ include file="/WEB-INF/include/include-footer.jspf"%>

</body>
</html>