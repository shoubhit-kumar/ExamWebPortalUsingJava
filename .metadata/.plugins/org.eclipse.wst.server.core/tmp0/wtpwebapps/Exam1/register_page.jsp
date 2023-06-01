<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error_page.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register Page</title>

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







	<main class="primary-background banner-background"
		style="padding-bottom: 60px;">
		<div class="container">
			<div class="row">
				<div class="col-md-6 offset-md-3">
					<div class="card">
						<div class="card-header text-center primary-background text-white">
							<span class="fa fa-user-circle fa-3x"></span>
							<p>Register Here</p>
						</div>
						<div class="card-body">
							<form method="POST" action="RegisterServlet" id="reg-form">

								<div class="form-group">
									<label for="user_name">User Name</label> <input
										name="user_name" required type="text" class="form-control"
										id="user_name" aria-describedby="emailHelp"
										placeholder="Enter name">

								</div>

								<div class="form-group">
									<label for="exampleInputEmail1">Email address</label> <input
										name="user_email" required type="email" class="form-control"
										id="exampleInputEmail1" aria-describedby="emailHelp"
										placeholder="Enter email"> <small id="emailHelp"
										class="form-text text-muted">We'll never share your
										email with anyone else.</small>
								</div>

								<div class="form-group">
									<label for="exampleInputPassword1">Password</label> <input
										name="user_password" required type="password"
										class="form-control" id="exampleInputPassword1"
										placeholder="Password">
								</div>

								<div class="form-group">
									<label for="gender">Select Gender</label> <br> <input
										type="radio" id="gender" name="gender" value="male">Male
									<input type="radio" id="gender" name="gender" value="female">Female
								</div>

								<div class="form-group">
									<label for="dob">Date Of Birth</label> <input type="date"
										name="dob" id="dob" class="form-control"
										placeholder="Date Of Birth" required>
								</div>

								<div class="form-group">
									<label for="contact">Contact</label> <input name="contact"
										required type="number" class="form-control" id="contact"
										placeholder="Contact No">
								</div>

								<div class="form-group">
									<label for="city">City</label> <input name="city" required
										type="text" class="form-control" id="city" placeholder="City">
								</div>

								<div class="form-group">
									<label for="address">Address</label> <input name="address"
										required type="text" class="form-control" id="address"
										placeholder="Address">
								</div>

								<div class="form-group">
									<textarea name="about" class="form-control" rows="5"
										placeholder="Tell something about Yourself"></textarea>
								</div>

								<div class="form-check">
									<input name="check" type="checkbox" class="form-check-input"
										id="exampleCheck1"> <label class="form-check-label"
										for="exampleCheck1">Agree Terrms and Conditions</label>
								</div>
								<br>
								<div class="conatiner text-center" id="loader"
									style="display: none">
									<span class="fa fa-refresh fa-spin fa-4x"></span>
									<h4>Please wait..</h4>
								</div>
								<br>
								<button id="submit-btn" type="submit" class="btn btn-primary">Submit</button>
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
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<script>
            $(document).ready(function () {
                console.log("Loaded");

                $('#reg-form').on('submit', function (event) {
                    event.preventDefault();
                    let form = new FormData(this);

                    $('#submit-btn').hide();
                    $('#loader').show();

                    //send formdata to RegisterServlet
                    $.ajax({
                        url: "RegisterServlet",
                        type: "post",
                        data: form,
                        success: function (data, textStatus, jqXHR) {
                            console.log(data);


                            $('#loader').hide();
                            $('#submit-btn').show();

                            if (data.trim() === 'Done') {
                                
                                // A alert - sweetalert
                                swal("Registered Successfully.. We are redirecting to login page")
                                        .then((value) => {
                                            window.location = "login_page.jsp";
                                        });
                            } else {
                                swal(data);
                            }


                        },
                        error: function (jqXHR, textStatus, errorThrown) {

                            $('#loader').hide();
                            $('#submit-btn').show();

                            swal("Something went wrong.. Try again")
                                    .then((value) => {
                                        window.location = "register_page.jsp";
                                    });
                        },
                        processData: false,
                        contentType: false
                    });
                });


            });
        </script>
	<script>
		$(document).ready(function(e) {
			$('#nav_practice').removeClass('active');
			$('#nav_register').addClass('active');
		});
	</script>
</body>
</html>
