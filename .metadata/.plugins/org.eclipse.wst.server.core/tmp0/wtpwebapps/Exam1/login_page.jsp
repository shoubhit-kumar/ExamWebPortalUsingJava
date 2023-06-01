<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.exam.entities.Message"%>
<%@page errorPage="error_page.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>

<!-- CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link href="css/mystyle.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<style>
.banner-background {
	clip-path: polygon(100% 0, 100% 100%, 77% 98%, 65% 96%, 49% 100%, 37% 96%, 24% 99%,
		0 100%, 0 0);
}
</style>
</head>
<body>

	<!--navbar-->
	<%@include file="normal_navbar.jsp"%>


	<!-- Contact modal -->


	<!-- Button trigger modal -->
	<!-- <button type="button" class="btn btn-primary" data-toggle="modal"
		data-target="#exampleModal">Launch demo modal</button> -->

	<!-- Modal -->
	<div class="modal fade" id="contact-modal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header primary-background text-white text-center">
					<h5 class="modal-title" id="exampleModalLabel">Contact Us</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">

					<div class="container-fluid">
						<div class="row">
							<div class="col-md-4">
								<h6>Email us at:</h6>
								<h6>Call us at:</h6>
							</div>
							<div class="col-md-8">
								<h6>
									<a href="mailto:me.sakshi.021@gmail.com"><i
										class="fa fa-at"></i>me.sakshi.021@gmail.com</a>
								</h6>
								<h6>
									<i class="fa fa-mobile"></i>+91 7079729758
								</h6>
							</div>
						</div>

					</div>

					<hr>
					<form action="SubmitQuery" method="post" id="query-form">

						<div class="form-group">
							<label for="subject">Subject</label> <input name="subject"
								required type="text" class="form-control" id="subject"
								aria-describedby="emailHelp" placeholder="Subject">

						</div>
						<div class="form-group">
							<label for="description">Description</label>
							<textarea name="description" class="form-control" rows="5"
								placeholder="Description"></textarea>
						</div>

						<button type="submit" class="btn btn-primary"
							style="float: right;">Submit your Query</button>
					</form>

				</div>
				<!-- <div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
				</div> -->
			</div>
		</div>
	</div>



	<!-- end of contact modal -->



	<main
		class="d-flex align-items-center primary-background banner-background"
		style="height: 70vh">
		<div class="container">
			<div class="row">
				<div class="col-md-4 offset-md-4">
					<div class="card">
						<div class="card-header primary-background text-white text-center">
							<span class="fa fa-user-plus fa-3x"></span> <br>
							<p>Login Here</p>
						</div>

						<%
						Message m = (Message) session.getAttribute("msg");
						if (m != null) {
						%>
						<div class="alert <%=m.getCssClass()%>" role="alert">
							<%=m.getContent()%>
						</div>
						<%
						//removing msg attribute, so that next time it doesn't show the previous error
						session.removeAttribute("msg");
						}
						%>



						<div class="card-body">
							<form action="LoginServlet" method="POST">
								<div class="form-group">
									<label for="exampleInputEmail1">Email address</label> <input
										name="email" required type="email" class="form-control"
										id="exampleInputEmail1" aria-describedby="emailHelp"
										placeholder="Enter email"> <small id="emailHelp"
										class="form-text text-muted">We'll never share your
										email with anyone else.</small>
								</div>
								<div class="form-group">
									<label for="exampleInputPassword1">Password</label> <input
										name="password" required type="password" class="form-control"
										id="exampleInputPassword1" placeholder="Password">
								</div>
								<div class="container text-center">
									<button type="submit" class="btn btn-primary">Submit</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</main>












	<!-- JavaScript -->
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
		$(document).ready(function(e) {
			$('#nav_practice').removeClass('active');
			$('#nav_login').addClass('active');
		});
	</script>
</body>
</html>
