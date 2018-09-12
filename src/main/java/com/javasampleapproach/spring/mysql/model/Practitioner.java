package com.javasampleapproach.spring.mysql.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "practitioner")
public class Practitioner implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="cid")
	private String cid;
	
	@Column(name="speaciality")
	private String speaciality;
	
	@Column(name="score")
	private int score;
	
	@Transient
//	@Column(name="sex")
	private String sex;
	
	@Transient
//	@Column(name="age")
	private int age;
	
	@Transient
//	@Column(name="location")
	private String location;
	
	@Transient
//	@Column(name="complaintno")
	private int complaintno;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getSpeaciality() {
		return speaciality;
	}

	public void setSpeaciality(String speaciality) {
		this.speaciality = speaciality;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getComplaintno() {
		return complaintno;
	}

	public void setComplaintno(int complaintno) {
		this.complaintno = complaintno;
	}

	@Override
	public String toString() {
		return "Practitioner [id=" + id + ", cid=" + cid + ", speaciality=" + speaciality + ", score=" + score
				+ ", sex=" + sex + ", age=" + age + ", location=" + location + ", complaintno=" + complaintno + "]";
	}


	
	
}
