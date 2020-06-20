package com.yjy.bean;

public class Student {
private int id;
private String sname;
private String ssex;
private int sage;
private String stel;
private String sacademy;
private String sclass;
private String saddress;
private String spassword;

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(int id, String sname, String ssex, int sage, String stel, String sacademy, String sclass, String saddress,
		String spassword) {
	super();
	this.id = id;
	this.sname = sname;
	this.ssex = ssex;
	this.sage = sage;
	this.stel = stel;
	this.sacademy = sacademy;
	this.sclass = sclass;
	this.saddress = saddress;
	this.spassword = spassword;
}


public Student(int id, String sname, String ssex, int sage, String stel, String sacademy, String sclass, String saddress) {
	super();
	this.id = id;
	this.sname = sname;
	this.ssex = ssex;
	this.sage = sage;
	this.stel = stel;
	this.sacademy = sacademy;
	this.sclass = sclass;
	this.saddress = saddress;
}

public Student(int id, String sname, String spassword) {
	super();
	this.id = id;
	this.sname = sname;
	this.spassword = spassword;
}

public Student(int id, String spassword) {
	super();
	this.id = id;
	this.spassword = spassword;
}

public Student(String sname, String spassword) {
	super();
	this.sname = sname;
	this.spassword = spassword;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getsname() {
	return sname;
}

public void setsname(String sname) {
	this.sname = sname;
}

public String getssex() {
	return ssex;
}

public void setssex(String ssex) {
	this.ssex = ssex;
}

public int getsage() {
	return sage;
}

public void setsage(int sage) {
	this.sage = sage;
}

public String getstel() {
	return stel;
}

public void setstel(String stel) {
	this.stel = stel;
}

public String getsacademy() {
	return sacademy;
}

public void setsacademy(String sacademy) {
	this.sacademy = sacademy;
}

public String getsclass() {
	return sclass;
}

public void setsclass(String sclass) {
	this.sclass = sclass;
}

public String getsaddress() {
	return saddress;
}

public void setsaddress(String saddress) {
	this.saddress = saddress;
}

public String getspassword() {
	return spassword;
}

public void setspassword(String spassword) {
	this.spassword = spassword;
}

@Override
public String toString() {
	return "Student [id=" + id + ", sname=" + sname + ", ssex=" + ssex + ", sage=" + sage + ", stel=" + stel
			+ ", sacademy=" + sacademy + ", sclass=" + sclass + ", saddress=" + saddress + "]";
}




}
