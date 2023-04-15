package com.banking.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db_con {
	private Connection connection = null;

	public Connection getConnection() throws SQLException {

	    try {
	    	 Class.forName("com.mysql.cj.jdbc.Driver");
	         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");

	    	 System.out.println("Connection successful");
	      
	    } catch (Exception e) {
	       System.err.println(e);
	    }
	    return connection;
	  }
}
