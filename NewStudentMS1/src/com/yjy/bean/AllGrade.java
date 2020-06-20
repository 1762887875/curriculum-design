package com.yjy.bean;

public class AllGrade extends Grade{
	private String sname;
	private String cname;
	private String tname;
	public String getSname() {
		return sname;
	}
	public AllGrade(String sname, String cname, String tname) {
		super();
		this.sname = sname;
		this.cname = cname;
		this.tname = tname;
	}
	public AllGrade(int sno, String sname2, int cno, String cname2, String tname2, float grade, Float point) {
		// TODO Auto-generated constructor stub
		this.sno=sno;
		sname=sname2;
		this.cno=cno;
		cname=cname2;
		tname=tname2;
		this.grade=grade;
		this.point=point;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
		
	
}
