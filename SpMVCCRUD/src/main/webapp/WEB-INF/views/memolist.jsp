<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
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
		<h3>리스트</h3>
		<table>
			<tr>
				<th>No</th>
				<th>작성자</th>
				<th>메모</th>
			</tr>
			<c:choose>
				<c:when test="${fn:length(memolist) > 0 }">
					<c:forEach var="item" items="${memolist}">
						<tr>
							<td>${item.getId()}</td>
							<td>${item.getName()}</td>
							<td><a href="/crud/delete.jwo?id=${item.getId()}">${item.getMemo()}</a></td>
						</tr>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<tr>
						<td colspan=4>조회된 데이터가 없다</td>
					</tr>
				</c:otherwise>
			</c:choose>
		</table>
		<a href="/crud/memowrite.jwo">메모작성</a>
	</article>

	<!-- include-footer -->
	<%@ include file="/WEB-INF/include/include-footer.jspf"%>

</body>
</html>