<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
</head>
<body>
	<c:if test="${not empty error}">
		<div class="alert alert-danger">
			<spring:message
				code="AbstractUserDetailsAuthenticationProvider.badCredentials" />
			<br />
		</div>
	</c:if>
	<form method="post"
		action="<spring:url value="/postLogin"></spring:url>">
		<center>
			<table border="1" width="30%" cellpadding="3">
				<thead>
					<tr>
						<th colspan="2">Login Here</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td><spring:message code="userName" /></td>
						<td><input type="text" name="username" value="" /></td>
					</tr>
					<tr>
						<td><spring:message code="password" /></td>
						<td><input type="password" name="password" value="" /></td>
					</tr>
					<tr>
						<td><input type="submit" value="Login" /></td>
						<td><input type="reset" value="Reset" /></td>
					</tr>
					<tr>
						<td colspan="2"><spring:message code="not.registered.msg" />!!
							<a href="reg.jsp">Register Here</a></td>
					</tr>
				</tbody>
			</table>
		</center>
	</form>
</body>
</html>
