/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DBCon;

/**
 *
 * @author ProfessoR
 */
public class Appointment extends HttpServlet {

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
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String name =request.getParameter("apName");
        String number =request.getParameter("apNumber");
        String email =request.getParameter("apEmail");
        String time =request.getParameter("apTime");
        String message =request.getParameter("apMessage");
        
        
        
        
        
        try{
            Cookie ck[] = request.getCookies();
            String emailCookie = ck[0].getValue();
               
            DBCon con = new DBCon();
            con.makeAppointment(name,number,email,time,message);
        
            out.println("<p style = 'position : absolute; top : 480px; left : 790px; color : #0188DF; font-size : 20px; font-family : georgia; '>Appointment Successful..!!</p>");
            RequestDispatcher req = request.getRequestDispatcher("index.html");
            req.include(request, response);
            
        }
        catch (Exception e){
            
            out.println("<h3>Please Login First..!!</h3>");
            RequestDispatcher req = request.getRequestDispatcher("register.jsp");
            req.include(request, response);
            
        }
        
        
        
        
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
