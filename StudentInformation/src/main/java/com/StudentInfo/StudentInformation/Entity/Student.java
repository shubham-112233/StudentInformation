package com.StudentInfo.StudentInformation.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	private int idstud;
	private String rollNo;
	private String fname;
	private String lname;
	private String course;
	private String marks;
	private String college;
	private String city;

	@Id
	public int getIdstud() {
		return idstud;
	}

	public void setIdstud(int idstud) {
		this.idstud = idstud;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [idstud=" + idstud + ", rollNo=" + rollNo + ", fname=" + fname + ", lname=" + lname
				+ ", course=" + course + ", marks=" + marks + ", college=" + college + ", city=" + city + "]";
	}

}
