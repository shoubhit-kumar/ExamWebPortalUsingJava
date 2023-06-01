package com.exam.servlet;

import com.exam.dao.QuestionDao;
import com.exam.dao.UserResultDao;
import com.exam.entities.Answers;
import com.exam.entities.Questions;
import com.exam.entities.User;
import com.exam.entities.UserResult;
import com.exam.helper.ConnectionProvider;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
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
public class QuestionServlet extends HttpServlet {

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
            throws ServletException, IOException, NumberFormatException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        	
        	HttpSession session = request.getSession();
        	
			/*
			 * Integer c = (Integer) session.getAttribute("cid"); int cid =
			 * Integer.valueOf(c);
			 */
			
			String c = session.getAttribute("cid").toString();
			int cid = Integer.parseInt(c);
			
			
			User user = (User) session.getAttribute("currentUser");
			QuestionDao dao = new QuestionDao(ConnectionProvider.getConnection());
			ArrayList<Questions> list = dao.getQuestionsByCid(cid);
			
			ArrayList<Answers> list1 = new ArrayList<>();
			
			int param = -1, ca = 0, na = 0,wa = 0, n = 0;
			float mark = 0.0f;
			String status, ao;
			
			for (Questions question : list) {
				
				param = Integer.parseInt(request.getParameter(Integer.toString(question.getQid())));
				if(param == question.getAnswer())
				{
					++ca;//correct answer
					ao = "Correct Answer";
				}
				else if(param == -1) {
					++na;//not answered
					ao = "Not Answered";
					
				}
				else {
					++wa;//wrong answer
					ao = "Wrong Answer";
				}
				
				++n;//no of questions

				Answers answer = new Answers(question.getQid(), ao, user.getId(), cid);
				list1.add(answer);
			}
			mark=(float)ca/n*100;
			
			if(mark >= 40.0) {
				status = "PASS";
			}
			else
			{
				status = "FAIL";
			}
			
			
            
			UserResult userResult = new UserResult(user.getId(), cid, mark, status);
			UserResultDao d = new UserResultDao(ConnectionProvider.getConnection());
        	
			if(d.saveUserResult(userResult)) {
				out.println("Done");
			}
			else {
				out.println("Error");
			}
			
			session.removeAttribute("cid");
			
			request.setAttribute("answer_list", list1);
			RequestDispatcher rd = request.getRequestDispatcher("answers.jsp");
            rd.forward(request, response);
			
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
