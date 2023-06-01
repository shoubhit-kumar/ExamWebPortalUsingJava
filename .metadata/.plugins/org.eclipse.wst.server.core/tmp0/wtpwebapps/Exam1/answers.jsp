<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.exam.entities.Answers"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.exam.entities.UserResult"%>
<%@page import="com.exam.dao.UserResultDao"%>
<%@page import="com.exam.entities.Course"%>
<%@page import="com.exam.helper.ConnectionProvider"%>
<%@page import="com.exam.dao.CourseDao"%>
<%@page import="com.exam.entities.User"%>
<%@page import="com.exam.entities.Message"%>
<%@page import="java.util.ArrayList"%>
<%@page errorPage="error_page.jsp"%>
<%
User user = (User) session.getAttribute("currentUser");
if (user == null) {
	response.sendRedirect("login_page.jsp");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link href="css/mystyle.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<style>
.banner-background {
	clip-path: polygon(0 0, 70% 0%, 100% 0, 99% 94%, 63% 100%, 31% 93%, 0 98%, 0% 30%);
}

.red {
	background-color: #FC4343;
}

.green {
	background-color: #29FE7F;
}

.yellow {
	background-color: #F8FE29;
}
</style>
</head>
<body>

	<!--navbar-->


	<nav class="navbar navbar-expand-lg navbar-dark primary-background">
		<a class="navbar-brand" href="index.jsp"><span
			class="fa fa-asterisk"></span>OEWP</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="profile.jsp"><span
						class="fa fa-bell-o"></span>Practice <span class="sr-only">(current)</span></a>
				</li>
				
				<li class="nav-item"><a class="nav-link" href="#!"
					data-toggle="modal" data-target="#contact-modal"><span
						class="fa fa-address-card"></span>Contact</a></li>

			</ul>
			<ul class="navbar-nav mr-right">

				<li class="nav-item"><a class="nav-link" href="#!"
					data-toggle="modal" data-target="#profile-modal"><span
						class="fa fa-user-circle"></span><%=user.getName()%></a></li>
				<li class="nav-item"><a class="nav-link" href="LogoutServlet"><span
						class="fa fa-user-plus"></span>Logout</a></li>

			</ul>
		</div>
	</nav>

	<!--end of navbar-->
	<div class="container mt-4">
		<div class="row">
			<div class="col-md-6">
				<table class="table table-striped">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Q No</th>
							<th scope="col">Answers</th>
						</tr>
					</thead>
					<tbody>

						<%
						ArrayList<Answers> list = (ArrayList<Answers>) request.getAttribute("answer_list");
						int i = 0;
						for (Answers answer : list) {
							++i;
						%>

						<tr>
							<th scope="row"><%=i%></th>
							<td class="answer"><%=answer.getAoption()%></td>
						</tr>


						<%
						}
						%>

					</tbody>
				</table>
			</div>
		</div>
		<div class="float-right col-md-8">
		<a href="profile.jsp" class="btn primary-background text-white">Dashboard</a>
		</div>
	</div>








	<script src="https://code.jquery.com/jquery-3.6.0.min.js"
		integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
	<script src="js/myjs.js" type="text/javascript"></script>
	<script>
	let elements = document.getElementsByClassName("answer");
	for (var i = 0, len = elements.length; i < len; i++) {
	    // elements[i].style ...
	    if(elements[i].innerHTML == "Wrong Answer"){
	    	elements[i].classList.add("red");
	    }
	    if(elements[i].innerHTML == "Correct Answer"){
	    	elements[i].classList.add("green");
	    }
	    if(elements[i].innerHTML == "Not Answered"){
	    	elements[i].classList.add("yellow");
	    }
	}
	</script>

</body>
</html>