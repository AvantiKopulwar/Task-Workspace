package com.av;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCquery {
   
	public static int addquery(StudentVariables sv) {
		int status = 0;
		try {
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			connection = DbUtilCon.getcon();
			String query = "INSERT INTO student (firstName, lastName, gender, email, mobNo, password) VALUES (?, ?, ?, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, sv.getFirstName());
			preparedStatement.setString(2, sv.getLastName());
			preparedStatement.setString(3, sv.getGender());
			preparedStatement.setString(4, sv.getEmail());
			preparedStatement.setString(5, sv.getMobNo());
			preparedStatement.setString(6, sv.getPassword());
			status = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	public static boolean selectquery(String email,String password) {
		boolean status = false;
		try {
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			connection = DbUtilCon.getcon();
			String query = "SELECT * FROM student WHERE email=? AND password=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,email);
			preparedStatement.setString(2,password);
		    ResultSet rs = preparedStatement.executeQuery();
		    if(rs.next()) {
		    	status=true;
		    }
		    connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
}
