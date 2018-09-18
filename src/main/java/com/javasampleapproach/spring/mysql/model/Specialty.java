package com.javasampleapproach.spring.mysql.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "specialty")
public class Specialty implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="profid")
	private int profId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="score")
	private int score;
	
	public int getId() {	
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProfId() {
		return profId;
	}

	public void setProfId(int profId) {
		this.profId = profId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Specialty [id=" + id + ", profId=" + profId + ", name=" + name + ", description=" + description + "]";
	}
	
	
	
	
}
