<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<c:import url="/WEB-INF/views/inc/head.jsp" />

<script>
	$(document).ready(function() {
		$("#phone").setMask();
		$("input").focus(function(){
			$(this).css("background-color", "#DDDDDD");
		})
	    $("input").blur(function(){
	        $(this).css("background-color", "#ffffff");
	    });
		$("#userId").focus();
		// "저장" 버튼을 클릭 했을때
		$("#btnSave").click(function() {
			// javascript로 form 전송
			// frmJoin.submit();

			// 검증에 통과하면	
			if($("#frmJoin").valid()) {
				
				$.get("${_ctx}/captcha/isRight", {captcha : $("#captcha").val()}, function(data){
					if(data==1){
				//서버에 데이터 전송	
						var url = "${_ctx}/join.sc";
						$.post(url, $("#frmJoin").serialize(), function(data) {

						if (data == "s") {
							alert("회원가입 성공");
							document.location.href="/jwo/index.sc"
						} else {
							alert("회원가입 실패!!");
							}
						});
					} else{
						alert("문자가 다릅니다.");
					}
				});
			}
		});
	});
</script>
</head>

<body>

	<div id="loginWrap">


		<div id="join">
			<h1>회원가입</h1>
			<form id="frmJoin" name="frmJoin">
				<dl>
					<dd>
						<input type="text" id="userId" name="loginId" placeholder="아이디"
							maxlength="15" minlength="6" required />
					</dd>
					<dd>
						<input type="password" id="loginPw" name="loginPw"
							placeholder="비밀번호" maxlength="15" minlength="8" required />
					</dd>
					<dd>
						<input type="password" name="reLoginPw" placeholder="비밀번호확인"
							maxlength="15" minlength="8" equalTo="#loginPw" required />
					</dd>
					<dd>
						<input type="text" name="name" placeholder="이름" maxlength="30"
							required />
					</dd>
					<dd>
						<input type="text" id="phone" name="phone" placeholder="핸드폰번호"
							alt="mobile" maxlength="13" required />
					</dd>
					<dd>
						<input type="email" name="email" placeholder="이메일" maxlength="20"
							required />
					</dd>
					<dd>
						<img src="${_ctx}/captcha/index" /> <input type="text"
							name="captcha" id="captcha" placeholder="문자를 입력하세요"
							style="width: 238px;" required />
					</dd>
				</dl>

				<a href="javascript:;" class="loginBtn" id="btnSave">저장</a> <a
					href="${_ctx}/index.sc" class="joinBtn">취소</a>
			</form>
		</div>
	</div>
</body>
</html>
