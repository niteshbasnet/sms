<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td><spring:message code="course.CourseId"></spring:message></td>
			<td>${course.courseId}</td>
		</tr>
		<tr>
			<td><spring:message code="course.Entry"></spring:message></td>
			<td>${course.entry}</td>
		</tr>
		<tr>
			<td><spring:message code="course.Name"></spring:message></td>
			<td>${course.name}</td>
		</tr>
		<tr>
			<td><spring:message code="course.MinGrade"></spring:message></td>
			<td>${course.minimumGrade}</td>
		</tr>
		<tr>
			<td><spring:message code="course.Professor"></spring:message></td>
			<td>${course.professor}</td>
		</tr>
	</table>
</body>
</html>