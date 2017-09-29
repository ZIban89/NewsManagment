<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>

<title><tiles:insertAttribute name="title" ignore="true" /></title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/mainStyle.css" />
</head>
<body>
	<tiles:insertAttribute name="header" />
	<div id="pageContent">
		
		<tiles:insertAttribute name="menu" />
		<div id="body">
			<a href="${pageContext.request.contextPath}">News>></a><tiles:insertAttribute name="title" />
			<tiles:insertAttribute name="body" />
		</div>
	</div>
	<tiles:insertAttribute name="footer" />
	
	
	
	<script
		src="${pageContext.request.contextPath}/resources/del-btn-script.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/del-news-script.js"></script>
</body>
</html>