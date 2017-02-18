package com.lsy.javaweb.mvc;

public class Student {
	private int id;
	
	private String major;
	
	private String enterDate;
	
	private int studyYear;
	
	private String studyType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getEnterDate() {
		return enterDate;
	}

	public void setEnterDate(String enterDate) {
		this.enterDate = enterDate;
	}

	public int getStudyYear() {
		return studyYear;
	}

	public void setStudyYear(int studyYear) {
		this.studyYear = studyYear;
	}

	public String getStudyType() {
		return studyType;
	}

	public void setStudyType(String studyType) {
		this.studyType = studyType;
	}

	public Student(int id, String major, String enterDate, int studyYear, String studyType) {
		super();
		this.id = id;
		this.major = major;
		this.enterDate = enterDate;
		this.studyYear = studyYear;
		this.studyType = studyType;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
