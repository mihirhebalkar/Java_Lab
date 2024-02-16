import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

//java.sql.* imports all


public class LoginDemo {
	
	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");//jar file 
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mihir_jdbc","root","Mihir@2004");
			//mysql things like host, database, user, password
			
			System.out.println("Connection established...");
			
			Statement stmt = conn.createStatement();
			
			
			System.out.println("Username\tPassword");
			ResultSet rs = stmt.executeQuery("select * from login");
			while(rs.next()) 
			{
				System.out.println(rs.getString(1)  //print value of first column
						+"\t\t" + rs.getString(2)); 
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
}
