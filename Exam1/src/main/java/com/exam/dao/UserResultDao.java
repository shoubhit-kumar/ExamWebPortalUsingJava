package com.exam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.exam.entities.User;
import com.exam.entities.UserResult;

public class UserResultDao {

	private Connection con;

	public UserResultDao(Connection con) {
		super();
		this.con = con;
	}

	public UserResult getUserResultByUidAndCid(int uid, int cid) {

		UserResult userResult = null;
		try {

			String query = "select * from user_result where uid = ? and cid = ?";
			PreparedStatement ps = this.con.prepareStatement(query);
			ps.setInt(1, uid);
			ps.setInt(2, cid);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				userResult = new UserResult();
				userResult.setRid(rs.getInt("rid"));
				userResult.setUid(rs.getInt("uid"));
				userResult.setCid(rs.getInt("cid"));
				userResult.setMark(rs.getFloat("mark"));
				userResult.setStatus(rs.getString("status"));
				userResult.setDatetime(rs.getDate("datetime"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return userResult;
	}

	public ArrayList<UserResult> getUserResultByUid(int uid) {

		ArrayList<UserResult> list = new ArrayList<>();
		try {

			String query = "select * from user_result where uid = ?";
			PreparedStatement ps = this.con.prepareStatement(query);
			ps.setInt(1, uid);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				UserResult userResult = new UserResult(rs.getInt("rid"), rs.getInt("uid"), rs.getInt("cid"), rs.getFloat("mark"), rs.getString("status"), rs.getDate("datetime"));
				list.add(userResult);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	public boolean saveUserResult(UserResult userResult) {
        boolean f = false;
        try {
        	if(checkOldResult(userResult)) {
        		String query = "update user_result set mark = ?, status = ? where uid = ? and cid = ?";
        		PreparedStatement ps = con.prepareStatement(query);
    			ps.setFloat(1, userResult.getMark());
    			ps.setString(2, userResult.getStatus());
    			ps.setInt(3, userResult.getUid());
    			ps.setInt(4, userResult.getCid());
    			ps.executeUpdate();
    			f = true;
        	}
        	else {
        		String query = "insert into user_result (uid, cid, mark, status) values (?,?,?,?)";
    			PreparedStatement ps = con.prepareStatement(query);
    			ps.setInt(1, userResult.getUid());
    			ps.setInt(2, userResult.getCid());
    			ps.setFloat(3, userResult.getMark());
    			ps.setString(4, userResult.getStatus());
    			
    			ps.executeUpdate();
    			f = true;
        	}
			
		}
        catch (Exception e) {
			e.printStackTrace();
		}
        return f;
	}
	
	public boolean checkOldResult(UserResult userResult) {
		boolean f = false;
		
		try {
			String query = "select * from user_result where uid = ? and cid = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, userResult.getUid());
			ps.setInt(2, userResult.getCid());
			ResultSet rs = ps.executeQuery();
			f = rs.next();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
}
