<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${list}" var="item">
	<img src="/cafe/res/images/gugudan/${item.dan}.png" width="100" height="100">
	<img src="/cafe/res/images/gugudan/x.png" width="80" height="80">
 	<img src="/cafe/res/images/gugudan/${item.row}.png" width="100" height="100">
	<img src="/cafe/res/images/gugudan/=.png" width="80" height="80">	
 	 <c:forEach items="${item.arrStrNum}" var="result">
			<img src="/cafe/res/images/gugudan/${result}.png" width="100" height="100">
		</c:forEach>
		</br>
	</c:forEach>


</body>
</html>




