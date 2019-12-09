package in.codeblog.cmsapp.serviceimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.naming.AuthenticationException;

import in.codeblog.cmsapp.dao.UserDAO;
import in.codeblog.cmsapp.daoimpl.UserDAOImpl;
import in.codeblog.cmsapp.domain.User;
import in.codeblog.cmsapp.exception.AuthenticationUserException;
import in.codeblog.cmsapp.service.UserService;
import in.codeblog.cmsapp.util.DBUtil;

public class UserServiceImple extends DBUtil implements UserService {
	private UserService userService;
	private UserDAO userDAO = null;

	public UserServiceImple() {

		userDAO = new UserDAOImpl();
	}

	@Override
	public void registerUser(User user) {

		System.out.println("in registeruser service methid");
		user.setRole(userService.USER_ROLE_USER);
		userDAO.save(user);

		System.out.println("Inside The registerUser()");
	}

	@Override
	public User authenticationUser(String loginName, String password) throws AuthenticationException {
		User user = null;
		String sql = "select * from users where loginName=?  and  password=? ;";
		PreparedStatement preparedStatement = preparedStatement(sql);
		System.out.println("query fire");

		try {

			System.out.println("inside try");
			preparedStatement.setString(1, loginName);
			preparedStatement.setString(2, password);

			ResultSet rs = preparedStatement.executeQuery();

			if (rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setLoginName(rs.getString("loginName"));
				user.setPassword(rs.getString("password"));
				user.setContactNumber(rs.getInt("contactNumber"));
				user.setRole(rs.getInt("role"));
				user.setStatus(rs.getString("status"));
			} else {
				throw new AuthenticationException("login name and password Incorrect");
			}
		} catch ( SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public void changeUserStatus(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserByProperty(String Property, String Value) {
		// TODO Auto-generated method stub
		return null;
	}

}
