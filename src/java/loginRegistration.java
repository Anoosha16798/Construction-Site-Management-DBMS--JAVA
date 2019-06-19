
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import static jdk.nashorn.internal.objects.NativeFunction.call;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anoosha I A
 */
public class loginRegistration {
    
    
   public boolean SignUPlogin(String qry)
    {
                boolean cRegStatus = false; 
                Connection dbcon1;
		try { 
                        DBConnection dbcon = new DBConnection();
                        dbcon1 = dbcon.DBConnection();
                        Statement stmt = dbcon1.createStatement();
                        
                        int i =  stmt.executeUpdate(qry);
                       
                       if (i > 0)
                       {
                           cRegStatus = true;
                           
                       }
                       else
                       {
                           cRegStatus = false;
                           
                       }      
			 
                    }
		catch(SQLException  ex)
                {
			ex.printStackTrace();
		}
             
        
        return cRegStatus;
    }

   
    
    
     public boolean LoginUpdate(String query)
    {
                boolean cRegStatus = false; 
                Connection dbcon1;
		try { 
                        DBConnection dbcon = new DBConnection();
                        dbcon1 = dbcon.DBConnection();
                        Statement stmt = dbcon1.createStatement();
                        
                        int i =  stmt.executeUpdate(query);
                       
                       if (i > 0)
                       {
                           cRegStatus = true;
                           
                       }
                       else
                       {
                           cRegStatus = false;
                           
                       }      
			 
                    }
		catch(SQLException  ex)
                {
			ex.printStackTrace();
		}
             
        
        return cRegStatus;
    }
    
    public List LoginSelect(String qry)
    {
                boolean cRegStatus = false; 
                Connection dbcon1;
                ResultSet res = null;
                
                List mylist = new ArrayList();
		try { 
                        DBConnection dbcon = new DBConnection();
                        dbcon1 = dbcon.DBConnection();
                        Statement stmt = dbcon1.createStatement();
                        
                        res =  stmt.executeQuery(qry);
                       
                       
                        while(res.next())
                        {
                            
                              mylist.add(res.getString("Name"));
                               mylist.add(res.getString("Address"));
                                mylist.add(res.getString("Email"));
                                 mylist.add(res.getString("Password"));
                              
                               mylist.add(res.getString("User"));
                               mylist.add(Integer.parseInt(res.getString("Contract_id")));
                            
                         
                            
                           
                              
                        }
                       
                    }
		catch(SQLException  ex)
                {
			ex.printStackTrace();
		}
             
        
        return mylist;
    }
    public List CVSelect(String qry)
    {
                boolean cRegStatus = false; 
                Connection dbcon1;
                ResultSet res = null;
                
                List mylist = new ArrayList();
		try { 
                        DBConnection dbcon = new DBConnection();
                        dbcon1 = dbcon.DBConnection();
                        Statement stmt = dbcon1.createStatement();
                        
                        res =  stmt.executeQuery(qry);
                       
                       
                        while(res.next())
                        {
                            
                            mylist.add(Integer.parseInt(res.getString("Contract_id")));
                            System.out.print("Projected");
                             mylist.add(res.getString("Projected"));
                             System.out.print("Start_Date");
                              mylist.add(res.getString("Start_Date"));
                              System.out.print("End_Date");
                               mylist.add(res.getString("End_Date"));
                               System.out.print("Cost");
                                mylist.add(res.getString("Cost"));
                            
                            
                            
                        }
                        
                        
                        
                        
			 
                    }
		catch(SQLException  ex)
                {
			ex.printStackTrace();
		}
             
        
        return mylist;
    }
public List RegSuccessSelect(String qry)
    {
                boolean cRegStatus = false; 
                Connection dbcon1;
                ResultSet res = null;
                
                List mylist = new ArrayList();
		try { 
                        DBConnection dbcon = new DBConnection();
                        dbcon1 = dbcon.DBConnection();
                        Statement stmt = dbcon1.createStatement();
                        
                        res =  stmt.executeQuery(qry);
                       
                       
                        while(res.next())
                        {
                              mylist.add(Integer.parseInt(res.getString("Contract_id")));
                              mylist.add(res.getString("Name"));
                             
                        }
                       
                    }
		catch(SQLException  ex)
                {
			ex.printStackTrace();
		}
             
        
        return mylist;
    }

public boolean ManagerUpdate(String qry)
    {
                boolean cRegStatus = false; 
                Connection dbcon1;
		try { 
                        DBConnection dbcon = new DBConnection();
                        dbcon1 = dbcon.DBConnection();
                        Statement stmt = dbcon1.createStatement();
                        
                        int i =  stmt.executeUpdate(qry);
                       
                       if (i > 0)
                       {
                           cRegStatus = true;
                           
                       }
                       else
                       {
                           cRegStatus = false;
                           
                       }      
			 
                    }
		catch(SQLException  ex)
                {
			ex.printStackTrace();
		}
             
        
        return cRegStatus;
    }
 public boolean StProc(String qry)
    {
                boolean cRegStatus = false; 
                Connection dbcon1;
		try { 
                        DBConnection dbcon = new DBConnection();
                        dbcon1 = dbcon.DBConnection();
                        Statement stmt = dbcon1.createStatement();
                       
                        int i =  stmt.executeUpdate(qry);
                       
                       if (i > 0)
                       {
                           cRegStatus = true;
                           
                       }
                       else
                       {
                           cRegStatus = false;
                           
                       }    
                      
                       
                       
                     
			 
			 
                    }
		catch(SQLException  ex)
                {
			ex.printStackTrace();
		}
             
        
        return cRegStatus;
    }


}
