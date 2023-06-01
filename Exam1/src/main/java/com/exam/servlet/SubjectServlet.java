package com.exam.servlet;

import com.exam.dao.ExamDao;
import com.exam.dao.UserDao;
import com.exam.dao.UserResultDao;
import com.exam.entities.Message;
import com.exam.entities.Query;
import com.exam.entities.User;
import com.exam.entities.UserResult;
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
public class SubjectServlet extends HttpServlet {

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
        	
        	
        	int cid = Integer.parseInt(request.getParameter("cid"));
        	HttpSession session = request.getSession();
        	User user = (User) session.getAttribute("currentUser");
        	int uid = user.getId();
        	
        	String c = Integer.toString(cid);
        	session.setAttribute("cid", c);
        	
        	
        	UserResultDao dao = new UserResultDao(ConnectionProvider.getConnection());
        	UserResult userResult = dao.getUserResultByUidAndCid(uid, cid);
        	
        	if((userResult != null) && (userResult.getMark() >= 40.0)) {
        		Message msg = new Message("You already appeared for this exam and also passed with good marks!!", "success", "alert-warning");
                HttpSession s = request.getSession();
                s.setAttribute("msg", msg);
                
                response.sendRedirect("profile.jsp");
        	}
        	
        	else {
        		response.sendRedirect("termsandcondition.jsp");
        	}
        	
        	
        	
        	
        	
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
