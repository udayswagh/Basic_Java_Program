package in.codeblog.cmsapp.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.codeblog.cmsapp.dao.UserDAO;
import in.codeblog.cmsapp.domain.User;
import in.codeblog.cmsapp.util.DBUtil;

/**
 * UserDAOImple represent the implementation of all abstract method
 * 
 * @author admin
 *
 */
public class UserDAOImpl extends DBUtil implements UserDAO {

	@Override
	public void save(User user) {

		System.out.println("in save method");
		String sql = "insert into users (name,contactNumber,email,role,status,loginName,password) values(?,?,?,?,?,?,?);";
		PreparedStatement psmt = preparedStatement(sql);

		try {
			psmt.setString(1, user.getName());
			psmt.setInt(2, user.getContactNumber());
			psmt.setString(3, user.getEmail());
			psmt.setInt(4, user.getRole());
			psmt.setString(5, user.getStatus());
			psmt.setString(6, user.getLoginName());
			psmt.setString(7, user.getPassword());
			psmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		String sql = "delete from users where id=?;";
		PreparedStatement psmt = preparedStatement(sql);

		try {
			psmt.setInt(1, id);
			psmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(User user) {

		delete(user.getId());
	}

	@Override
	public void update(User user) {

		String sql="update users set name='uday' where id=?;";
		PreparedStatement psmt = preparedStatement(sql);
		try {
			psmt.setInt(1, user.getId());
			psmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<User> list() {

		List<User> users = new ArrayList<>();
		User user = null;

		String sql = "select * from users;";

		PreparedStatement psmt = preparedStatement(sql);

		try {
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setContactNumber(rs.getInt("contactNumber"));
				user.setRole(rs.getInt("Role"));
				user.setStatus(rs.getString("status"));
				user.setLoginName(rs.getString("loginName"));
				user.setPassword(rs.getString("password"));

				users.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}

}
