<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<c:import url="/WEB-INF/views/inc/head.jsp" />
<script>
	$(function() {
		var mapId = $("#mapId").val();
		$("#btnWrite")
				.click(
						function() {
							console.log(mapId);
							document.location.href = "${_ctx}/board/doc/write.god?mapId="
									+ mapId;
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
					<h1>${mapDTO.mapName}</h1>
				</div>
				
				
				<!-- 검색 시작 -->
				<form id="frmSearch" method="get" name="frmSearch" action="${_ctx}/board/doc/list.god" class="search_area">
					<input type="hidden" name="mapId" id="mapId" value="${mapDTO.mapId}" />
					<dl>
						<dd>
							<select name="searchType" style="height: 23px;">
								<option value="T">:: 검색조건 ::</option>
								<option value="T">제목</option>
								<option value="C">내용</option>
								<option value="TC">제목+내용</option>
								<option value="U">작성자</option>
							</select>
						</dd>
						<dd>
							<input type="text" name="searchText" placeholder="검색어" style="height: 20px;"/>
						</dd>
						<dd>
							<input type="submit" title="입력">
						</dd>
					</dl>
				</form>
				<!-- 검색 끝 -->

				<div class="boardWrap">

					<table class="base_tbl">
						<thead>
							<tr>
								<th width="8%">Num</th>
								<th>Subject</th>
								<th width="15%">date</th>
								<th width="10%">file</th>
								<th width="10%">view</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${list}" var="item">
								<tr>
									<td>${item.docId}</td>
									<td class="txtCut alignLeft"><a href="#">${item.title}</a></td>
									<td>${item.regDt}</td>
									<td>N</td>
									<td>${item.cntRead}</td>
								</tr>
							</c:forEach>
						</tbody>

					</table>

					<div class="btnSet">
						<a href="javascript:;" id="btnWrite" class="disPB btnBase">글쓰기</a>
					</div>
					<div id="paging">
						<p>
							<span class="numPN"><a href="#">«</a></span> <span class="numPN over left"><a href="#">&lt;</a></span> <span class="Present"><a href="#">1</a></span>
							<span><a href="#">2</a></span> <span><a href="#">3</a></span> <span><a href="#">4</a></span> <span><a href="#">5</a></span> <span><a
								href="#">6</a></span> <span><a href="#">7</a></span> <span><a href="#">8</a></span> <span><a href="#">9</a></span> <span class="dubble"><a
								href="#">10</a></span> <span class="numPN over right"><a href="#">&gt;</a></span> <span class="numPN"><a href="#">»</a></span>

						</p>
					</div>


				</div>
			</div>

		</div>
	</div>

</body>
</html>
