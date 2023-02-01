package com.anupam.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.JdbcConnection;

public class TestJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
			String user = "hbstudent";
			String password = "hbstudent";
			Connection myConn = DriverManager.getConnection(jdbcUrl,user,password);
			System.out.println("yay");
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}

	}

}
