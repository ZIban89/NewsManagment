<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/viewNews.css" />
</head>
<body>
	<div>
		<div class="qwe">
			<div class="banner">
				<spring:message code="messages.viewNews.title" />
			</div>
			<div class="newsViewContent">${news.title}</div>
		</div>
		<div class="qwe">
			<div class="banner">
				<spring:message code="messages.viewNews.date" />
			</div>
			<div class="newsViewContent"><fmt:formatDate value="${news.date}" dateStyle="short" /></div>
		</div>
		<div class="qwe">
			<div class="banner">
				<spring:message code="messages.viewNews.brief" />
			</div>
			<div class="newsViewContent">${news.brief}</div>
		</div>
		<div class="qwe">
			<div class="banner">
				<spring:message code="messages.viewNews.content" />
			</div>
			<div class="newsViewContent">${news.content}</div>
		</div>
		<div id="newsViewButtons">
			<a 
				href="${pageContext.request.contextPath}/edit/${news.id }"><button> <spring:message code="messages.viewNews.edit"/></button> </a>
			<a 
				href="${pageContext.request.contextPath}/delete?id=${news.id }"><button onClick="return delFunction()"><spring:message code="messages.viewNews.delete"/></button></a>
		</div>
	</div>
</body>