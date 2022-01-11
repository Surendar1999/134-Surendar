package com.marticus.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "AADHAR")
public class Aadhar {
	private long aadharId;
	private String number;
	

	public Aadhar() {
	}

	public Aadhar( String number) {
		this.number = number;
		
	}

	@Id
	@GeneratedValue
	@Column(name = "AADHAR_ID")
	public long getaadharId() {
		return this.aadharId;
	}

	public void setaadharId(long aadharId) {
		this.aadharId =aadharId;
	}
	
	@Column(name = "NUMBER", nullable = false, length=250)
	public String getnumber() {
		return this.number;
	}

	public void setnumber(String number) {
		this.number = number;
	}

	

}
