/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
@WebServlet(name = "TriangleController", urlPatterns = {"/TriangleController"})
public class TriangleController extends HttpServlet {

    

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
        String sFLeg = request.getParameter("firstleg");
        String sSLeg = request.getParameter("secondleg");
        String strAnswer = "";
        
        try {
            TriangleCalculator calc = new TriangleCalculator();
            calc.setFirstleg(sFLeg);
            calc.setSecondleg(sSLeg);
            strAnswer = "" + calc.getThirdleg();
            
        } catch(NumberFormatException nfe) {
            strAnswer = "Sorry, you must provide 2 numerical values.";
        }
     
        String destination = "/index.jsp";
        request.setAttribute("thirdleg", strAnswer);
        
        RequestDispatcher view =
                request.getRequestDispatcher(destination);
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
