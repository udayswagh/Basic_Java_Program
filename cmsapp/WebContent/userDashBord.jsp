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
				<p>${param.msg }</p>
				
			<h2> User DashBord:Welcome:<%= session.getAttribute("name") %>
		
		</h2>
		
		
		</div>		
	<!-- FOOTER -->

			<div class="w3-container w3-teal">
				<jsp:include page="./static/footer/footer.jsp" />
			</div>
</body>
</html>