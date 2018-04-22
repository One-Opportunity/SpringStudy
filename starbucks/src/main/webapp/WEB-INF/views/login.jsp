<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:import url="/WEB-INF/views/inc/head.jsp" />
<script>
	$(document).ready(function(){
		$("#btnLogin").click(function(){
			if($("#frmLogin").valid()){
				$("#frmLogin").submit();
			}	
		});
	});
</script>
</head>

<body>

	<div id="loginWrap">
		<div id="login">
			<h1>Administrator Login</h1>
			<form id="frmLogin" name="frmLogin" method="post" action="${_ctx}/security/login"
				target="_self" title="로그인" class="login_area">

				<dl>
					<dt>id</dt>
					<dd>
						<input type="text" id="loginId"name="loginId" placeholder="User ID" data-msg-required="필수입니다. 알겠습니까?" required="required" >
					</dd>
					<dt>pw</dt>
					<dd>
						<input type="password" id="loginPw"name="loginPw" placeholder="Password" title="pw" required>
					</dd>
				</dl>

				<a href="javascript:;" id="btnLogin" class="loginBtn">login</a> 
				<a href="/starbucks/join.god" class="joinBtn">join</a>

			</form>

		</div>



	</div>

</body>
</html>
