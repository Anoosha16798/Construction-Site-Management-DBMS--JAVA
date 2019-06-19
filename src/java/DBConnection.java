
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anoosha I A
 */
public class DBConnection {
    
     Connection con=null;


public Connection DBConnection()
{
     
        try
        {  
        Class.forName("com.mysql.jdbc.Driver");  
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");  
        }
        catch(Exception e)
        {
         System.out.println("exception ");
        }  
     return con;
    
}
    
}
