<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="pagetag" uri="/WEB-INF/tlds/pagetag.tld"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<c:import url="/WEB-INF/views/inc/head.jsp" />

<script>
//목록으로 다시 이동
function goList(mapId){
	$("#mapId").val(mapId);
	$("#frmList").submit();
}
//수정화면으로 이동
function goUpdate(title, boardContents) {
	$("#title").val(title);
	$("#boardContents").val(boardContents);
	$("#frmUpdate").submit();
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
                <h1>Page Title</h1>
            </div>
            
            <div class="boardWrap">
                
                <table class="base_tbl">
                    <thead>
                        <tr>
                            <th colspan="6" class="t_color">${docDTO.title}</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td width="8%">첨부파일</td>
                            <td class="txtCut alignLeft"><a href="#"></a></td>
                            <td width="10%">작성일</td>
                            <td width="20%" class="t_color"><fmt:formatDate value="${docDTO.regDt}" pattern="yyyy.MM.dd. HH시 mm분" /></td>
                            <td width="10%">조회수</td>
                            <td width="20%" class="t_color">${docDTO.cntRead}</td>
                        </tr>
                        <tr>
                            <td colspan="6" class="alignLeft">
                            
                         		${docDTO.boardContents}
                            
                            </td>
                        </tr>
                    </tbody>
                </table>
                
                <div class="btnSet">
                    <a href="javascript:goList('${docDTO.mapId}')" class="disPB btnBase">목록</a>
                    <a href="${_ctx}/board/doc/write.god?mapId=${docDTO.mapId}" class="disPB btnBase">글쓰기</a>
                    <a href="javascript:goUpdate('${docDTO.title}','${docDTO.boardContents}')" class="disPB btnBase">수정</a>
                    <a href="" class="disPB btnBase">삭제</a>
                </div>
                
                <div class="replyWrap">
                	
                    <dl>
                    	<dt>작성자</dt>
                        <dd>
                        	<input type="text" name="replyName" placeholder="Name" title="replyName">
                        </dd>
                        <dt>내용</dt>
                        <dd>
                        	<textarea></textarea>
                        </dd>
                    </dl>
                    
                    <div class="btnSet alignCenter">
                        <a href="#" class="disPB btnBase">댓글등록</a>
                    </div>
                    
                    <table class="replyList">
                    	<tbody><tr>
                        	<th class="name">hong gil dong</th>
                            <td class="cont">내용이에요.내용이에요.내용이에요.내용이에요.내용이에요. <a href="#" class="disPB btnS">삭제</a></td>
                            <td class="date">2016-04-30</td>
                        </tr>
                        
                    </tbody></table>
                    
                </div>
                
               
            </div>
        </div>
    
    </div>
	</div>
	<form id="frmList" method="get" name="frmList" action="${_ctx}/board/doc/list.god" class="search_area">
	<input type="hidden" name="mapId" id="mapId"/>
	<input type="hidden" name="page" id="page" value="${search.page}" />
	<input type="hidden" name="searchType" id="searchType" value="${search.searchType}" />
	<input type="hidden" name="searchText" id="searchText" value="${search.searchText}" />
	</form>
	<form id="frmUpdate" method="post" name="frmUpdate" action="${_ctx}/board/doc/write.god" class="search_area">
	<input type="hidden" name="title" id="title"/>
	<input type="hidden" name="boardContents" id="boardContents"/>
	</form>
	
</body>
</html>
