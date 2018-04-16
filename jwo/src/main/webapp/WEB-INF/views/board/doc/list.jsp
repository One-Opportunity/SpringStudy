<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<c:import url="/WEB-INF/views/inc/head.jsp" />
<script>
$(function(){
	var mapId = $("#mapId").val();
	$("#btnWrite").click(function(){
		console.log(mapId);
		document.location.href = "${_ctx}/board/doc/write.god?mapId=" + mapId;
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
					<h1>목록 페이지</h1>
				</div>

				<!-- 검색 시작 -->
				<form id="searchEngine" method="post" name="searchEngine" action="#" target="_self" title="검색" class="search_area">
				<input type="hidden" name="mapId" id="mapId" value="${mapId}"/>
					<dl>
						<dt>input[type=radio]</dt>
						<dd>
							<label for="radio1"><input type="radio" id="radio1"> radio1</label> <label for="radio2"><input type="radio" id="radio2">
									radio2</label> <label for="radio3"><input type="radio" id="radio3"> radio3</label>
						</dd>
						<dt>input[type=check]</dt>
						<dd>
							<label for="check1"><input type="checkbox" id="check1"> check1</label> <label for="check2"><input type="checkbox" id="check2">
									check1</label> <label for="check3"><input type="checkbox" id="check3"> check3</label>
						</dd>
						<dt>input[type=text]</dt>
						<dd>
							<input type="text" id="text1" placeholder="글자입력" title="입력">
						</dd>
						<dt>select</dt>
						<dd>
							<select name="select" title="선택">
								<option value="select1">select1</option>
								<option value="select2">select2</option>
								<option value="select3">select3</option>
							</select>
						</dd>
						<dt>input[type=submit]</dt>
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
