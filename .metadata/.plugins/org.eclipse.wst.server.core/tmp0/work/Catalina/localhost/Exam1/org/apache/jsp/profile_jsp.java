/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.11
 * Generated at: 2021-10-25 14:16:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.text.DateFormat;
import com.exam.entities.UserResult;
import com.exam.dao.UserResultDao;
import com.exam.entities.Course;
import com.exam.helper.ConnectionProvider;
import com.exam.dao.CourseDao;
import com.exam.entities.User;
import com.exam.entities.Message;
import java.util.ArrayList;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.exam.entities.Course");
    _jspx_imports_classes.add("com.exam.helper.ConnectionProvider");
    _jspx_imports_classes.add("com.exam.entities.User");
    _jspx_imports_classes.add("com.exam.dao.CourseDao");
    _jspx_imports_classes.add("com.exam.entities.Message");
    _jspx_imports_classes.add("com.exam.entities.UserResult");
    _jspx_imports_classes.add("java.text.DateFormat");
    _jspx_imports_classes.add("com.exam.dao.UserResultDao");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error_page.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

User user = (User) session.getAttribute("currentUser");
if (user == null) {
	response.sendRedirect("login_page.jsp");
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>JSP Page</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n");
      out.write("	integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<link href=\"css/mystyle.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".banner-background {\r\n");
      out.write("	clip-path: polygon(100% 0, 100% 100%, 77% 98%, 65% 96%, 49% 100%, 37% 96%, 24% 99%,\r\n");
      out.write("		0 100%, 0 0);\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<!--navbar-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg navbar-dark primary-background\">\r\n");
      out.write("		<a class=\"navbar-brand\" href=\"index.jsp\"><span\r\n");
      out.write("			class=\"fa fa-asterisk\"></span>OEWP</a>\r\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("			data-target=\"#navbarSupportedContent\"\r\n");
      out.write("			aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("			aria-label=\"Toggle navigation\">\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		</button>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("			<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("				<li class=\"nav-item active\"><a class=\"nav-link\" href=\"profile.jsp\"><span\r\n");
      out.write("						class=\"fa fa-bell-o\"></span>Practice <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"nav-item dropdown\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> <span class=\"fa fa-check-square-o\"></span>Categories\r\n");
      out.write("				</a>\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("						");

						CourseDao dao = new CourseDao(ConnectionProvider.getConnection());
						ArrayList<Course> list1 = dao.getAllCourses();
						for (Course course : list1) {
						
      out.write("\r\n");
      out.write("						<a class=\"dropdown-item\"\r\n");
      out.write("							href=\"SubjectServlet?cid=");
      out.print(course.getCid());
      out.write('"');
      out.write('>');
      out.print(course.getName());
      out.write("</a>\r\n");
      out.write("						<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\r\n");
      out.write("						");

						}
						
      out.write("\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"#!\"\r\n");
      out.write("					data-toggle=\"modal\" data-target=\"#contact-modal\"><span\r\n");
      out.write("						class=\"fa fa-address-card\"></span>Contact</a></li>\r\n");
      out.write("\r\n");
      out.write("			</ul>\r\n");
      out.write("			<ul class=\"navbar-nav mr-right\">\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"#!\"\r\n");
      out.write("					data-toggle=\"modal\" data-target=\"#profile-modal\"><span\r\n");
      out.write("						class=\"fa fa-user-circle\"></span>");
      out.print(user.getName());
      out.write("</a></li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"LogoutServlet\"><span\r\n");
      out.write("						class=\"fa fa-user-plus\"></span>Logout</a></li>\r\n");
      out.write("\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("\r\n");
      out.write("	<!--end of navbar-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Message for updation error or success -->\r\n");
      out.write("\r\n");
      out.write("	");

	Message m = (Message) session.getAttribute("msg");
	if (m != null) {
	
      out.write("\r\n");
      out.write("	<div class=\"alert ");
      out.print(m.getCssClass());
      out.write("\" role=\"alert\">\r\n");
      out.write("		");
      out.print(m.getContent());
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	");

	//removing msg attribute, so that next time it doesn't show the previous error
	session.removeAttribute("msg");
	}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Contact modal -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Button trigger modal -->\r\n");
      out.write("	<!-- <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\"\r\n");
      out.write("		data-target=\"#exampleModal\">Launch demo modal</button> -->\r\n");
      out.write("\r\n");
      out.write("	<!-- Modal -->\r\n");
      out.write("	<div class=\"modal fade\" id=\"contact-modal\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("		aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("		<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("			<div class=\"modal-content\">\r\n");
      out.write("				<div class=\"modal-header primary-background text-white text-center\">\r\n");
      out.write("					<h5 class=\"modal-title\" id=\"exampleModalLabel\">Contact Us</h5>\r\n");
      out.write("					<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("						aria-label=\"Close\">\r\n");
      out.write("						<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("					</button>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("					<div class=\"container-fluid\">\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<div class=\"col-md-4\">\r\n");
      out.write("								<h6>Email us at:</h6>\r\n");
      out.write("								<h6>Call us at:</h6>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"col-md-8\">\r\n");
      out.write("								<h6>\r\n");
      out.write("									<a href=\"mailto:>me.sakshi.021@gmail.com\"><i\r\n");
      out.write("										class=\"fa fa-at\"></i>me.sakshi.021@gmail.com</a>\r\n");
      out.write("								</h6>\r\n");
      out.write("								<h6>\r\n");
      out.write("									<i class=\"fa fa-mobile\"></i>+91 7079729758\r\n");
      out.write("								</h6>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<hr>\r\n");
      out.write("					<form action=\"SubmitQuery\" method=\"post\" id=\"query-form\">\r\n");
      out.write("\r\n");
      out.write("						<div class=\"form-group\">\r\n");
      out.write("							<label for=\"subject\">Subject</label> <input name=\"subject\"\r\n");
      out.write("								required type=\"text\" class=\"form-control\" id=\"subject\"\r\n");
      out.write("								aria-describedby=\"emailHelp\" placeholder=\"Subject\">\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"form-group\">\r\n");
      out.write("							<label for=\"description\">Description</label>\r\n");
      out.write("							<textarea name=\"description\" class=\"form-control\" rows=\"5\"\r\n");
      out.write("								placeholder=\"Description\"></textarea>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<button type=\"submit\" class=\"btn btn-primary\"\r\n");
      out.write("							style=\"float: right;\">Submit your Query</button>\r\n");
      out.write("					</form>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- <div class=\"modal-footer\">\r\n");
      out.write("					<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("						data-dismiss=\"modal\">Close</button>\r\n");
      out.write("				</div> -->\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- end of contact modal -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!--Profile modal-->\r\n");
      out.write("\r\n");
      out.write("	<!-- Button trigger modal -->\r\n");
      out.write("	<!--<button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#profile-modal\">\r\n");
      out.write("                Launch demo modal\r\n");
      out.write("            </button>-->\r\n");
      out.write("\r\n");
      out.write("	<!-- Modal -->\r\n");
      out.write("	<div class=\"modal fade\" id=\"profile-modal\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("		aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("		<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("			<div class=\"modal-content\">\r\n");
      out.write("				<div class=\"modal-header primary-background text-white text-center\">\r\n");
      out.write("					<h5 class=\"modal-title\" id=\"exampleModalLabel\">Tech Blog</h5>\r\n");
      out.write("					<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("						aria-label=\"Close\">\r\n");
      out.write("						<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("					</button>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"modal-body\">\r\n");
      out.write("					<div class=\"container text-center\">\r\n");
      out.write("						<img src=\"profiles/");
      out.print(user.getProfile());
      out.write("\" class=\"img-fluid\"\r\n");
      out.write("							style=\"border-radius: 50%; max-width: 140px;\">\r\n");
      out.write("						<h5 class=\"modal-title mt-3\" id=\"exampleModalLabel\">");
      out.print(user.getName());
      out.write("\r\n");
      out.write("						</h5>\r\n");
      out.write("\r\n");
      out.write("						<!--Deatils-->\r\n");
      out.write("						<div id=\"profile-details\">\r\n");
      out.write("							<table class=\"table\">\r\n");
      out.write("								<tbody>\r\n");
      out.write("									<tr>\r\n");
      out.write("										<th scope=\"row\">Id:</th>\r\n");
      out.write("										<td>");
      out.print(user.getId());
      out.write("</td>\r\n");
      out.write("									</tr>\r\n");
      out.write("									<tr>\r\n");
      out.write("										<th scope=\"row\">Name:</th>\r\n");
      out.write("										<td>");
      out.print(user.getName());
      out.write("</td>\r\n");
      out.write("									</tr>\r\n");
      out.write("									<tr>\r\n");
      out.write("										<th scope=\"row\">Email:</th>\r\n");
      out.write("										<td>");
      out.print(user.getEmail());
      out.write("</td>\r\n");
      out.write("									</tr>\r\n");
      out.write("\r\n");
      out.write("									<tr>\r\n");
      out.write("										<th scope=\"row\">Gender:</th>\r\n");
      out.write("										<td>");
      out.print(user.getGender().toUpperCase());
      out.write("</td>\r\n");
      out.write("									</tr>\r\n");
      out.write("\r\n");
      out.write("									<tr>\r\n");
      out.write("										<th scope=\"row\">DOB:</th>\r\n");
      out.write("										<td>");
      out.print(user.getDob());
      out.write("</td>\r\n");
      out.write("									</tr>\r\n");
      out.write("\r\n");
      out.write("									<tr>\r\n");
      out.write("										<th scope=\"row\">Contact:</th>\r\n");
      out.write("										<td>");
      out.print(user.getContact());
      out.write("</td>\r\n");
      out.write("									</tr>\r\n");
      out.write("\r\n");
      out.write("									<tr>\r\n");
      out.write("										<th scope=\"row\">City:</th>\r\n");
      out.write("										<td>");
      out.print(user.getCity());
      out.write("</td>\r\n");
      out.write("									</tr>\r\n");
      out.write("\r\n");
      out.write("									<tr>\r\n");
      out.write("										<th scope=\"row\">Address:</th>\r\n");
      out.write("										<td>");
      out.print(user.getAddress());
      out.write("</td>\r\n");
      out.write("									</tr>\r\n");
      out.write("\r\n");
      out.write("									<tr>\r\n");
      out.write("										<th scope=\"row\">About:</th>\r\n");
      out.write("										<td>");
      out.print(user.getAbout());
      out.write("</td>\r\n");
      out.write("									</tr>\r\n");
      out.write("									<tr>\r\n");
      out.write("										<th scope=\"row\">Registered On:</th>\r\n");
      out.write("										<td>");
      out.print(user.getDateTime().toString());
      out.write("</td>\r\n");
      out.write("									</tr>\r\n");
      out.write("								</tbody>\r\n");
      out.write("							</table>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<!--Profile Edit-->\r\n");
      out.write("						<div id=\"profile-edit\" style=\"display: none;\">\r\n");
      out.write("							<h3 class=\"mt-2\">Please Edit Carefully</h3>\r\n");
      out.write("							<form action=\"EditServlet\" method=\"post\"\r\n");
      out.write("								enctype=\"multipart/form-data\">\r\n");
      out.write("								<!-- enctype=\"multipart/form-data\" - when form contains any file(pdf,image,audio,video -->\r\n");
      out.write("								<table class=\"table\">\r\n");
      out.write("									<tbody>\r\n");
      out.write("										<tr>\r\n");
      out.write("											<th scope=\"row\">Id:</th>\r\n");
      out.write("											<td>");
      out.print(user.getId());
      out.write("</td>\r\n");
      out.write("										</tr>\r\n");
      out.write("										<tr>\r\n");
      out.write("											<th scope=\"row\">Email:</th>\r\n");
      out.write("											<td><input class=\"form-control\" type=\"email\"\r\n");
      out.write("												name=\"user_email\" value=\"");
      out.print(user.getEmail());
      out.write("\"></td>\r\n");
      out.write("										</tr>\r\n");
      out.write("										<tr>\r\n");
      out.write("											<th scope=\"row\">Name:</th>\r\n");
      out.write("											<td><input class=\"form-control\" type=\"text\"\r\n");
      out.write("												name=\"user_name\" value=\"");
      out.print(user.getName());
      out.write("\"></td>\r\n");
      out.write("										</tr>\r\n");
      out.write("										<tr>\r\n");
      out.write("											<th scope=\"row\">Password:</th>\r\n");
      out.write("											<td><input class=\"form-control\" type=\"password\"\r\n");
      out.write("												name=\"user_password\" value=\"");
      out.print(user.getPassword());
      out.write("\"></td>\r\n");
      out.write("										</tr>\r\n");
      out.write("										<tr>\r\n");
      out.write("											<th scope=\"row\">Gender:</th>\r\n");
      out.write("											<td>");
      out.print(user.getGender().toUpperCase());
      out.write("</td>\r\n");
      out.write("										</tr>\r\n");
      out.write("										<tr>\r\n");
      out.write("											<th scope=\"row\">DOB:</th>\r\n");
      out.write("											<td>");
      out.print(user.getDob());
      out.write("</td>\r\n");
      out.write("										</tr>\r\n");
      out.write("										<tr>\r\n");
      out.write("											<th scope=\"row\">Contact:</th>\r\n");
      out.write("											<td><input class=\"form-control\" type=\"text\"\r\n");
      out.write("												name=\"user_contact\" value=\"");
      out.print(user.getContact());
      out.write("\"></td>\r\n");
      out.write("										</tr>\r\n");
      out.write("										<tr>\r\n");
      out.write("											<th scope=\"row\">City:</th>\r\n");
      out.write("											<td><input class=\"form-control\" type=\"text\"\r\n");
      out.write("												name=\"user_city\" value=\"");
      out.print(user.getCity());
      out.write("\"></td>\r\n");
      out.write("										</tr>\r\n");
      out.write("										<tr>\r\n");
      out.write("											<th scope=\"row\">Address:</th>\r\n");
      out.write("											<td><input class=\"form-control\" type=\"text\"\r\n");
      out.write("												name=\"user_address\" value=\"");
      out.print(user.getAddress());
      out.write("\"></td>\r\n");
      out.write("										</tr>\r\n");
      out.write("										<tr>\r\n");
      out.write("											<th scope=\"row\">About:</th>\r\n");
      out.write("											<td><textarea class=\"form-control\" name=\"user_about\"\r\n");
      out.write("													rows=\"4\">");
      out.print(user.getAbout());
      out.write("</textarea></td>\r\n");
      out.write("										</tr>\r\n");
      out.write("										<tr>\r\n");
      out.write("											<th scope=\"row\">Profile:</th>\r\n");
      out.write("											<td><input class=\"form-control\" type=\"file\" name=\"image\"></td>\r\n");
      out.write("										</tr>\r\n");
      out.write("									</tbody>\r\n");
      out.write("								</table>\r\n");
      out.write("								<div class=\"container\">\r\n");
      out.write("									<button type=\"submit\" class=\"btn btn-outline-success\">Save</button>\r\n");
      out.write("								</div>\r\n");
      out.write("							</form>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"modal-footer\">\r\n");
      out.write("					<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("						data-dismiss=\"modal\">Close</button>\r\n");
      out.write("					<button id=\"edit-profile-button\" type=\"button\"\r\n");
      out.write("						class=\"btn btn-primary\">Edit</button>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!--End of profile modal-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-md-4\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<a href=\"#\"\r\n");
      out.write("					class=\"mt-4 text-white text-center list-group-item list-group-item-action primary-background\">DASHBOARD</a>\r\n");
      out.write("\r\n");
      out.write("				<button\r\n");
      out.write("					class=\"mt-4 text-center list-group-item list-group-item-action list-group-item-primary\">Ready\r\n");
      out.write("					to appear for your exam</button>\r\n");
      out.write("\r\n");
      out.write("				");

				for (Course course : list1) {
				
      out.write("\r\n");
      out.write("				<a href=\"SubjectServlet?cid=");
      out.print(course.getCid());
      out.write("\"\r\n");
      out.write("					class=\"list-group-item list-group-item-action list-group-item-light\">");
      out.print(course.getName());
      out.write("</a>\r\n");
      out.write("\r\n");
      out.write("				");

				}
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-8\">\r\n");
      out.write("\r\n");
      out.write("				<h2 class=\"my-2 display-4 text-center\">View your result at\r\n");
      out.write("					glance</h2>\r\n");
      out.write("\r\n");
      out.write("				<div id=\"accordion\" class=\"mt-4\">\r\n");
      out.write("\r\n");
      out.write("					");

					int uid = user.getId();
					UserResultDao d = new UserResultDao(ConnectionProvider.getConnection());

					ArrayList<UserResult> list2 = d.getUserResultByUid(uid);
					if (list2.isEmpty()) {
					
      out.write("\r\n");
      out.write("					<br>\r\n");
      out.write("					<h3>Enhance your knowledge by taking exam</h3>\r\n");
      out.write("\r\n");
      out.write("					");

					} else {
					for (UserResult ur : list2) {
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<div class=\"card-header\" id=\"headingOne\">\r\n");
      out.write("							<h5 class=\"mb-0\">\r\n");
      out.write("								<button class=\"btn btn-link\" data-toggle=\"collapse\"\r\n");
      out.write("									data-target=\"#");
      out.print(ur.getCid());
      out.write("\" aria-expanded=\"true\"\r\n");
      out.write("									aria-controls=\"collapseOne\">\r\n");
      out.write("									Course:\r\n");
      out.write("									");
      out.print(dao.getCourseNameByCid(ur.getCid()));
      out.write("\r\n");
      out.write("								</button>\r\n");
      out.write("							</h5>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div id=\"");
      out.print(ur.getCid());
      out.write("\" class=\"collapse show\"\r\n");
      out.write("							aria-labelledby=\"headingOne\" data-parent=\"#accordion\">\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								You have scored:\r\n");
      out.write("								");
      out.print(ur.getMark());
      out.write("\r\n");
      out.write("								<br> Your Status is :\r\n");
      out.write("								");
      out.print(ur.getStatus());
      out.write("\r\n");
      out.write("								<br> Exam is taken on :\r\n");
      out.write("								");
      out.print(DateFormat.getDateTimeInstance().format(ur.getDatetime()));
      out.write("\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					");

					}
					}
					
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- footer -->\r\n");
      out.write("\r\n");
      out.write("	<nav class=\"navbar fixed-bottom navbar-dark bg-dark mt-5\">\r\n");
      out.write("		<div class=\"text-white mr-auto ml-auto\">OEWP | Copyright@2021</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("\r\n");
      out.write("	<!-- JavaScript -->\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"\r\n");
      out.write("		integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"\r\n");
      out.write("		integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"\r\n");
      out.write("		integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<script src=\"js/myjs.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("		$(document).ready(function() {\r\n");
      out.write("\r\n");
      out.write("			let editStatus = false;\r\n");
      out.write("\r\n");
      out.write("			$('#edit-profile-button').click(function() {\r\n");
      out.write("				//alert(\"Button Clicked\");\r\n");
      out.write("				if (editStatus === false) {\r\n");
      out.write("					$('#profile-details').hide();\r\n");
      out.write("					$('#profile-edit').show();\r\n");
      out.write("					editStatus = true;\r\n");
      out.write("					$(this).text(\"Back\");\r\n");
      out.write("				} else {\r\n");
      out.write("					$('#profile-details').show();\r\n");
      out.write("					$('#profile-edit').hide();\r\n");
      out.write("					editStatus = false;\r\n");
      out.write("					$(this).text(\"Edit\");\r\n");
      out.write("				}\r\n");
      out.write("\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("		\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
