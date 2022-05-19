package jdbcIntro;

// importing package

import java.sql.*;

public class AddJdbc {

	public static void main(String[] args) throws Exception
	{
		
		// user is my table name in the database named student
		String url="jdbc:mysql://localhost:3306/student";
		String name="root";
		String pass="8789";
		String query="Select * from user";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,name,pass);
		Statement st=con.createStatement();
		
		// execute query is used to fetch the information from database
		ResultSet rs=st.executeQuery(query);
		
		
		
		String userData ="";
		
		while(rs.next())
		{
			userData=rs.getInt(1)+ "  :  "+ rs.getString(2)+ "  :  "+ rs.getString(3);
		    System.out.println(userData);
		}    
		
		
		
	}

}
