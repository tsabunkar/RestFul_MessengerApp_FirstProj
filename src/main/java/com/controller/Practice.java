package com.controller;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		Connection	con = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/mysqldb", "root", "root");
		System.out.println("connection established wid DB");
		String sql = "insert into messenger_table value (?,?,?,?)";
	PreparedStatement ps = con.prepareStatement(sql);
	
	DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	Date myDate = formatter.parse("2016-12-18");
	java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());

	
	ps.setInt(1, 3);
	ps.setString(2, "Hello World");
	ps.setDate(3, sqlDate);
	ps.setString(4, "usha");
	ps.executeUpdate();
	System.out.println("insert success");
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	/*"com.mysql.jdbc.Driver");
	bds.setUrl("jdbc:mysql://localhost:3306/mysqldb"*/
	}

}
