<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="global">
		<form:form modelAttribute="searchedStudent" method="POST"
			action="updatestudentform">
			<div id="student">
				<fieldset>
					<legend>Update a Student Information</legend>

					<form:errors path="*" cssClass="alert alert-danger" element="div" />

					<div class="form-group">
						<label> Student ID: </label>
						<div class="col-lg-10">
							<form:input id="studentId" path="studentId" type="text"
								class="form:input-large" />
							<form:errors path="studentId" cssClass="text-danger" />
						</div>
					</div>

					<div class="form-group">
						<label> First Name: </label>
						<div class="col-lg-10">
							<form:input id="firstName" path="firstName" type="text"
								class="form:input-large" />
							<form:errors path="firstName" cssClass="text-danger" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2" for="lastName">
							Last Name: </label>
						<div class="col-lg-10">
							<form:input id="lastName" path="lastName" type="text"
								class="form:input-large" />
							<form:errors path="lastName" cssClass="text-danger" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2" for="gender">
							Gender: </label>
						<div class="col-lg-10">
							<form:input id="gender" path="gender" type="text"
								class="form:input-large" />
							<form:errors path="gender" cssClass="text-danger" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2" for="dob">
							Date of Birth: </label>
						<div class="col-lg-10">
							<form:input id="dob" path="dob" type="text"
								class="form:input-large" />
							<form:errors path="dob" cssClass="text-danger" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2" for="email">
							Email: </label>
						<div class="col-lg-10">
							<form:input id="email" path="email" type="text"
								class="form:input-large" />
							<form:errors path="email" cssClass="text-danger" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2" for="phoneNumber">
							Phone Number: </label>
						<div class="col-lg-10">
							<form:input id="phoneNumber" path="phoneNumber" type="text"
								class="form:input-large" />
							<form:errors path="phoneNumber" cssClass="text-danger" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2" for="entry">
							Entry: </label>
						<div class="col-lg-10">

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
							value="Go to the next page" class="form:input-large" />
						<!-- <input id="reset" type="reset" tabindex="4"> <input
						id="submit" type="submit" tabindex="5" value="Add Student"> -->
					</p>
				</fieldset>
			</div>

			<div id="address">
				<fieldset>
					<legend>Update Address</legend>

					<form:errors path="*" cssClass="alert alert-danger" element="div" />
					<div class="form-group">
						<label> City: </label>
						<div class="col-lg-10">
							<form:input id="city" path="address.city" type="text"
								class="form:input-large" />
							<form:errors path="address.city" cssClass="text-danger" />
						</div>
					</div>

					<div class="form-group">
						<label> Street: </label>
						<div class="col-lg-10">
							<form:input id="street" path="address.street" type="text"
								class="form:input-large" />
							<form:errors path="address.street" cssClass="text-danger" />
						</div>
					</div>

					<div class="form-group">
						<label> State: </label>
						<div class="col-lg-10">
							<form:input id="state" path="address.state" type="text"
								class="form:input-large" />
							<form:errors path="address.state" cssClass="text-danger" />
						</div>
					</div>

					<div class="form-group">
						<label> Country: </label>
						<div class="col-lg-10">
							<form:input id="country" path="address.country" type="text"
								class="form:input-large" />
							<form:errors path="address.country" cssClass="text-danger" />
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
					<legend>Update Course</legend>
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
				<input id="submit" type="submit" value="Update Student">
			</p>
		</form:form>
	</div>

</body>
</html>