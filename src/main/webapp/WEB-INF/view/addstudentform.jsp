<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript"
	src="<spring:url value="/resource/js/ajax.js"/>"></script>
<script type="text/javascript">
	
</script>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="global">
  		<p>
  		     <form:errors path="*" /> 
        </p>	
		<form:form modelAttribute="newStudent"  action="addstudentform"  enctype="multipart/form-data" method="POST">
			<div id="student">
				<fieldset>
					<legend>Add a Student Information</legend>

					<form:errors path="*" element="div" />

					<form:input path="studentImage" type="file" />

					<div>
						<label> Student ID: </label>
						<div>
							<form:input id="studentId" path="studentId" type="text" />
							<form:errors path="studentId" />
						</div>
					</div>

					<div>
						<label> First Name: </label>
						<div>
							<form:input id="firstName" path="firstName" type="text" />
							<form:errors path="firstName" />
						</div>
					</div>

					<div>
						<label for="lastName">Last Name: </label>
						<div>
							<form:input id="lastName" path="lastName" type="text" />
							<form:errors path="lastName" />
						</div>
					</div>

					<div>
						<label for="gender">Gender: </label>
						<div>
							<form:input id="gender" path="gender" type="text" />
							<form:errors path="gender" />
						</div>
					</div>

					<div>
						<label for="dob">Date of Birth: </label>
						<div>
							<form:input id="dob" path="dob" type="text" />
							<form:errors path="dob" />
						</div>
					</div>

					<div>
						<label for="email">Email: </label>
						<div>
							<form:input id="email" path="email" type="text" />
							<form:errors path="email" />
						</div>
					</div>

					<div>
						<label for="phoneNumber">Phone Number: </label>
						<div>
							<form:input id="phoneNumber" path="phoneNumber" type="text" />
							<form:errors path="phoneNumber" />
						</div>
					</div>

					<div>
						<label for="entry">Entry: </label>
						<div>
							<form:select id="entry" path="entry">
								<form:option value="NONE" label="--- Select ---" />
								<form:option value="May" label="May" />
								<form:option value="Aug" label="Aug" />
							</form:select>
							<%-- <form:select id="entry" path="entry">
						<form: option value="May 2015" label="May 2015"/>
						<form: option value="August 2015" label="August 2015"/>
						<form:select/> --%>
							<!-- <select name="state">
								<option value="1">May 2015</option>
								<option value="2">August 2015</option>
								<option value="3">Febraury 2015</option>
								<option value="4">October</option>
							</select> -->
						</div>
					</div>

					<p id="buttons">
						<input id="btnnext" type="button" onClick="nextpage()"
							value="Go to the next page" />
						<!-- <input id="reset" type="reset" tabindex="4"> <input
						id="submit" type="submit" tabindex="5" value="Add Student"> -->
					</p>
				</fieldset>
			</div>

			<div id="address">
				<fieldset>
					<legend>Add Address</legend>

					<form:errors path="*" element="div" />
					<div>
						<label>City: </label>
						<div>
							<form:input id="city" path="address.city" type="text" />
							<form:errors path="address.city" />
						</div>
					</div>

					<div>
						<label>Street: </label>
						<div>
							<form:input id="street" path="address.street" type="text" />
							<form:errors path="address.street" />
						</div>
					</div>

					<div>
						<label> State: </label>
						<div>
							<form:input id="state" path="address.state" type="text" />
							<form:errors path="address.state" />
						</div>
					</div>

					<div>
						<label> Country: </label>
						<div>
							<form:input id="country" path="address.country" type="text" />
							<form:errors path="address.country" />
						</div>
					</div>
					<p id="buttons">
						<input id="btnnext" type="button" onClick="nextpage()"
							value="Go to the next page" class="form:input-large" />
						<!-- <input id="reset" type="reset" tabindex="4"> <input
						id="submit" type="submit" tabindex="5" value="Add Student"> -->
					</p>
				</fieldset>
			</div>


			<div id="course">
				<fieldset>
					<legend>Add Course</legend>
					<div id="courseSection"></div>
					<%-- 	<p>
						<label for="course">Course: </label>
						<form:select id="1" path="1">
							<form:option value="NONE" label="--- Select ---" />
						</form:select>
					</p> --%>

				</fieldset>
			</div>
			<p id="buttons">
				<input id="submit" type="submit" value="Add Student">
			</p>
		</form:form>
	</div>
</body>
</html>