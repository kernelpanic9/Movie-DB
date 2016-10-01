package com.common;

import java.io.File;

public class User {
	
	private String firstName, lastName, userName, password;
	private int categoryId;
	
	private File profilePic;
	private String profilePicContentType, profilePicFileName;
	
	private String src;
	
	
	
	
	
	

	public String getSrc() {
		return src;
	}



	public void setSrc(String src) {
		this.src = src;
	}



	public File getProfilePic() {
		return profilePic;
	}

	public void setProfilePic( File profilePic) {
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

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = Integer.valueOf( categoryId );
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		src = "img/" + userName + ".jpg";
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	

}
