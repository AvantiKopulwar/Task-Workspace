<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Register Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<h2 align="center">REGISTER PAGE</h2>
		<form class="form-horizontal" action="register">

<%
String message = (String) request.getAttribute("msg");
if(message == null){
	out.println("");
}else{	
	out.println(message);}
%>
			<div class="form-group">
				<label class="control-label col-sm-2" for="firstName">First
					Name:</label>
				<div class="col-sm-5">
					<input type="text" class="form-control" id="firstName"
						placeholder="Enter First name" name="firstName">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="lastName">Last
					Name:</label>
				<div class="col-sm-5">
					<input type="text" class="form-control" id="lastName"
						placeholder="Enter Last Name" name="lastName">
				</div>
			</div>
			<div class="form-group ">
				<label class="col-sm-offset-2 col-sm-10"> <input
					type="radio" name="gender" value ="female" checked>Female
				</label> <label class="col-sm-offset-2 col-sm-10"> <input
					type="radio" name="gender" value ="male">Male
				</label>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="email">Email:</label>
				<div class="col-sm-5">
					<input type="email" class="form-control" id="email"
						placeholder="Enter Email" name="email">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="mobNo">Mobile
					Number:</label>
				<div class="col-sm-5">
					<input type="text" class="form-control" id="mobNo"
						placeholder="Enter Mobile No." name="mobNo">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="password">Password:</label>
				<div class="col-sm-5">
					<input type="password" class="form-control" id="password"
						placeholder="Enter password" name="password">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="conpassword">Confirm
					Password:</label>
				<div class="col-sm-5">
					<input type="password" class="form-control" id="conpassword"
						placeholder="Enter Confirm password" name="conpassword">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">Submit</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>
