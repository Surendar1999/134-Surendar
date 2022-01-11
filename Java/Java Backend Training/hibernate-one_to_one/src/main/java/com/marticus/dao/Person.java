package com.marticus.dao;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
public class Person {
	private long personId;
	private String Name;
	private Aadhar aadhar;

	public Person() {
	}

	public Person(String Name, Address Aadhar) {
		this.Name = Name;
		this.aadhar = aadhar;
	}

	

	@Id
	@GeneratedValue
	@Column(name = "PERSON_ID")
	public long getpersonId() {
		return this.personId;
	}

	public void setpersonId(long personId) {
		this.personId = personId;
	}

	@Column(name = "NAME", nullable = false, length = 100)
	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	@OneToOne(cascade = CascadeType.ALL)
	public Aadhar getaadhar() {
		return this.aadhar;
	}

	public void setaadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}

}
