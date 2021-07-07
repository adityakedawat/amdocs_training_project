package Drivers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Models.Users;
import interfaces.UsersDao;
import util.DButil;
public class UserImpl implements UsersDao {
	Connection conn = DButil.getConnection();
	private static int userId=106;
	public boolean saveUser(Users user) {

		String sql = "insert into user1 values(?,?,?,?,?,?,?,?)";
		try {
			String sqlIdentifier = "select userid.NEXTVAL from dual";
			PreparedStatement pst = conn.prepareStatement(sqlIdentifier);
			synchronized( this ) {
			   ResultSet rs = pst.executeQuery();
			   if(rs.next())
			     userId = rs.getInt(1);}
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.setString(2, user.getName());
			ps.setLong(3, user.getPhone());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getAddress());
			ps.setString(6, user.getRegistrationDate());
			
			ps.setString(7, user.getPassword());
			
			
			ps.setString(8, user.getImageUrl());

			ps.executeUpdate();
			
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
