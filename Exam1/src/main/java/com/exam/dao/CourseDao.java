package com.exam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.exam.entities.Course;

public class CourseDao {

	private Connection con;

	public CourseDao(Connection con) {
		super();
		this.con = con;
	}

	public ArrayList<Course> getAllCourses() {
		ArrayList<Course> list = new ArrayList<>();

		try {

			String query = "select * from course";
			PreparedStatement ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Course course = new Course(rs.getInt("cid"), rs.getString("name"));

				list.add(course);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}

	public String getCourseNameByCid(int cid) {

		String name = "";
		try {

			String query = "select * from course where cid = ?";
			PreparedStatement ps = this.con.prepareStatement(query);
			ps.setInt(1, cid);
			ResultSet rs = ps.executeQuery();
			rs.beforeFirst();
			rs.next();
			name = rs.getString("name");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return name;
	}
}
