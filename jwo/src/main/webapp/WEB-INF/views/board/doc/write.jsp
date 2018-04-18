<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<c:import url="/WEB-INF/views/inc/head.jsp" />
<script>
$(document).ready(function(){
	
	$("#btnDocSave").click(function(){
		var mapId = $("#mapId").val();
		var url = "${_ctx}/board/doc/write.god?mapId=" + mapId;
		$.post(url, $("#frmWrite").serialize(), function() {
			document.location.href = "${_ctx}/board/doc/list.god?mapId=" + mapId;
		});
	});
});

</script>
</head>

<body>
	<div id="wrap">

		<c:import url="/WEB-INF/views/inc/header.jsp" />
		<c:import url="/WEB-INF/views/inc/left.jsp" />

		<div id="rightWrap">
    
    	<div class="rightBlock">
            <div class="page_top">
                <h1>Page Title</h1>
            </div>
            
            <div class="boardWrap">
                <form id="frmWrite" name="frmWrite" action="${_ctx}/board/doc/write.god" method="post">
                
                <input type="hidden" name="mapId" id="mapId" value="${mapId}"/>
                
                <table class="base_tbl tbl_write">
                	<tbody><tr>
                        <th width="20%" class="t_color">제목입력</th>
                        <td><input type="text" name="title" required="required"></td>
                    </tr>
                    <tr>
                        <th class="t_color">내용입력</th>
                        <td>
                        	<textarea name="boardContents" required="required"></textarea>
                        </td>
                    </tr>
                </tbody></table>
                
                <div class="btnSet alignCenter">
                    <a href="javascript:;" id="btnDocSave" class="disPB btnBase">저장</a>
                    <a href="${_ctx}/board/doc/list.god?mapId=${mapId}" class="disPB btnBase">취소</a>
                </div>
               </form>
            </div>
        </div>
    
    </div>
	</div>

</body>
</html>
