/**
 * TNS
 */


package com.common;



import java.sql.SQLException;

import java.sql.Statement;



public class MovieDao extends Dao {

	
	public MovieDao() throws SQLException, ClassNotFoundException {
		super();
	}

	
	public boolean addMovie( Movie movie ){
		try {
			Statement st = con.createStatement();
			String query = "insert into movie values( null, '" + movie.getName() + "', '" + movie.getPlot() + "', '" + movie.getYear() 
					+ "', '" + movie.getGenere() +"' )";
			st.executeUpdate(query);
			return true;
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}		
	}
	
	
	/*
	public boolean updateMovie(){
		
	}
	*/
	
	
	
}




