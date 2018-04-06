<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<c:import url="/WEB-INF/views/inc/head.jsp" />
<script>
	$(document).ready(function() {
		$("input").focus(function(){
			$(this).css("background-color", "#DDDDDD");
		})
	    $("input").blur(function(){
	        $(this).css("background-color", "#ffffff");
	    });
		$("#userId").focus();
	});
</script>
</head>

<body>

	<div id="loginWrap">


		<div id="login">
			<h1>로그인 페이지</h1>
			<form id="loginBlock" name="loginBlock" action="#" method="post">

				<dl>
					<dt>id</dt>
					<dd>
						<input type="text" id="userId" name="id" placeholder="User ID" autofocus title="ID" />
					</dd>
					<dt>pw</dt>
					<dd>
						<input type="password" name="pw" placeholder="Password" title="pw">
					</dd>
				</dl>

				<a href="list.html" class="loginBtn">로그인</a> <a
					href="${_ctx}/join.sc" class="joinBtn">회원가입</a>

			</form>

		</div>



	</div>

</body>
</html>
