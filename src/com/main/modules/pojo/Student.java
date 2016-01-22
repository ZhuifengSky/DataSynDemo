package com.main.modules.pojo;

public class Student {

	private int id;	
	private String studentName;
	private String age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Ñ§Ô±:"+ studentName +"ÄêÁä:" +age;
	}
	
}
