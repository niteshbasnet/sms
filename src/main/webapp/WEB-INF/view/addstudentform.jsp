<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>This is student form</h1>
	<div id="global">
		<h2 style="text-align: center;">${appName }</h2>
		<form action="addstudentform" method="post">
			<fieldset>
				<legend>Add a Student</legend>
				<p>
					<label for="firstName">First Name: </label> <input type="text"
						id="firstName" name="firstName">
				</p>
				<p>
					<label for="lastName">Last Name: </label> <input type="text"
						id="lastName" name="lastName">
				</p>
				<p>
					<label for="gender">Gender: </label> <input type="text" id="gender"
						name="gender">

				</p>
				<p>
					<label for="dob">Date of Birth: </label> <input type="text"
						id="dob" name="dob">

				</p>

				<p>
					<label for="phoneNumber">Phone Number: </label> <input type="text"
						id="phoneNumber" name="phoneNumber">

				</p>
				<p id="buttons">
					<input id="reset" type="reset" tabindex="4"> <input
						id="submit" type="submit" tabindex="5" value="Add Student">
				</p>
			</fieldset>
		</form>
	</div>
	d
</body>
</html>