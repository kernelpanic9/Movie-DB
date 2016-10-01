/*
 * TNS
 */



package com.addMovie;



import java.sql.SQLException;

import com.common.Movie;
import com.common.MovieDao;



public class AddMovieService {

	
	public boolean addMovie( Movie movie ){
		MovieDao md;
		try {
			md = new MovieDao();
			if( md.addMovie(movie) ){
				return true;
			}
			return false;
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	
}


