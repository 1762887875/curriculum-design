package com.yjy.bean;

public class Teacher {
	private int id;
	private String tname;
	private int tage;
	private String tprotitle;
	private int cno;
	private String tpassword;
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int id, String tname, int tage, String tprotitle, int cno, String tpassword) {
		super();
		this.id = id;
		this.tname = tname;
		this.tage = tage;
		this.tprotitle = tprotitle;
		this.cno = cno;
		this.tpassword = tpassword;
	}

	public Teacher(int id, String tname, int tage, String tprotitle, int cno) {
		super();
		this.id = id;
		this.tname = tname;
		this.tage = tage;
		this.tprotitle = tprotitle;
		this.cno = cno;
	}

	public Teacher(int id, String tname, String tpassword) {
		super();
		this.id = id;
		this.tname = tname;
		this.tpassword = tpassword;
	}

	public Teacher(int id, String tpassword) {
		super();
		this.id = id;
		this.tpassword = tpassword;
	}

	public Teacher(String tname, String tpassword) {
		super();
		this.tname = tname;
		this.tpassword = tpassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String gettname() {
		return tname;
	}

	public void settname(String tname) {
		this.tname = tname;
	}

	public int gettage() {
		return tage;
	}

	public void settage(int tage) {
		this.tage = tage;
	}

	public String gettprotitle() {
		return tprotitle;
	}

	public void settprotitle(String tprotitle) {
		this.tprotitle = tprotitle;
	}

	public int getcno() {
		return cno;
	}

	public void setcno(int cno) {
		this.cno = cno;
	}

	public String gettpassword() {
		return tpassword;
	}

	public void settpassword(String tpassword) {
		this.tpassword = tpassword;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", tname=" + tname + ", tage=" + tage + ", tprotitle=" + tprotitle + ", cno=" + cno
				+ "]";
	}
	
	
}
