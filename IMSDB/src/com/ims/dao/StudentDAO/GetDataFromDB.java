package com.ims.dao.StudentDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.ims.comfig.db.DBConfig;

public class GetDataFromDB {
	private static Connection con = DBConfig.connect();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter student ID... ");
		int id = scan.nextInt();
		System.out.println("Please enter student Phone number .. ");
		long phone = scan.nextLong();
		String query = "select * from student where stid=? and phone=?";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ps.setLong(2, phone);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.print(rs.getInt("stid")+"   ");
				System.out.print(rs.getString("stname")+"   ");
				System.out.print(rs.getString("email")+"   ");
				System.out.print(rs.getLong("phone")+"   ");
				System.out.print(rs.getDate("dob")+"   ");
				System.out.print(rs.getString("gender")+"   ");
				System.out.println(rs.getString("address")+"   ");
			}
			else {
				System.out.println("Sorry!... Student has not found with "+id+" id");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
