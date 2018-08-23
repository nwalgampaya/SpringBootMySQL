package com.javasampleapproach.spring.mysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Person {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "Name")
	private String fName;
	
	@Column(name = "year")
	private String yearOfBirth;
	
	@Column(name = "sex")
	private String sex;
	
	@Column(name = "language")
	private String language;
	
	@Column(name = "relation")
	private String relationStatus;
	
	@Column(name = "education")
	private String educationLevel;
	
	@Column(name = "colonouscopystatus")
	private boolean colonoscopyStatus;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getRelationStatus() {
		return relationStatus;
	}

	public void setRelationStatus(String relationStatus) {
		this.relationStatus = relationStatus;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public boolean isColonoscopyStatus() {
		return colonoscopyStatus;
	}

	public void setColonoscopyStatus(boolean colonoscopyStatus) {
		this.colonoscopyStatus = colonoscopyStatus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", fName=" + fName + ", yearOfBirth=" + yearOfBirth + ", sex=" + sex + ", language="
				+ language + ", relationStatus=" + relationStatus + ", educationLevel=" + educationLevel
				+ ", colonoscopyStatus=" + colonoscopyStatus + "]";
	}
	
	
	
	
	
}
