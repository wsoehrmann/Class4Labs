package controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import model.AreaRectangleCalculator;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Wesley
 */
@WebServlet(name = "AreaController", urlPatterns = {"/AreaController"})
public class AreaRectangleController extends HttpServlet {
   

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
          PrintWriter out = response.getWriter();
          
//          System.out.println("response = " +response.toString());
        String sLen = request.getParameter("length");
        String sWid = request.getParameter("width");
        String strAnswer = "";
        System.out.println("width =" + sLen + "length =" + sWid );
        try {
            AreaRectangleCalculator calc = new AreaRectangleCalculator();
            calc.setLength(sLen);
            calc.setWidth(sWid);
            strAnswer = "" + calc.getArea();
            System.out.println("answer" + strAnswer);
//            System.out.println("response = " +response.toString());
        } catch(NumberFormatException nfe) {
            strAnswer = "Sorry, you must provide 2 numerical values.";
            System.out.println("answer" + strAnswer);
        } catch(Exception e) {
            System.out.println("Another error " + e);
        }
     
        String destination = "/index.jsp";
        request.setAttribute("rectAnswer", strAnswer);
        
        RequestDispatcher view = request.getRequestDispatcher(destination);
        
//        response.toString();
        
        view.forward(request, response);
        
    }
        
        
     
    
       
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
