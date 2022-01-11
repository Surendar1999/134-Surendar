package com.marticus;

public class Company {

	private account acc;

	public account getacc() {
		return acc;
	}

	public void setacc(account acc) {
		this.acc = acc;
	}
	
 public void showacc()
 {
	
	 acc.showaccType();
	 
 }
	
}
