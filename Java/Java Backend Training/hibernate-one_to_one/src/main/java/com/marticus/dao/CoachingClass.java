package com.marticus.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COACHING")
public class CoachingClass {


private String coachingclassName;
private String subject;

public CoachingClass() {
}

public CoachingClass(String coachingclassName, String subject ) {
this.coachingclassName = coachingclassName;
this.subject = subject;
}


@Id
@GeneratedValue
@Column(name = "COACHING_CLASS_NAMES",nullable = false, length=10)
public String getCoachingclassName() {
	return coachingclassName;
}
public void setCoachingclassName(String coachingclassName) {
	this.coachingclassName = coachingclassName;
}

@Column(name = "SUBJECT",nullable = false, length=10)
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}

}
