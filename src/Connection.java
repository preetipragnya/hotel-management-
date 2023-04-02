/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author preet
 */
import java.sql.*;
public class Connection {
    Connection con;
    ResultSet preparedStatement;
    
    void getConnected()
    {
        try{
       Class.forName("com.mysql.cj.jdbc.Driver");
      con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels","root","PA@17pree");
      
    }catch(Exception e)
    {
        e.printStackTrace();
    }
    }

    PreparedStatement preparedStatement(String select__from_signin_where_usernamepasswor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
