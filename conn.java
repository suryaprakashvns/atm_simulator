
import java.sql.*;  

public class conn{
    Connection con;
    Statement s;
    public conn(){  
        try{  
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","atif","atif");
            s =con.createStatement();  
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
} 
