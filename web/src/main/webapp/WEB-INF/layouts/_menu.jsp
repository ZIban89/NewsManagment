<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<div id="menu">
	<div id=menuTitle>
		<spring:message code="messages.menu.title" />
	</div>
	<div id="menuNavigation">
		<div><a href="${pageContext.request.contextPath}"><spring:message code="messages.menu.newsListLink" /></a></div>
		<div><a href="${pageContext.request.contextPath}/edit/-1"><spring:message code="messages.menu.addNewsLink" /></a></div>
	</div>
</div>