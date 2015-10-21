<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form commandName="course" action="/addCourse" method="post">
		<fieldset>
			<legend>Add Course Form</legend>
			<%-- <p>
				<spring:message code="course.Courseid"></spring:message>
				<form:select id="courseId" path="courseId" items="${studentId}" />
			</p> --%>
			<p>
				<spring:message code="course.CourseId"></spring:message>
				<form:input path="courseId" />
			</p>
			<p>
				<spring:message code="course.Name"></spring:message>
				<form:input path="name" />
			</p>
			<p>
				<spring:message code="course.MinGrade"></spring:message>
				<form:input path="minimumGrade" />
			</p>
			<p>
				<spring:message code="course.Professor"></spring:message>
				<form:input path="professor" />
			</p>
			<input type="submit">
		</fieldset>
	</form:form>

</body>
</html>