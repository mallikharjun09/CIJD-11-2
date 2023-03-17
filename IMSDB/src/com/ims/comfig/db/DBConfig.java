package com.ims.comfig.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class DBConfig {
	
	private static Connection con;
	
	public static Connection connect(){
		String url="jdbc:mysql://@localhost:3306/cijd_11";
		String username = "root";
		String password = "root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Found....");
			
			con = DriverManager.getConnection(url,username,password);
			System.out.println("Database connected successfully....");
		
			/*
			 * String query="create table student(" + "stid int, stname varchar(60)," +
			 * "email varchar(100),phone bigint,dob date," +
			 * "gender varchar(6),address varchar(300))";
			 * 
			 * Statement st = con.createStatement();
			 * 
			 * st.execute(query);
			 * 
			 * System.out.println("Table has been created successfully....");
			 */
		
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("Sorry Change the Jar file..");
		} catch(SQLException e) {
			System.out.println("Unable to connect with Database...");
		}
		return con;
	}
}	
