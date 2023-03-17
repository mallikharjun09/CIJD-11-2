package com.ims.dao.StudentDAO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ims.comfig.db.DBConfig;

public class StudentDAO {
	static Connection con = DBConfig.connect();
	
	public static void main(String args[]) {
		while(true) {
		try {
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println("Enter student Id ");
			int id = Integer.parseInt(br.readLine());
			System.out.println("Enter student Name ");
			String name = br.readLine();
			System.out.println("Enter email id ");
			String email = br.readLine();
			System.out.println("Enter student Phone number");
			long phone = Long.parseLong(br.readLine());
			System.out.println("Date of Birth dd-mm-yyyy");
			String dob = br.readLine();
			System.out.println("Student's Gender ");
			String gender= br.readLine();
			System.out.println("Student Address ");
			String address=br.readLine();
			
			
			Date birth = Date.valueOf(dob);
			
			String query = "insert into student values(?,?,?,?,?,?,?)";
			
			PreparedStatement ps;
			ps = con.prepareStatement(query);
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setLong(4, phone);
			ps.setDate(5,birth);
			ps.setString(6, gender);
			ps.setString(7, address);
			
			
			ps.execute();
			
			System.out.println("Student has been inserted Successfully....");
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}}
	}
}
