<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="pagetag" uri="/WEB-INF/tlds/pagetag.tld"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<c:import url="/WEB-INF/views/inc/head.jsp" />
<script>
$(document).ready(function(){
	$('#headerui').children().children().eq(1).addClass('on');

})
// 조회페이지 이동
function goView(docId){
	$("#docId").val(docId);
	$("#frmView").submit();
}

</script>
</head>

<body>


	<div id="wrap">

		<c:import url="/WEB-INF/views/inc/header.jsp" />
		<c:import url="/WEB-INF/views/inc/left.jsp" />

		<div id="rightWrap">

			<div class="rightBlock">
				<div class="page_top">
					<h1>내가 등록한 게시판 정보</h1>
				</div>
				
				
				<!-- 검색 시작 -->
				

				<div class="boardWrap">

					<table class="base_tbl">
						<thead>
							<tr>
								<th width="6%">메뉴</th>
								<th width="8%">번호</th>
								<th>제목</th>
								<th width="15%">등록일자</th>
								<th width="10%">첨부파일</th>
								<th width="10%">조회수</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${list}" var="item">
								<tr>
									<td>${item.mapId}</td>
									<td>${item.docId}</td>
									<td class="txtCut alignLeft">
									
									<a href="javascript:goView('${item.docId}');">${item.title}</a>
<%-- 									<a href="${_ctx}/board/doc/view.god?docId=${item.docId}&${search.params}"></a> --%>
									</td>
									<td><fmt:formatDate value="${item.regDt}" pattern="yyyy.MM.dd. HH시 mm분 " /></td>
									<td>N</td>
									<td><fmt:formatNumber value="${item.cntRead}"/></td>
								</tr>
							</c:forEach>
						</tbody>

					</table>




				</div>
			</div>

		</div>
	</div>
</body>
</html>
