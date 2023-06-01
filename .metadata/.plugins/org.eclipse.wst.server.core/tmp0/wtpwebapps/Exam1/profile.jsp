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
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>


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
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <span class="fa fa-check-square-o"></span>Categories
				</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<%
						CourseDao dao = new CourseDao(ConnectionProvider.getConnection());
						ArrayList<Course> list1 = dao.getAllCourses();
						for (Course course : list1) {
						%>
						<a class="dropdown-item"
							href="SubjectServlet?cid=<%=course.getCid()%>"><%=course.getName()%></a>
						<div class="dropdown-divider"></div>

						<%
						}
						%>
					</div></li>


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


	<!-- Message for updation error or success -->

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






	<!--Profile modal-->

	<!-- Button trigger modal -->
	<!--<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#profile-modal">
                Launch demo modal
            </button>-->

	<!-- Modal -->
	<div class="modal fade" id="profile-modal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header primary-background text-white text-center">
					<h5 class="modal-title" id="exampleModalLabel">Tech Blog</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<div class="container text-center">
						<img src="profiles/<%=user.getProfile()%>" class="img-fluid"
							style="border-radius: 50%; max-width: 140px;">
						<h5 class="modal-title mt-3" id="exampleModalLabel"><%=user.getName()%>
						</h5>

						<!--Deatils-->
						<div id="profile-details">
							<table class="table">
								<tbody>
									<tr>
										<th scope="row">Id:</th>
										<td><%=user.getId()%></td>
									</tr>
									<tr>
										<th scope="row">Name:</th>
										<td><%=user.getName()%></td>
									</tr>
									<tr>
										<th scope="row">Email:</th>
										<td><%=user.getEmail()%></td>
									</tr>

									<tr>
										<th scope="row">Gender:</th>
										<td><%=user.getGender().toUpperCase()%></td>
									</tr>

									<tr>
										<th scope="row">DOB:</th>
										<td><%=user.getDob()%></td>
									</tr>

									<tr>
										<th scope="row">Contact:</th>
										<td><%=user.getContact()%></td>
									</tr>

									<tr>
										<th scope="row">City:</th>
										<td><%=user.getCity()%></td>
									</tr>

									<tr>
										<th scope="row">Address:</th>
										<td><%=user.getAddress()%></td>
									</tr>

									<tr>
										<th scope="row">About:</th>
										<td><%=user.getAbout()%></td>
									</tr>
									<tr>
										<th scope="row">Registered On:</th>
										<td><%=user.getDateTime().toString()%></td>
									</tr>
								</tbody>
							</table>
						</div>

						<!--Profile Edit-->
						<div id="profile-edit" style="display: none;">
							<h3 class="mt-2">Please Edit Carefully</h3>
							<form action="EditServlet" method="post"
								enctype="multipart/form-data">
								<!-- enctype="multipart/form-data" - when form contains any file(pdf,image,audio,video -->
								<table class="table">
									<tbody>
										<tr>
											<th scope="row">Id:</th>
											<td><%=user.getId()%></td>
										</tr>
										<tr>
											<th scope="row">Email:</th>
											<td><input class="form-control" type="email"
												name="user_email" value="<%=user.getEmail()%>"></td>
										</tr>
										<tr>
											<th scope="row">Name:</th>
											<td><input class="form-control" type="text"
												name="user_name" value="<%=user.getName()%>"></td>
										</tr>
										<tr>
											<th scope="row">Password:</th>
											<td><input class="form-control" type="password"
												name="user_password" value="<%=user.getPassword()%>"></td>
										</tr>
										<tr>
											<th scope="row">Gender:</th>
											<td><%=user.getGender().toUpperCase()%></td>
										</tr>
										<tr>
											<th scope="row">DOB:</th>
											<td><%=user.getDob()%></td>
										</tr>
										<tr>
											<th scope="row">Contact:</th>
											<td><input class="form-control" type="text"
												name="user_contact" value="<%=user.getContact()%>"></td>
										</tr>
										<tr>
											<th scope="row">City:</th>
											<td><input class="form-control" type="text"
												name="user_city" value="<%=user.getCity()%>"></td>
										</tr>
										<tr>
											<th scope="row">Address:</th>
											<td><input class="form-control" type="text"
												name="user_address" value="<%=user.getAddress()%>"></td>
										</tr>
										<tr>
											<th scope="row">About:</th>
											<td><textarea class="form-control" name="user_about"
													rows="4"><%=user.getAbout()%></textarea></td>
										</tr>
										<tr>
											<th scope="row">Profile:</th>
											<td><input class="form-control" type="file" name="image"></td>
										</tr>
									</tbody>
								</table>
								<div class="container">
									<button type="submit" class="btn btn-outline-success">Save</button>
								</div>
							</form>
						</div>

					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
					<button id="edit-profile-button" type="button"
						class="btn btn-primary">Edit</button>
				</div>
			</div>
		</div>
	</div>

	<!--End of profile modal-->









	<div class="container">
		<div class="row">
			<div class="col-md-4">




				<a href="#"
					class="mt-4 text-white text-center list-group-item list-group-item-action primary-background">DASHBOARD</a>

				<button
					class="mt-4 text-center list-group-item list-group-item-action list-group-item-primary">Ready
					to appear for your exam</button>

				<%
				for (Course course : list1) {
				%>
				<a href="SubjectServlet?cid=<%=course.getCid()%>"
					class="list-group-item list-group-item-action list-group-item-light"><%=course.getName()%></a>

				<%
				}
				%>







			</div>
			<div class="col-md-8">

				<h2 class="my-2 display-4 text-center">View your result at
					glance</h2>

				<div id="accordion" class="mt-4">

					<%
					int uid = user.getId();
					UserResultDao d = new UserResultDao(ConnectionProvider.getConnection());

					ArrayList<UserResult> list2 = d.getUserResultByUid(uid);
					if (list2.isEmpty()) {
					%>
					<br>
					<h3>Enhance your knowledge by taking exam</h3>

					<%
					} else {
					for (UserResult ur : list2) {
					%>

					<div class="card">
						<div class="card-header" id="headingOne">
							<h5 class="mb-0">
								<button class="btn btn-link" data-toggle="collapse"
									data-target="#<%=ur.getCid()%>" aria-expanded="true"
									aria-controls="collapseOne">
									Course:
									<%=dao.getCourseNameByCid(ur.getCid())%>
								</button>
							</h5>
						</div>

						<div id="<%=ur.getCid()%>" class="collapse show"
							aria-labelledby="headingOne" data-parent="#accordion">
							<div class="card-body">
								You have scored:
								<%=ur.getMark()%>
								<br> Your Status is :
								<%=ur.getStatus()%>
								<br> Exam is taken on :
								<%=DateFormat.getDateTimeInstance().format(ur.getDatetime())%>
							</div>
						</div>
					</div>
					<%
					}
					}
					%>
				</div>
			</div>
		</div>
	</div>




	<!-- footer -->

	<nav class="navbar fixed-bottom navbar-dark bg-dark mt-5">
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

	<script>
		$(document).ready(function() {

			let editStatus = false;

			$('#edit-profile-button').click(function() {
				//alert("Button Clicked");
				if (editStatus === false) {
					$('#profile-details').hide();
					$('#profile-edit').show();
					editStatus = true;
					$(this).text("Back");
				} else {
					$('#profile-details').show();
					$('#profile-edit').hide();
					editStatus = false;
					$(this).text("Edit");
				}

			});
		});
	</script>


	<script>
		
	</script>
</body>
</html>
