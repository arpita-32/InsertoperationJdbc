package jdbcinsertdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {

	public static void main(String[]args) throws Exception
	{
        //-------user values----//
		String name1 = "pari";
		String email1 = "pari49@gmail.com";
		String pass1 = "pari123";
		String gender1 = "female";
		String city1 = "goa";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","123456789");
		
		PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
		ps.setString(1, name1);
		ps.setString(2, email1);
		ps.setString(3, pass1);
		ps.setString(4, gender1);
		ps.setString(5, city1);
		int i = ps.executeUpdate();
		if(i > 0)
		{
			System.out.println("success");
		}
		else {
			System.out.println("fail");
		}
		
		con.close();
		
	}
}
