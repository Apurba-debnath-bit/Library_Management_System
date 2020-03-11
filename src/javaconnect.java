import java.sql.*;
import javax.swing.*;

public class javaconnect {
    Connection conn;
    
    public static Connection connectionDb(){
    try{
    Class.forName("org.sqlite.JDBC");
    Connection conn= DriverManager.getConnection("JDBC:sqlite:F:\\Java_Project\\Library_Management_System\\LibrarayManagement.sqlite");
    return conn;
    
    
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    return null;
    }
    
    }
    
}
