/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validateForm()                                    
{ 
    var Name = document.forms["RegForm"]["Name"];  
      var Address = document.forms["RegForm"]["Address"];
    var Email = document.forms["RegForm"]["Email"];    
    var Phone = document.forms["RegForm"]["Phone"];    
    var Password = document.forms["RegForm"]["Password"];  
     
   
    if (Name.value == "")                                  
    { 
        window.alert("Please enter your Name."); 
        Name.focus(); 
        return false; 
    } 
   
    if (Address.value == "")                               
    { 
        window.alert("Please enter your Address."); 
        name.focus(); 
        return false; 
    } 
       
    if (Email.value == "")                                   
    { 
        window.alert("Please enter a valid Email."); 
        Email.focus(); 
        return false; 
    } 
   
    if (Email.value.indexOf("@", 0) < 0)                 
    { 
        window.alert("Please enter a valid Email."); 
        Email.focus(); 
        return false; 
    } 
   
    if (Email.value.indexOf(".", 0) < 0)                 
    { 
        window.alert("Please enter a valid Email."); 
        Email.focus(); 
        return false; 
    } 
   
    if (Phone.value == "")                           
    { 
        window.alert("Please enter your Phone number."); 
        Phone.focus(); 
        return false; 
    } 
   
    if (Password.value == "")                        
    { 
        window.alert("Please enter your Password"); 
        Password.focus(); 
        return flase; 
    } 
   
    
   
    return true; 
    }




