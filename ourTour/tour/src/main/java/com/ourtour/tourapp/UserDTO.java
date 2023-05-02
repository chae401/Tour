package com.ourtour.board;
public class UserDTO {
	private String userID;
	private String pass;
	private String name;
	private String birth;
	private String gender;
	private String email; 
	private String usertel;     // 전화번호
	private String userimgaddr;    // 유저이미지 주소
	
	
	
	@Override
	public String toString() {
		return "UserDTO [userID=" + userID + ", pass=" + pass + ", name=" + name + ", birth=" + birth + ", gender="
				+ gender + ", email=" + email + ", usertel=" + usertel + ", userimgaddr=" + userimgaddr + "]";
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsertel() {
		return usertel;
	}
	public void setUsertel(String usertel) {
		this.usertel = usertel;
	}
	public String getUserimgaddr() {
		return userimgaddr;
	}
	public void setUserimgaddr(String userimgaddr) {
		this.userimgaddr = userimgaddr;
	}
	
	
}
