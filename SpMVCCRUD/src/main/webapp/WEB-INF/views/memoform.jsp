<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- include-head -->
<%@ include file="/WEB-INF/include/include-head.jspf"%>
</head>
<body>

	<header>
		<h2>나의 메모장</h2>
	</header>

	<!-- include-navigation -->
	<%@ include file="/WEB-INF/include/include-nav.jspf"%>

	<article>
		<form action="/crud/writeok.jwo" method="post">
			<h3>메모작성</h3>
			<p>
				작성자 : <input type="text" name="name">
			</p>
			<p>
				메모 :
				<textarea rows="5" name="memo"></textarea>
			<p>
				<input type="submit" value="저장">
			</p>
			</p>
		</form>
	</article>

	<!-- include-footer -->
	<%@ include file="/WEB-INF/include/include-footer.jspf"%>

</body>
</html>