package com.exam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.exam.entities.Query;

public class ExamDao {

	private Connection con;

	public ExamDao(Connection con) {
		super();
		this.con = con;
	}

	public boolean saveQuery(Query q) {
		boolean f = false;
		try {
			String query = "insert into query(subject, description, uid) values (?,?,?)";
			PreparedStatement ps = this.con.prepareStatement(query);
			ps.setString(1, q.getSubject());
			ps.setString(2, q.getDescription());
			ps.setInt(3, q.getUid());

			ps.executeUpdate();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
