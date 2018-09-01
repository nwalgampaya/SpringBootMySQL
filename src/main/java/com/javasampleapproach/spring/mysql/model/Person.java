package com.javasampleapproach.spring.mysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "Name")
	private String name;
	
	@Column(name = "year")
	private String year;
	
	@Column(name = "sex")
	private String sex;
	
	@Column(name = "country")
	private String country	;
	
	@Column(name = "language")
	private String language	;
	
	@Column(name = "relation")
	private String relation	;

	@Column(name = "education")
	private String education;
	


	
//	@Column(name = "language")
//	private String language;
//	
//	@Column(name = "relation")
//	private String relationStatus;
//	
//	@Column(name = "education")
//	private String educationLevel;
	
/*	@Column(name = "colonouscopystatus")
	private boolean colonoscopyStatus;
*/
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", year=" + year + ", sex=" + sex + "]";
	}


	
	
	
	
}
