package com.changeInfo;

import java.sql.SQLException;

import com.common.User;
import com.common.UserDao;

public class ChangeInfoService {

	
	public boolean changeInfo( User user ) throws SQLException, ClassNotFoundException{
		UserDao userDao = new UserDao();
		try{
			userDao.updateUserInfo(user);
			return true;
		}
		catch( Exception e ){
			e.printStackTrace();
			System.out.println( e.getMessage() );
			return false;
		}		
	}
	
}
