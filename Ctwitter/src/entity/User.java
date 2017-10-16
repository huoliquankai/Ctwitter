package entity;

import java.io.Serializable;

public class User implements Serializable{
/**
	 * 
	 */
private static final long serialVersionUID = 6378312085484339341L;
private int userid;
private String username;
private String userpet;
private String usernumber;
private String usermail;
private String userpwd;
private String userregion;
private String userdate;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getUserpet() {
	return userpet;
}
public void setUserpet(String userpet) {
	this.userpet = userpet;
}
public String getUsernumber() {
	return usernumber;
}
public void setUsernumber(String usernumber) {
	this.usernumber = usernumber;
}
public String getUsermail() {
	return usermail;
}
public void setUsermail(String usermail) {
	this.usermail = usermail;
}
public String getUserpwd() {
	return userpwd;
}
public void setUserpwd(String userpwd) {
	this.userpwd = userpwd;
}
public String getUserregion() {
	return userregion;
}
public void setUserregion(String userregion) {
	this.userregion = userregion;
}
public String getUserdate() {
	return userdate;
}
public void setUserdate(String userdate) {
	this.userdate = userdate;
}
public User(int userid, String username, String userpet, String usernumber, String usermail, String userpwd,
		String userregion, String userdate) {
	super();
	this.userid = userid;
	this.username = username;
	this.userpet = userpet;
	this.usernumber = usernumber;
	this.usermail = usermail;
	this.userpwd = userpwd;
	this.userregion = userregion;
	this.userdate = userdate;
}
@Override
public String toString() {
	return "User [userid=" + userid + ", username=" + username + ", userpet=" + userpet + ", usernumber=" + usernumber
			+ ", usermail=" + usermail + ", userpwd=" + userpwd + ", userregion=" + userregion + ", userdate="
			+ userdate + "]";
}
public User() {
	super();
}

}
