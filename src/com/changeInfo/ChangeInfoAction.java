package com.changeInfo;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.commons.io.FileUtils;

import com.common.User;
import com.common.UserDao;
import com.opensymphony.xwork2.ActionContext;

public class ChangeInfoAction {

	private User user;

	
	public ChangeInfoAction() throws ClassNotFoundException, SQLException{
		user = (User)ActionContext.getContext().getSession().get("user");
		
	}
	
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	public String execute(){
		try{
			File fileCreated = new File( "/opt/apache-tomcat-8.0.35/webapps/WebApplication/img/", user.getUserName() + ".jpg" );
			System.out.println("*****");
			FileUtils.copyFile( user.getProfilePic(), fileCreated);
			
			ChangeInfoService chInService = new ChangeInfoService();
			chInService.changeInfo(user);
			return "success";
		}
		catch( Exception e ){
			return "failure";
		}
	}
	
	
	
	
	
}
