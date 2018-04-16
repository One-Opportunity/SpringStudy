<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:import url="/WEB-INF/views/inc/head.jsp" />

</head>

<body>

	<div id="loginWrap">


		<div id="login">
			<h1>Administrator Login</h1>
			<form id="loginBlock" method="post" name="loginBlock" action="#"
				target="_self" title="로그인" class="login_area">

				<dl>
					<dt>id</dt>
					<dd>
						<input type="text" name="id" placeholder="User ID" title="ID">
					</dd>
					<dt>pw</dt>
					<dd>
						<input type="password" name="pw" placeholder="Password" title="pw">
					</dd>
				</dl>

				<a href="list.html" class="loginBtn">login</a> 
				<a href="/starbucks/join.god" class="joinBtn">join</a>

			</form>

		</div>



	</div>

</body>
</html>
