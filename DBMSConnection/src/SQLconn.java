import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.CallableStatement;
import java.util.Scanner;



public class SQLconn {
	
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","Mihir@2004");
            System.out.println("Connection established");
            
            String query = "{call proc}";
            CallableStatement stmt = conn.prepareCall(query);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
            	System.out.println(rs.getString(2));
            }
              
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
}