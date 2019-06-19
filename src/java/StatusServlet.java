/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Anoosha I A
 */
public class StatusServlet extends HttpServlet {

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
       PrintWriter out = response.getWriter();
       
        int Contract_id= Integer.parseInt(request.getParameter("Contract_id"));
         String Projected= request.getParameter("Projected");
         String Start_Date= request.getParameter("Start_Date");
          String End_Date= request.getParameter("End_Date");
           String CostInPer= request.getParameter("CostInPer");
         
         
         
         //out.print("Contract_id "+Contract_id+"Projected"+Projected+ "Start_Date"+ Start_Date+" End_Date"+End_Date+"CostInPer"+CostInPer);
         
         
           
           String qry= "insert into statusupdate values ('"+Contract_id+"','"+Projected+"','"+Start_Date+"','"+ End_Date+"','"+CostInPer+"')";
        
        
        loginRegistration cr = new loginRegistration();
   boolean res = cr.SignUPlogin(qry);
        
   if(res == true)
   {
       out.print("inserted rec sucessfully! ");
   }
   else
   {
       out.print("insertion error ");
   }
     HttpSession session= request.getSession();  
      
        request.getRequestDispatcher("ManagerView.html").include(request, response);
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
