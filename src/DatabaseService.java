


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;

import org.apache.commons.io.IOUtils;

import com.common.User;


public class DatabaseService {

	private String username;
	private String password;
	private Connection conn;
	
	
	public DatabaseService() throws ClassNotFoundException, SQLException{
		this.username = "root";
		this.password = "";
		
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp_database", username, password);
	}
	
	
	public boolean isUser( String username ) throws SQLException{
		String query = "select username from user where username='" + username + "'";
		
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		
		if( rs.getString("username").equals(username) ){
			return true;
		}
		return false;
	}
	
	
	public String getPassword( String username ) throws SQLException{
		String query = "select user_key from user where username='" + username + "'";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		return rs.getString("user_key");
	}
	
	
	public boolean authenticateUser( String user, String password ) throws SQLException{
		String query = "select user_key from login where username='" + user + "'";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		if( rs == null ){
			return false;
		}
		else{
			rs.next();
			if( rs.getString("user_key").equals(password) ){
				return true;
			}
			else{
				return false;
			}
		}
	}
	
	
	public boolean addUser( User user ) throws SQLException{
		String query = "insert into user values( null, '" + user.getFirstName() + "', '" + user.getLastName() + "', "
				+ user.getCategoryId() + ", '" + user.getUserName() + "', '" + user.getPassword() 
				+ "', load_file('/img/" + user.getUserName() + ".jpg" + "') )";
		System.out.println( "*****" );
		Statement st = conn.createStatement();
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


	public void getUserInfo(User user) throws SQLException, IOException {

		String query = "select * from user where username='" + user.getUserName() + "'";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		user.setCategoryId( Integer.toString( rs.getInt("category_id") ) ); 
		user.setFirstName( rs.getString("first_name") );
		user.setLastName( rs.getString("last_name") );
		
		//converting file
				try{
					Blob pic =  rs.getBlob("pic");
					File file = new File(user.getUserName() + ".jpg");
					InputStream in = pic.getBinaryStream() ;
					OutputStream out = new FileOutputStream( file );
					IOUtils.copy(in, out);
					user.setProfilePic(file);
				}
				catch( Exception e ){
					System.out.println( e.getMessage() );
					e.printStackTrace();
				}
	}
	
	
}
