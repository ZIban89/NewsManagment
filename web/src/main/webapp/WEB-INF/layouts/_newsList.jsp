<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/newsList.css" />

</head>
<body>
	<form action="delete" id="deleteForm" name="deleteForm">
		<div id="newsList">
			<c:forEach var="news" items="${newsList}">
				<c:url var="viewLink" value="view/${news.id }" />

				<div class="news">
					<div class="newsDate">
						<fmt:formatDate value="${news.date}" dateStyle="short" />
					</div>
					<div class="newsTitle">${news.title}</div>
					<div class="newsBrief">${news.brief}</div>
					<div class="newsActions">
						<div id="viewNews">

							<a href="${viewLink}"><spring:message
									code="messages.newsList.view" /></a>
						</div>
						<div class="editNews">
							<a href="${pageContext.request.contextPath}/edit/${news.id}"><spring:message
									code="messages.newsList.edit" /></a>
						</div>
						<div class="deleteNewsCheckbox">
							<input type="checkbox" name="id" value="${news.id}">
						</div>
					</div>
				</div>
			</c:forEach>
			
		</div>
		<div id="delBtn">
			<input type="submit" id="delNewsBtn"
				value="<spring:message code="messages.newsList.delete"/>"
				disabled="disabled" onClick="return delFunction()" />
		</div>
	</form>
</body>
