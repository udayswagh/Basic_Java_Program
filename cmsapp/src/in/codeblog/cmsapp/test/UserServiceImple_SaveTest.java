package in.codeblog.cmsapp.test;

import in.codeblog.cmsapp.dao.UserDAO;
import in.codeblog.cmsapp.daoimpl.UserDAOImpl;
import in.codeblog.cmsapp.domain.User;
import in.codeblog.cmsapp.service.UserService;
import in.codeblog.cmsapp.serviceimpl.UserServiceImple;

public class UserServiceImple_SaveTest {

	public static void main(String[] args) {

		User user = new User();
		//UserDAO userDAO = new UserDAOImpl();
		UserService userService = new UserServiceImple();

		user.setEmail("uday@gmail.com");
		user.setLoginName("uday");
		user.setPassword("uday123");
		userService.registerUser(user);

		System.out.println("User Role Done");
	}

}
