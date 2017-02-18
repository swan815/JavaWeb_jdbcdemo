package com.lsy.javaweb.mvc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class StudentDao {
	
	public void DeleteStudentById(Integer Id){
		List<Student> students = new ArrayList<>();
		Connection connection=null;
		PreparedStatement prepareStatement = null;
		ResultSet resultSet=null;
		
		
	    try {
			String driverClass = "com.mysql.jdbc.Driver";
			 String url = "jdbc:mysql://localhost:3306/school?"
		                + "user=root&password=30940660&useUnicode=true&characterEncoding=UTF8";
			Class.forName(driverClass);
			connection = (Connection) DriverManager.getConnection(url);
			
			String sql="DELETE from student where id = ?";
			
			prepareStatement = (PreparedStatement) connection.prepareStatement(sql);
			
			prepareStatement.setInt(1, Id);
			
			prepareStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			
			try {
				if (prepareStatement!=null) {
					prepareStatement.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (connection!=null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public List<Student> getAll(){
		
		List<Student> students = new ArrayList<>();
		Connection connection=null;
		PreparedStatement prepareStatement = null;
		ResultSet resultSet=null;
		
		int id;
		String major;
		String enterDate;
		int studyYear;
		String studyType;
		
	    try {
			String driverClass = "com.mysql.jdbc.Driver";
			 String url = "jdbc:mysql://localhost:3306/school?"
		                + "user=root&password=30940660&useUnicode=true&characterEncoding=UTF8";
			Class.forName(driverClass);
			connection = (Connection) DriverManager.getConnection(url);
			
			String sql="select * from student";
			
			prepareStatement = (PreparedStatement) connection.prepareStatement(sql);
			
			resultSet=prepareStatement.executeQuery();
			
			while(resultSet.next()){
				id=resultSet.getInt(1);
				major=resultSet.getString(2);
				enterDate=resultSet.getString(3);
				studyYear=resultSet.getInt(4);
				studyType=resultSet.getString(5);
				
				Student student=new Student(id,major,enterDate,studyYear,studyType);
				
				students.add(student);
				//System.out.println(id+major+enterDate+studyYear+studyType);
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if (resultSet!=null) {
					resultSet.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (prepareStatement!=null) {
					prepareStatement.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (connection!=null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return students;
	}

}
