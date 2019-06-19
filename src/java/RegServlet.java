/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.IOException;
import java.io.PrintWriter;
import static java.util.logging.Logger.global;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Anoosha I A
 */
public class RegServlet extends HttpServlet {
   //public int id;
  
    
   

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
       
       
        
           String Name= request.getParameter("Name");
        
         
     
         String Address= request.getParameter("Address");
        
         
      
         String Email= request.getParameter("Email");
        
         
     
         String Password= request.getParameter("Password");
     
         String User= request.getParameter("User");
     // int Contract_id=Email;
     
     
  
 
      //    out.print("Name"+Name+"Address"+Address+"Email"+Email+"Password"+Password+"User"+User);
          
         
        // out.print("Contract_id="+Contract_id);
      //String Contract_id=Name;
      
        // out.print("Contract_id="+Name);
         
         String qry = "insert into signin(Name,Address,Email,Password,User) values ('"+Name+"','"+Address+"','"+Email+"','"+Password+"','"+User+"')";

     
        loginRegistration cr = new loginRegistration();
    
        
         boolean res = cr. SignUPlogin(qry);
        
        
   if(res == true)
   {
       out.print("SignUP sucessfully! ");
   }
   else
   {
       out.print("SignUP error ");
   }
        
   
   HttpSession session= request.getSession();  
        request.getRequestDispatcher("RegSuccess.html").include(request, response);
       // id=++Contract_id;
       // out.println(id);
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
