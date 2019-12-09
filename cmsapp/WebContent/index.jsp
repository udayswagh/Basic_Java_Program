<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="./static/css/styles.css">

<meta charset="ISO-8859-1">
<title>CMSAPP | HOME</title>
</head>
<body>
	<div class="page">
		<div class="header">
			<div class="w3-container w3-teal">

				<!--  Header -->
				<jsp:include page="./static/header/header.jsp" />

			</div>

			<!-- BODY -->
			<div class="body">
				<div class="container">
					<table>
						<form action="./UserRegistrationController" method="post">
							<tr>
								<td>Name</td>
								<td><input type="text" name="name"><br /></td>
							</tr>
							<tr>
								<td>Email</td>
								<td><input type="text" name="email"><br /></td>
							</tr>
							<tr>
								<td>Login Name</td>
								<td><input type="text" name="loginName"><br /></td>
							</tr>
							<tr>
								<td>Password</td>
								<td><input type="text" name="password"><br /></td>
							</tr>
						</form>
						</table>
						<input type="submit" value="REGISTER">
						
				</div>
			</div>


			<!-- FOOTER -->

			<div class="w3-container w3-teal">

				<jsp:include page="./static/footer/footer.jsp" />
			</div>
		</div>
	</div>
</body>
</html>