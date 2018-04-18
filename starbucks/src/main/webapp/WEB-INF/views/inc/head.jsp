<%@ page language="java" contentType="text/html; charset=UTR-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="_ctx" value="${pageContext.request.contextPath == '/' ? '' : pageContext.request.contextPath}" scope="application"/>



<!-- css -->
<link href="${_ctx}/res/css/base.css" rel="stylesheet" type="text/css" />
<link href="${_ctx}/res/css/layout.css" rel="stylesheet" type="text/css" />

<!-- js -->
<script type="text/javascript" src="${_ctx}/res/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="${_ctx}/res/js/validate/jquery.validate.js"></script>
<script type="text/javascript" src="${_ctx}/res/js/validate/additional-methods.js"></script>
<script type="text/javascript" src="${_ctx}/res/js/validate/localization/messages_ko.min.js"></script>
<script type="text/javascript" src="${_ctx}/res/js/validate/meiomask.js"></script>
<script type="text/javascript" src="${_ctx}/res/js/dtree/dtree.js"></script>
<script type="text/javascript" src="${_ctx}/res/js/main.js"></script>
    