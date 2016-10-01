/*
 * TNS
 */



package com.addMovie;



import com.common.Movie;



public class AddMovieAction {

	private Movie movie;
	
	
	
	
	public Movie getMovie() {
		return movie;
	}


	public void setMovie(Movie movie) {
		this.movie = movie;
	}



	public String execute(){
		AddMovieService addMovieService = new AddMovieService();
		if( addMovieService.addMovie(movie) ){
			return "success";
		}
		else{
			return "failure";
		}
	}
	
	
	
	
}






