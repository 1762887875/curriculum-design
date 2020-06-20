package com.yjy.bean;

public class Grade {

	protected int sno;
	protected int cno;
	protected float grade;
	protected float point;
	
	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Grade(int sno, int cno, float grade, float point) {
		super();
		this.sno = sno;
		this.cno = cno;
		this.grade = grade;
		this.point = point;
	}

	public Grade(int sno, int cno) {
		super();
		this.sno = sno;
		this.cno = cno;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

	public float getPoint() {
		return point;
	}

	public void setPoint(float point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Grade [sno=" + sno + ", cno=" + cno + ", grade=" + grade + ", point=" + point + "]";
	}
	
	
}
