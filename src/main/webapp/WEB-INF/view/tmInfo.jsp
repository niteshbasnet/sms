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
			$("#btnFindStudent").on('click', function() {
				console.log($("#studentId").val());
				populateTMForm($("#studentId").val());

			});
			function populateTMForm(studentId) {
				$.get("/StudentMGMT/getStudent/" + studentId, function(data) {					
					$("#tMRequirement").val(data.tMRequirement);
					$("#dCRequirement").val(data.dCRequirement);
					$("#tMLeft").val(data.tMLeft);
					$("#dCLeft").val(data.dCLeft);
				});
			}
		});
	</script>
	<div id="global">
		<h2 style="text-align: center;">${appName }</h2>
		<form:form commandName="tm" action="tmInfo" method="post">
			<fieldset>
				<legend>Add TM Requirement Form</legend>
				<spring:message code="addTMrequirement.StudentId"></spring:message>
				<form:input path="studentId" id="studentId" />
				<input type="button" id="btnFindStudent" value="Find" />
				<p>
					<spring:message code="addTMrequirement.tMRequirement"></spring:message>
					<form:input path="tMRequirement" id="tMRequirement" />
				</p>
				<p>
					<spring:message code="addTMrequirement.dCRequirement"></spring:message>
					<form:input path="dCRequirement" id="dCRequirement" />
				</p>
				<p>
					<spring:message code="addTMrequirement.tMLeft"></spring:message>
					<form:input path="tMLeft" id="tMLeft" />
				</p>
				<p>
					<spring:message code="addTMrequirement.dCLeft"></spring:message>
					<form:input path="dCLeft" id="dCLeft" />
				</p>
				<input type="submit">
			</fieldset>
		</form:form>

	</div>
</body>
</html>