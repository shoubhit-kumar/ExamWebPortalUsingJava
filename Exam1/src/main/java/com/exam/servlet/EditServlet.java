package com.exam.servlet;

import com.exam.dao.UserDao;
import com.exam.entities.Message;
import com.exam.entities.User;
import com.exam.helper.ConnectionProvider;
import com.exam.helper.Helper;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;
import java.io.File;

/**
 *
 * @author Anonymous
 */
@MultipartConfig
public class EditServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            //Fetch all data from form
            String userEmail = request.getParameter("user_email");
            String userName = request.getParameter("user_name");
            String userPassword = request.getParameter("user_password");
            Long userContact = Long.parseLong(request.getParameter("user_contact"));
            String userCity = request.getParameter("user_city");
            String userAddress = request.getParameter("user_address");
            String userAbout = request.getParameter("user_about");

            Part part = request.getPart("image");//image - name in form- input tag
            String imageName = part.getSubmittedFileName();

            //get the user from the session
            HttpSession s = request.getSession();
            User user = (User) s.getAttribute("currentUser");
            user.setEmail(userEmail);
            user.setName(userName);
            user.setAbout(userAbout);
            user.setPassword(userPassword);
            user.setContact(userContact);
            user.setCity(userCity);
            user.setAddress(userAddress);
            String oldFile = user.getProfile();
            user.setProfile(imageName);

            
            //out.println(request.getRealPath("/"));
            //D:\Didi Minor Project\WorkSpace 2\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\Exam1\profiles
            
            //upadate this data in db
            UserDao userDao = new UserDao(ConnectionProvider.getConnection());
            boolean ans = userDao.UpdateUser(user);
            if (ans) {
                String path = request.getRealPath("/") + "profiles" + File.separator + user.getProfile();
                //out.print(path);
                //delete old uploaded pictures
                String pathOldFile = request.getRealPath("/") + "profiles" + File.separator + oldFile;

                if (!oldFile.equals("default.png")) {
                    Helper.deleteFile(pathOldFile);
                }

                if (Helper.saveFile(part.getInputStream(), path)) {
//                    out.println("Profile Updated");

                    Message msg = new Message("Profile Details Updated", "success", "alert-success");

                    s.setAttribute("msg", msg);

                }

            } else {
                Message msg = new Message("Something Went Wrong!!", "error", "alert-danger");

                s.setAttribute("msg", msg);
            }

            response.sendRedirect("profile.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
