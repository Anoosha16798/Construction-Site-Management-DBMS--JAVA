/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Anoosha I A
 */
public class ClientViewServlet extends HttpServlet {

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
            
            loginRegistration cr = new loginRegistration();
        String qry = "select* from StatusUpdate where Contract_id='"+Contract_id+"'";
        
  List mylist =  cr.CVSelect(qry);
   
 // out.print("Status:  Contract_id\n"
   //       + "Projected\n"
    //      + "Start_Date\n"
          
       //   + "End_Date "+ mylist); 
   if(mylist.size()!=0) 
        
        { 
       
        out.println("Welcome, "); 
        out.println("Status: \n"
                + " Contract_id\n\t"
        + "Projected\n\t"
         + "Start_Date\n\t"
          
         + "End_Date\n\t"+ mylist);
        HttpSession session= request.getSession();  
        request.getRequestDispatcher("ClientView.html").include(request, response); 
   
      //   request.getRequestDispatcher("index.html").include(request, response);
        }  
        else
         {  
            out.println("Sorry, contract_id error!");  
            request.getRequestDispatcher("index.html").include(request, response);  
         }  
        
        
        out.close(); 
        
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
