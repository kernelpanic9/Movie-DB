package com.signUp;


import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.commons.io.FileUtils;

import com.common.User;


public class SignUpAction {
	
	private User user;
		
	private File profilePic;
	private String profilePicContentType;
	private String profilePicFileName;
	
	
	
	public File getProfilePic() {
		return profilePic;
	}



	public void setProfilePic(File profilePic) {
		this.profilePic = profilePic;
	}



	public String getProfilePicContentType() {
		return profilePicContentType;
	}



	public void setProfilePicContentType(String profilePicContentType) {
		this.profilePicContentType = profilePicContentType;
	}



	public String getProfilePicFileName() {
		return profilePicFileName;
	}



	public void setProfilePicFileName(String profilePicFileName) {
		this.profilePicFileName = profilePicFileName;
	}
	


	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public String execute() {
				
		SignUpService sus = new SignUpService();
		try {
			File fileCreated = new File( "/opt/apache-tomcat-8.0.35/webapps/WebApplication/img/", user.getUserName()+".jpg" );
			System.out.println("*****");
			FileUtils.copyFile( user.getProfilePic(), fileCreated);
			
			System.out.println("*****");
			
			if( sus.signUp(user) ){
				return "success";
			}
			else{
				return "failure";
			}
		} catch (ClassNotFoundException | SQLException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println( e.getMessage() );
			System.out.println( user.getCategoryId() );
			return "failure";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println( e.getMessage() );
			return "failure";
		}
	}

}
