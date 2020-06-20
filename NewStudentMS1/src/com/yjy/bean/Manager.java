package com.yjy.bean;

public class Manager {
private int id;
private String password;


public Manager() {
	super();
	// TODO Auto-generated constructor stub
}
public Manager(int id, String password) {
	super();
	this.id = id;
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Manager [id=" + id + ", password=" + password + "]";
}


}
