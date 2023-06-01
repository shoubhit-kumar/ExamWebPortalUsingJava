package com.exam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.exam.entities.Questions;

public class QuestionDao {

	private Connection con;

	public QuestionDao(Connection con) {
		super();
		this.con = con;
	}
	
	public ArrayList<Questions> getQuestionsByCid(int cid) {
		ArrayList<Questions> list = new ArrayList<>();
		try {
			
			String query = "select * from questions where cid = ?";
			PreparedStatement ps = this.con.prepareStatement(query);
			ps.setInt(1, cid);
			ResultSet rs = ps.executeQuery();
			rs.beforeFirst();
			while(rs.next()) {
				Questions question = new Questions(rs.getInt("qid"), rs.getString("question"), rs.getString("option1"), rs.getString("option2"), rs.getString("option3"), rs.getString("option4"), rs.getInt("answer"), rs.getInt("cid"), rs.getDate("datetime"));
				list.add(question);
			}
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
