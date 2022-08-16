/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
/**
 *
 * @author ProfessoR
 */
public class DBCon {
    
    public static Connection createConnection() throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
        
        return con;
    }
    
    
    public static int addpatient(Patient pa){
        int status = 0;
        
        try{
            
            PreparedStatement ps = createConnection().prepareStatement("INSERT INTO patient VALUES (?, ?, ?)");
            ps.setString(1, pa.getName());
            ps.setString(2, pa.getEmail());
            ps.setString(3, pa.getPassword());
            
            status = ps.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Error occured..!! " + e);
        }
        
        return status;
        
         
    }
    
    
    
    public boolean verifyPatient(String inputEmail, String inputPassword){
    
        int x = 0;
        
        try{
            PreparedStatement ps = createConnection().prepareStatement("SELECT * FROM patient WHERE email = ? AND password = ?");
            ps.setString(1, inputEmail);
            ps.setString(2, inputPassword);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                x = 1;
            }else{
                x = 0;
            }
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Error Occured..!! " + e);
        }

        return x == 1;
    }
    
    public boolean makeAppointment(String inputName, String inputNumber, String inputEmail, String inputTime, String inputMessage){
        
        int x = 0;
        
        try{
            PreparedStatement ps = createConnection().prepareStatement("INSERT INTO appointment VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, inputName);
            ps.setString(2, inputNumber);
            ps.setString(3, inputEmail);
            ps.setString(4, inputTime);
            ps.setString(5, inputMessage);
            
            x = ps.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Error Occured..!! " + e);
        }
        
        return x == 1;
    }
    
    public boolean verifyDoctor(String inputUsername, String inputPassword){
        
        int x = 0;
        
        try{
            PreparedStatement ps = createConnection().prepareStatement("SELECT * FROM doctor WHERE username = ? AND password = ?");
            ps.setString(1, inputUsername);
            ps.setString(2, inputPassword);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                x = 1;
            }else{
                x = 0;
            }
            
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Error Occured..!! " + e);
        }
        
        return x == 1;
        
    }
    
}
