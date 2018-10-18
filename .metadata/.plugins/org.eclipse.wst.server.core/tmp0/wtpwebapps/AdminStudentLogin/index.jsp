<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Login Page</title>
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
		<h2 align="center"> LOGIN PAGE</h2>
		<form class="form-horizontal" action="login">
		<% String message = (String) request.getAttribute("msg");
		if(message == null){
			out.println("");
		}else{	
			out.println(message);} %>
			<div class="form-group">
				<label class="control-label col-sm-2" for="uname">Email:</label>
				<div class="col-sm-5">
					<input type="email" class="form-control" id="email"
						placeholder="Enter Email ID" name="email">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="password">Password:</label>
				<div class="col-sm-5">
					<input type="password" class="form-control" id="password"
						placeholder="Enter password" name="password">
				</div>
			</div>
			<!-- <div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<div class="checkbox">
						<label><input type="checkbox" name="remember">
							Remember me</label>
					</div>
				</div>
			</div> -->
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">Submit</button>
					<a href="http://localhost:8020/AdminStudentLogin/register.jsp">&nbsp; &nbsp;&nbsp; New Registration</a>
				</div>
			</div>
		</form>
	</div>

</body>
</html>
