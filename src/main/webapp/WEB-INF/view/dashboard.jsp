<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<security:authorize access="isAuthenticated()">
		Welcome <security:authentication property="username"/>
	</security:authorize>
	<a href="<spring:url  value="/doLogout" />"
		class="btn btn-danger btn-mini pull-right">Logout</a>
	<h1>This is dashboard</h1>

</body>
</html>