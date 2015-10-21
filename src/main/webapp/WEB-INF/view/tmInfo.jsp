<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-2.1.4.min.js"
	type="text/javascript"></script>
</head>
<body>
	<script type="text/javascript">
		$(function() {
			$("#studentId").on('change', function() {
				console.log($(this).val());
				populateTMForm($(this).val());

			});
			function populateTMForm(studentId) {
				alert(studentId);
				$.get("/StudentMGMT/getStudent/" + studentId, function(data) {
					alert(data);
				});
			}
		});
	</script>
	<div id="global">
		<h2 style="text-align: center;">${appName }</h2>
		<form:form commandName="student" action="/tmInfo" method="post">
			<fieldset>
				<legend>Add TM Requirement Form</legend>
				<p>
					<spring:message code="addTMrequirement.StudentId"></spring:message>
					<form:select id="studentId" path="id" items="${studentId}" />
				</p>
				<p>
					<spring:message code="addTMrequirement.tMRequirement"></spring:message>
					<form:input path="tm.tMRequirement" />
				</p>
				<p>
					<spring:message code="addTMrequirement.dCRequirement"></spring:message>
					<form:input path="tm.dCRequirement" />
				</p>
				<p>
					<spring:message code="addTMrequirement.tMLeft"></spring:message>
					<form:input path="tm.tMLeft" />
				</p>
				<p>
					<spring:message code="addTMrequirement.dCLeft"></spring:message>
					<form:input path="tm.dCLeft" />
				</p>
				<input type="submit">
			</fieldset>
		</form:form>

	</div>
</body>
</html>