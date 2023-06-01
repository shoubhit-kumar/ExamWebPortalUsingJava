package com.exam.dao;
import com.exam.entities.User;
import java.sql.*;
public class UserDao {
    private Connection con;
    
    public UserDao(Connection con){
        this.con = con;
    }
    
    //method to insert user to data base
    public boolean saveUser(User user) {
        boolean f = false;
        try{
            //user -> database
            
            String query = "insert into user(name, email, pass, gender, dob, contact, city, address, about, profile) values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = this.con.prepareStatement(query);
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getGender());
            ps.setDate(5, user.getDob());
            ps.setLong(6, user.getContact());
            ps.setString(7, user.getCity());
            ps.setString(8, user.getAddress());
            ps.setString(9, user.getAbout());
            ps.setString(10, user.getProfile());
            
            ps.executeUpdate();
            f = true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
    
    // get user by useremail and userpassword
    
    public User getUserByEmailAndPassword(String email, String password){
        User user = null;
        
        try{
            String query = "select * from user where email =? and pass =?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, password);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                user = new User();
                
                //data fetched from db
                //data set to user object
                
                
                user.setId(rs.getInt("uid"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("pass"));
                user.setGender(rs.getString("gender"));
                user.setDob(rs.getDate("dob"));
                user.setContact(rs.getLong("contact"));
                user.setCity(rs.getString("city"));
                user.setAddress(rs.getString("address"));
                user.setAbout(rs.getString("about"));
                user.setDateTime(rs.getTimestamp("datetime"));
                user.setProfile(rs.getString("profile"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }
    
    //Update user by user object
    
    public boolean UpdateUser(User user){
        
        boolean f = false;
        
        try{
            String query = "update user set name = ?, email = ?, pass = ?, gender = ?, dob = ?, contact = ?, city = ?, address = ?, about = ?, profile = ? where uid = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getGender());
            ps.setDate(5, user.getDob());
            ps.setLong(6, user.getContact());
            ps.setString(7, user.getCity());
            ps.setString(8, user.getAddress());
            ps.setString(9, user.getAbout());
            ps.setString(10, user.getProfile());
            
            ps.setInt(11, user.getId());
            
            ps.executeUpdate();
            f = true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
}
