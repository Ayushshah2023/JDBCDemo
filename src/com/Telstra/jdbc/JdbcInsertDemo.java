package com.Telstra.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertDemo {

	public static void main(String[] args) {
		//try
		//{
			//Class.forName("com.mysql.jdbc.Driver");
		//}
		//catch(ClassNotFoundException e) {
			//e.printStackTrace();
		//}
		String url = "jdbc:mysql://localhost:3307/Telstra";
		String username = "root";
		String password = "1601";
		String insertCommand = "INSERT INTO Employees VALUES(8091,'Venkat','Trainer')";
		int i = 0;
		
		Connection cn = null;
		Statement st = null;
		try
		{
			cn = DriverManager.getConnection(url, username, password);
			st = cn.createStatement();
			i = st.executeUpdate(insertCommand);
			System.out.println("...Records are added.....");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}
