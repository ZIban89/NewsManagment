<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/viewNews.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/editNews.css" />
</head>
<body><div>
<form:form action="${pageContext.request.contextPath}/save" modelAttribute="newsForm" method="POST">
	<form:input path="id" cssStyle="visibility:hidden"/>
	<form:input path="contentId" cssStyle="visibility:hidden"/>
	<div class="qwe">
		<div class="banner">
			<spring:message code="messages.viewNews.title" />
		</div>
		<div class="newsViewContent"><form:input cssClass="newsEditFields" path="title"/><form:errors  path="title" cssClass="error" /></div>
	</div>
	<div class="qwe">
		<div class="banner">
			<spring:message code="messages.viewNews.date" />
		</div>
		<div class="newsViewContent"><form:input cssClass="newsEditFields" path="date"/><form:errors path="date" cssClass="error" /></div>
	</div>
	<div class="qwe">
		<div class="banner">
			<spring:message code="messages.viewNews.brief" />
		</div>
		<div class="newsViewContent"><form:textarea cssClass="newsEditFields newsEditBrief" path="brief"></form:textarea><form:errors path="brief" cssClass="error" /></div>
	</div>
	<div class="qwe">
		<div class="banner">
			<spring:message code="messages.viewNews.content" />
		</div>
		<div class="newsViewContent"><form:textarea cssClass="newsEditFields newsEditContent" path="content"></form:textarea><form:errors path="content" cssClass="error" /></div>
	</div>
	<div id="newsViewButtons">
		<input type="submit" value="<spring:message code="messages.editNews.save"/>" />
		<input type="submit" value="<spring:message code="messages.editNews.cancel"/>" onclick="javascript:history.back(); return false;" />
	</div>
	</form:form>
</div>
</body>