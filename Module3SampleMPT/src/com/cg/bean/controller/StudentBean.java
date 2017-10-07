package com.cg.bean.controller;

public class StudentBean {

private int Studentid;
private String Studentname;
private String Age;
private String state;
private String gender;
private String Centum;
private String attempts;
private String TotalScores;
@Override
public String toString() {
	return "StudentBean [Studentid=" + Studentid + ", Studentname="
+ Studentname + ", Age=" + Age + ", state=" + state
+ ", gender=" + gender + ", Centum=" + Centum + ", attempts="
+ attempts + ", TotalScores=" + TotalScores + "]";
	}
public StudentBean(int studentid, String studentname, String age, String state,
		String gender, String centum, String attempts, String totalScores) {
	super();
	Studentid = studentid;
	Studentname = studentname;
	Age = age;
	this.state = state;
	this.gender = gender;
	Centum = centum;
	this.attempts = attempts;
	TotalScores = totalScores;
}
public int getStudentid() {
	return Studentid;
}
public void setStudentid(int studentid) {
	Studentid = studentid;
}
public String getStudentname() {
	return Studentname;
}
public void setStudentname(String studentname) {
	Studentname = studentname;
}
public String getAge() {
	return Age;
}
public void setAge(String age) {
	Age = age;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCentum() {
	return Centum;
}
public void setCentum(String centum) {
	Centum = centum;
}
public String getAttempts() {
	return attempts;
}
public void setAttempts(String attempts) {
	this.attempts = attempts;
}
public String getTotalScores() {
	return TotalScores;
}
public void setTotalScores(String totalScores) {
	TotalScores = totalScores;
}
public StudentBean() {
	super();
	// TODO Auto-generated constructor stub
}



	
	
}
