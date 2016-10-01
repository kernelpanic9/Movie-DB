/**
 * 
 */
package com.common;


import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.io.IOUtils;


/**
 * @author root
 *
 */
public class UserDao extends Dao {

	
	public UserDao() throws SQLException, ClassNotFoundException{
		
	}
	
	
	
	public boolean saveUser( User user ) throws SQLException{
		String query = "insert into user values( null, '" + user.getFirstName() + "', '" + user.getLastName() + "', "
				+ user.getCategoryId() + ", '" + user.getUserName() + "', '" + user.getPassword() 
				+ "', load_file('/img/" + user.getUserName() + ".jpg" + "') )";
		System.out.println( "*****" );
		Statement st = con.createStatement();
		try{
			st.executeUpdate(query);
			return true;
		}
		catch( Exception e ){
			e.printStackTrace();
			System.out.println( e.getMessage() );
			return false;
		}
	}
	
	
	public boolean updateUserInfo( User user ) throws SQLException{
		String query = "update user set first_name='" + user.getFirstName() + "', last_name='" 
						+ user.getLastName() + "', user_key='" + user.getPassword() 
						+ "'"
						+ "where username='" + user.getUserName() + "'";
		//, pic=load_file('/img/" + user.getUserName() + ".jpg')
		System.out.println( "*****" );
		Statement st = con.createStatement();
		try{
			st.executeUpdate(query);
			return true;
		}
		catch( Exception e ){
			e.printStackTrace();
			System.out.println( e.getMessage() );
			return false;
		}
	}
	
	
	public boolean isUser( User user ) throws SQLException{
		String query = "select username from user where username='" + user.getUserName() + "'";
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		
		if( rs.getString("username").equals( user.getUserName() ) ){
			return true;
		}
		return false;
	}
	
	
	public String getPassword( User user ) throws SQLException{
		String query = "select user_key from user where username='" + user.getUserName() + "'";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		return rs.getString("user_key");
	}
	
	
	public void getUserInfo( User user ) throws SQLException{
		String query = "select * from user where username='" + user.getUserName() + "'";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		user.setCategoryId( Integer.toString( rs.getInt("category_id") ) ); 
		user.setFirstName( rs.getString("first_name") );
		user.setLastName( rs.getString("last_name") );
		user.setProfilePic( new File("/opt/apache-tomcat-8.0.35/webapps/WebApplication/img/" + user.getUserName() + ".JPG"));
		/*/converting file
		try{
			Blob pic =  rs.getBlob("pic");
			File file = new File( "/opt/apache-tomcat-8.0.35/webapps/WebApplication/img/" + user.getUserName() + ".jpg");
			InputStream in = pic.getBinaryStream() ;
			OutputStream out = new FileOutputStream( file );
			IOUtils.copy(in, out);
			user.setProfilePic(file);
		}
		catch( Exception e ){
			System.out.println( e.getMessage() );
			e.printStackTrace();
		}*/
	}
	
	
}
