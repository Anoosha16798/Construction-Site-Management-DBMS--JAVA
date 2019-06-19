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
public class WorkScheduleServlet extends HttpServlet {

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
      String EW= request.getParameter("EW");
         String PW= request.getParameter("PW");
         String SW= request.getParameter("SW");
         String L= request.getParameter("L");
         String MW= request.getParameter("MW");
         String DW= request.getParameter("DW");
         String P= request.getParameter("P");
         String EL= request.getParameter("EL");
         String ED= request.getParameter("ED");
         String FC= request.getParameter("FC");
        // out.print("Contract_id"+Contract_id+"EW"+EW+"PW"+PW+"SW"+L+"MW"+DW+"P"+P+"EL"+EL+"ED"+ED+"FC"+FC);
         
         
           
           String qry= "insert into workschdule values ('"+Contract_id+"','"+EW+"','"+PW+"','"+SW+"','"+L+"','"+MW+"','"+DW+"','"+P+"','"+EL+"','"+ED+"','"+FC+"')";
        
        
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
