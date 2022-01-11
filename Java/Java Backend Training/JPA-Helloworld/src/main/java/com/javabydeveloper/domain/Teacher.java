package com.javabydeveloper.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Teacher")
@Entity(name = "Tea")
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	@Column(name = "ID")
	private Long teacherId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "SUBJECT")
	private String subject;

	@Column(name = "DEGREE")
	private String degree;

	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long TeacherId) {
		this.teacherId = teacherId;
	}

	public String getName() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getsubject() {
		return subject;
	}

	public void setsubject(String subject) {
		this.subject = subject;
	}

	public String getdegree() {
		return degree;
	}

	public void setdegree(String degree) {
		this.degree = degree;
	}


	@Override
	public String toString() {
		return "teacher [teacherId=" + teacherId + ", name=" + name + ", subject=" + subject
				+ ", degree=" + degree + "]";
	}
}
