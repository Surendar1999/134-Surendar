package com.marticus.controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbctest {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/training?useSSL=false";
        String user = "root";
        String pass ="Surend@r123";
        try {
        	System.out.println("conn to db"+url);
        	
        	Connection myConn = DriverManager.getConnection(url,user,pass);
        			
        	System.out.println("db connected");
        	
        	
        	}
        catch(Exception exc) {
        	exc.printStackTrace();
        }

	}

}
