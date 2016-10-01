/* TNS */

package com.login;


import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.common.User;
import com.opensymphony.xwork2.ActionContext;


public class LoginAction {

	private User user;
	private Map<String, Object> sessionMap;
	
	
	
	
	
	public Map<String, Object> getSessionMap() {
		return sessionMap;
	}

	public void setSessionMap(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
	public String execute(){
		LoginService loginService = new LoginService();
		
		try {
			if( loginService.authenticateUser(user) ){
				sessionMap = ActionContext.getContext().getSession();
				sessionMap.put("user", user);
				return "success";
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "failure";		
	}

	
	
	
	public String logout(){
		sessionMap = null;
		return "success";
	}
	

	
	
}



