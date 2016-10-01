package com.signUp;


import java.sql.SQLException;
import com.common.User;
import com.common.UserDao;


public class SignUpService {
	
	
	public boolean signUp( User user ) throws ClassNotFoundException, SQLException{
		UserDao userDao = new UserDao();
		if( userDao.saveUser(user) ){
			return true;
		}
		else{
			return false;
		}
	}
	
	
}
