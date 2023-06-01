<%@page import="java.sql.*, com.exam.helper.ConnectionProvider"%>
<%@page errorPage="error_page.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Hello, world!</title>

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


	<!-- Carousel -->

	<div id="carouselExampleIndicators" class="carousel slide my-0 py-0"
		data-ride="carousel">
		<ol class="carousel-indicators">
			<li data-target="#carouselExampleIndicators" data-slide-to="0"
				class="active"></li>
			<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
			<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img class="d-block w-100" src="img/one.jfif" alt="First slide">
			</div>
			<div class="carousel-item">
				<img class="d-block w-100" src="img/two.jfif" alt="Second slide">
			</div>
			<div class="carousel-item">
				<img class="d-block w-100" src="img/three.jfif" alt="Third slide">
			</div>
		</div>
		<a class="carousel-control-prev" href="#carouselExampleIndicators"
			role="button" data-slide="prev"> <span
			class="carousel-control-prev-icon" aria-hidden="true"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
			role="button" data-slide="next"> <span
			class="carousel-control-next-icon" aria-hidden="true"></span> <span
			class="sr-only">Next</span>
		</a>
	</div>

	<!-- end of carousel -->









	<!--Banner-->
	<div class="container-fluid m-0 p-0">
		<div
			class="jumbotron primary-background text-white banner-background mt-0 pt-0">
			<div class="container">
				<h3 class="display-3 text-center">Welcome to OEWP</h3>
				<p>Welcome to technical blog, world of technology A programming
					language is a formal language comprising a set of strings that
					produce various kinds of machine code output. Programming languages
					are one kind of computer language, and are used in computer
					programming to implement algorithms.</p>
				<p>Most programming languages consist of instructions for
					computers. There are programmable machines that use a set of
					specific instructions, rather than general programming languages.
					Since the early 1800s, programs have been used to direct the
					behavior of machines such as Jacquard looms, music boxes and player
					pianos.[1] The programs for these machines (such as a player
					piano's scrolls) did not produce different behavior in response to
					different inputs or conditions.</p>

				<a href="register_page.jsp" class="btn btn-outline-light btn-lg">
					<span class="fa fa-user-plus"></span> Start! Its Free
				</a> <a href="login_page.jsp" class="btn btn-outline-light btn-lg">
					<span class="fa fa-user-circle fa-spin"></span> Login
				</a>
			</div>
		</div>
	</div>




	<div class="container-fluid">
		<div class="row">
			<div class="col-md-3">
				<button type="button" class="btn btn-primary btn-block">Events</button>
				<div class="jumbotron jumbotron-fluid p-2"
					style="width: 100%; height: 300px;">
					<p>
						Event<img src="img/new-gif-image.gif" width="40" />
					</p>
				</div>
			</div>

			<div class="col-md-6"></div>

			<div class="col-md-3">
				<button type="button" class="btn btn-primary btn-block">News
					and Notices</button>
				<div class="jumbotron jumbotron-fluid p-2"
					style="width: 100%; height: 300px;">
					<p>
						News and Notice<img src="img/new-gif-image.gif" width="40" />
					</p>
				</div>
			</div>
		</div>
	</div>





	<!-- footer -->

	<nav class="navbar navbar-dark bg-dark">
		<div class="text-white mr-auto ml-auto">OEWP | Copyright@2021</div>
	</nav>










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

</body>
</html>