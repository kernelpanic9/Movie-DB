package com.login;


import java.io.IOException;
import java.sql.*;

import com.common.User;
import com.common.UserDao;


public class LoginService {

	
	public boolean authenticateUser( User user ) throws ClassNotFoundException, SQLException, IOException{
		
		UserDao userDao = new UserDao();
		
		if( userDao.isUser(user) ){
			if( userDao.getPassword( user ).equals(user.getPassword()) ){
				userDao.getUserInfo( user );
				return true;
			}			
		}

		return false;
		
	}
	
}



