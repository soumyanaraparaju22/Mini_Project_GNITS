
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Agarwal
 */
public class Connect {
    Connection con=null;
   
        public static Connection ConnectDB(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=EXCEPTION&autoReconnect=true&characterEncoding=UTF-8&characterSetResults=UTF-8","root","Harryp123!@#");
           return con; //jdbc:mysql://localhost:50781/jayshreesteels?zeroDateTimeBehavior=CONVERT_TO_NULL
           
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }      
    }
}
