   <%-- 
    Document   : viewAppointment
    Created on : Mar 25, 2021, 1:04:42 PM
    Author     : Mithina Jayamanna
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
      <!-- aos css file cdn link  -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/aos/2.3.4/aos.css">

    <!-- magnific popup css cdn link  -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/magnific-popup.min.css">

    <!-- bootstrap cdn link  -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.3/css/bootstrap.min.css">

    <!-- font awesome cdn link  -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">

    
    
    <link rel="stylesheet" href="css/style.css">
    
    <link rel ="stylesheet" href ="css/tablecss.css">
        
  
        
    </head>
    <body>
        
  
        
<header>

<div class="container">

    <a href="#" class="logo">
        
        
        <h3 style = "color : #354046">
            
            <%
            
            session.setMaxInactiveInterval(20);
            String username = (String) session.getAttribute("info");
                
            out.println("Welcome " + username);
            
            %>
            
        </h3>
        
        
    </a>

            <nav class="nav" >
        <ul>
            <li><a href="index.html#home">home</a></li>
            <li><a href="index.html#about">about</a></li>
            <li><a href="index.html#facility">facility</a></li>
            <li><a href="index.html#review">review</a></li>
            <li><a href="index.html#contact">contact</a></li>
            <li><a href="index.html#doctor.jsp">Management</a></li>
            <li><a href="DoctorLogout">Sign Out</a></li>
        </ul>
    </nav>

    <div class="fas fa-bars"></div>

</div>

</header>
        
        
        
        
        <section style = "padding-top : 100px;">
  <!--for demo wrap-->
  
  <div class="tbl-header">
      
    <table cellpadding="0" cellspacing="0" border="0">
        <p>Appointments</p>
      <thead>
         
        <tr>
          <th>Full Name</th>
          <th>Phone Number</th>
          <th>Email</th>
          <th>Time</th>
          <th>Message</th>
        </tr>
      </thead>
    </table>
  </div>
  <div class="tbl-content">
    <table cellpadding="0" cellspacing="0" border="0">
      <tbody>
        
         <%
             
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
        
        try{
        
             PreparedStatement ps = con.prepareStatement("SELECT * FROM appointment");
             ResultSet rs = ps.executeQuery();
             
             while(rs.next()){ 
           
            %>
            
            <tr>
            <td><%= rs.getString("name") %></td>
            <td><%= rs.getString("number") %></td>
            <td><%= rs.getString("email") %></td>
            <td><%= rs.getString("time") %></td>
            <td><%= rs.getString("message") %></td>
            </tr>
            
            <%
               
           }
        }catch(Exception ex){
            out.println("Error Occured..!! " + ex);
        }         
         %> 
        
      </tbody>
    </table>
  </div>
</section>
    </body>
</html>
