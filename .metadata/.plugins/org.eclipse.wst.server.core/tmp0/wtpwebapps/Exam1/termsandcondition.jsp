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
	clip-path: polygon(100% 0, 100% 100%, 77% 98%, 65% 96%, 49% 100%, 37% 96%, 24% 99%,
		0 100%, 0 0);
}
</style>
</head>
<body>
	<div class="container mt-3">
		<h3 class="display-3 text-center"
			style="font-family: Times New Roman, Times, serif;">Terms and
			Conditions</h3>
		<br>
		<br>
		<ol>
			<li>Condition 1</li>
			<li>Condition 1</li>
			<li>Condition 1</li>
			<li>Condition 1</li>
			<li>Condition 1</li>
			<li>Condition 1</li>
		</ol>
		<form action="questions.jsp" method="post" id="terms">
			<div class="form-check">
				<input name="check" type="checkbox" class="form-check-input"
					id="exampleCheck1"> <label class="form-check-label"
					for="exampleCheck1">Before moving forward Accept our terms and conditions</label>
			</div>
			<button id="submit-btn" type="submit" class="btn btn-primary">Start Exam</button>
		</form>
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
	<script>
            $(document).ready(function () {
                console.log("Loaded");

                $('#terms').on('submit', function (event) {
                    event.preventDefault();
                    let form = new FormData(this);

                    
                    //send formdata to RegisterServlet
                    $.ajax({
                        url: "TermsServlet",
                        type: "post",
                        data: form,
                        success: function (data, textStatus, jqXHR) {
                            
                            if (data.trim() === 'Done') {
                                
                                // A alert - sweetalert
                                swal("Ready to begin Exam")
                                        .then((value) => {
                                            window.location = "questions.jsp";
                                        });
                            } else {
                                swal(data);
                            }


                        },
                        error: function (jqXHR, textStatus, errorThrown) {

                            swal("Something went wrong.. Try again")
                                    .then((value) => {
                                        window.location = "profile.jsp";
                                    });
                        },
                        processData: false,
                        contentType: false
                    });
                });


            });
        </script>
</body>
</html>