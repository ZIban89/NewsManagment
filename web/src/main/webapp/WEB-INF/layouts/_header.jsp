<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<div id="header">
	<div id="headerTitle">
		<h2><spring:message code="messages.header.title"/></h2>
	</div>
	<div id="headerLocale">
		<a href="?lang=en"><spring:message code="messages.header.language.eng"/></a> <a href="?lang=ru"><spring:message code="messages.header.language.rus"/></a>
	</div>
</div>