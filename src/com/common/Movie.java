/*
 * TNS
 */



package com.common;





public class Movie {

	private String name;
	private String plot;
	private String year;
	private String genere;


	public Movie(){

	}


	public Movie( String name, String plot, String year, String genere ){
		this.name = name;
		this.plot = plot;
		this.year = year;
		this.genere = genere;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPlot() {
		return plot;
	}


	public void setPlot(String plot) {
		this.plot = plot;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getGenere() {
		return genere;
	}


	public void setGenere(String genere) {
		this.genere = genere;
	}


	


	 
	
}


