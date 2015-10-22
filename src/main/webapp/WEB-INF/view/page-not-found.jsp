<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>404 Error!</title>
</head>
<body>
	<h1>Page Not Found</h1>
	<h3>404</h3>
<p><button type=button onclick=window.location.href="<spring:url value="/dashboard" />">Home</button></p>	
<img src="<spring:url value="/resource/images/error.png" />"	alt="Page not found  JSP!!!" />
		
</body>
</html>