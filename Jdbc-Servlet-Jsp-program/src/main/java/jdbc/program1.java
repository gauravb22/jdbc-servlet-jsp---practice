package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class program1 {
	private static final String DB_URL ="jdbc:mysql://localhost:3306/advjdb";
	private static final String DB_UNAME ="root";
	private static final String DB_PWD ="admin123";
	private static final String INSERT_SQL ="insert into books values(108,'Microservices',1800)";
	
	public static void main(String[]args) throws Exception{
		//load driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//get db connection
		Connection con=DriverManager.getConnection(DB_URL,DB_UNAME,DB_PWD);
		
		//create statement
		Statement stmt= con.createStatement();
		
		//execute query
		int rowsEffected = stmt.executeUpdate(INSERT_SQL);
		
		//process result
		System.out.println("record inserted count::"+ rowsEffected);
		
		//connection close
		con.close();
	}
}