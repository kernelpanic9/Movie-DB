package com.common;



import java.sql.*;


public class Dao {

	private String username;
	private String password;
	protected Connection con;
	
	
	public Dao() throws SQLException, ClassNotFoundException{
		this.username = "root";
		this.password = "";
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/webapp_database", username, password );
	}
	
		
}
