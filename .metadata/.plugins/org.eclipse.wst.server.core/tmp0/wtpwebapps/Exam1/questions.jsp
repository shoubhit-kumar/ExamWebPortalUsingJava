<%@page import="com.exam.entities.Questions"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.exam.helper.ConnectionProvider"%>
<%@page import="com.exam.dao.QuestionDao"%>
<%@page import="com.exam.entities.User"%>
<%@page errorPage="error_page.jsp"%>
<%
User user = (User) session.getAttribute("currentUser");
if (user == null) {
	response.sendRedirect("login_page.jsp");
}
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

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
	clip-path: polygon(0 0, 70% 0%, 100% 0, 99% 94%, 63% 100%, 31% 93%, 0 98%, 0% 30%);
}
</style>
</head>
<body onload=display_ct();>


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
				<li class="nav-item active"><a class="nav-link" href="#"><span
						class="fa fa-bell-o"></span><%=user.getName()%> <span
						class="sr-only">(current)</span></a></li>


			</ul>
			<ul class="navbar-nav mr-right">

				<li class="nav-item"><a class="nav-link" href="#!"
					data-toggle="modal" data-target="#contact-modal"><span
						class="fa fa-address-card"></span>Contact</a></li>
				<li class="nav-item">
					<span id='ct' class="ml-2 text-light font-weight-light"></span>
					<br>
					<span id="time" class="ml-2 text-light font-weight-light">05:00</span>
				</li>

			</ul>
		</div>
	</nav>

	<!--end of navbar-->



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
									<a href="mailto:>me.sakshi.021@gmail.com"><i
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







	<div class="container">
		<div class="jumbotron">

			<h2>OEWP - Online Examination Web Portal</h2>
			<p>Lorem Ipsum is simply dummy text of the printing and
				typesetting industry. Lorem Ipsum has been the industry's standard
				dummy text ever since the 1500s, when an unknown printer took a
				galley of type and scrambled it to make a type specimen book. It has
				survived not only five centuries, but also the leap into electronic
				typesetting, remaining essentially unchanged. It was popularised in
				the 1960s with the release of Letraset sheets containing Lorem Ipsum
				passages, and more recently with desktop publishing software like
				Aldus PageMaker including versions of Lorem Ipsum.</p>
			<hr style="border: 1px solid black;">
			<div class="container-fluid">
				<form action="QuestionServlet" method="post" id="question">
					<ol>

						<%
						/* Integer c= 0;
						c = (Integer) session.getAttribute("cid");
						System.out.print(c);
						int cid = Integer.valueOf(c); */

						String c = session.getAttribute("cid").toString();
						int cid = Integer.parseInt(c);
						QuestionDao dao = new QuestionDao(ConnectionProvider.getConnection());
						ArrayList<Questions> list = dao.getQuestionsByCid(cid);
						for (Questions question : list) {
						%>
						<li class="lead"><%=question.getQuestion()%></li>
						<ol style="list-style-type: lower-roman;">

							<input type="radio" name="<%=question.getQid()%>" value="1"
								required>
							<%=question.getOption1()%>
							<br>
							<input type="radio" name="<%=question.getQid()%>" value="2"
								required>
							<%=question.getOption2()%>
							<br>
							<input type="radio" name="<%=question.getQid()%>" value="3"
								required>
							<%=question.getOption3()%>
							<br>
							<input type="radio" name="<%=question.getQid()%>" value="4"
								required>
							<%=question.getOption4()%>

						</ol>
						<hr class="my-4">


						<%
						}
						%>







					</ol>
					<div class="float-right">
						<button id="submit-btn" type="submit"
							onclick="return confirm('Want to Finish Exam?')"
							class="btn primary-background text-white">Submit Exam</button>
					</div>
				</form>
			</div>
		</div>

	</div>














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
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<script type="text/javascript">
		function display_c(){
			var refresh=1000; // Refresh rate in milli seconds
			mytime=setTimeout('display_ct()',refresh)
		}
		function display_ct() {
			var x = new Date()
			var x1=x.getHours( )+ ":" +  x.getMinutes() + ":" +  x.getSeconds();
			document.getElementById('ct').innerHTML = x1;
			display_c();
		}
	</script>
	<script>
	function startTimer(duration, display) {
	    var timer = duration, minutes, seconds;
	    setInterval(function () {
	        minutes = parseInt(timer / 60, 10);
	        seconds = parseInt(timer % 60, 10);

	        minutes = minutes < 10 ? "0" + minutes : minutes;
	        seconds = seconds < 10 ? "0" + seconds : seconds;

	        display.textContent = minutes + ":" + seconds;

	        if (--timer < 0) {
	            timer = duration;
	        }
	    }, 1000);
	}

	window.onload = function () {
		display_ct();
	    var fiveMinutes = 60 * 5,
	        display = document.querySelector('#time');
	    startTimer(fiveMinutes, display);
	};
	</script>
</body>
</html>