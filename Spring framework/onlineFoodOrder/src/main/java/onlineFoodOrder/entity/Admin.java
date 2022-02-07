package onlineFoodOrder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {



@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "userid")
private Long userId;

@Column(name = "username")
private String userName;

@Column(name = "userpassword")
private String userPassword;

public Admin() {
	super();
	// TODO Auto-generated constructor stub
}

public Admin(Long userId, String userName, String userPassword) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.userPassword = userPassword;
}

public Long getUserId() {
	return userId;
}

public void setUserId(Long userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getUserPassword() {
	return userPassword;
}

public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}


 
}

