<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="global">
		<h2 style="text-align: center;">${appName }</h2>
		<form action="addstudentform" method="post">
			<fieldset>
				<legend>Add Course</legend>
				<p>
					<label for="courseName"> Course Name:</label> <input type="text"
						id="courseName" name="courseName">
				</p>
				<p>
					<label for="courseID">Course ID: </label> <input type="text"
						id="courseID" name="courseID">
				</p>
				<p>
					<label for="minimumGradeReq">Minimum Grade Requirement: </label> <input
						type="text" id="minimumGradeReq" name="minimumGradeReq">

				</p>
				<p id="buttons">
					<input id="reset" type="reset" tabindex="4"> <input
						id="submit" type="submit" tabindex="5" value="Add Course">
				</p>
			</fieldset>
		</form>
	</div>

</body>
</html>