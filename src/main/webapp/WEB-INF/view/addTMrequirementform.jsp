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
		<form action="addTMrequirementform" method="post">
			<fieldset>
				<legend>Add TM Requirement Form</legend>
				<p>
					<label for="date"> Date:</label> <input type="text" id="date"
						name="date">
				</p>
				<p>
					<label for="type">Type: </label> <input type="text" id="type"
						name="type">
				</p>
				<p>
					<label for="descriptions">Descriptions: </label> <input type="text"
						id="descriptions" name="descriptions">

				</p>
				<p id="buttons">
					<input id="reset" type="reset" tabindex="4"> <input
						id="submit" type="submit" tabindex="5" value="Add TM Requirement">
				</p>
			</fieldset>
		</form>
	</div>
</body>
</html>