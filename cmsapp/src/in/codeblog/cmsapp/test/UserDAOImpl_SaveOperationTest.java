package in.codeblog.cmsapp.test;

import in.codeblog.cmsapp.dao.UserDAO;
import in.codeblog.cmsapp.daoimpl.UserDAOImpl;
import in.codeblog.cmsapp.domain.User;

public class UserDAOImpl_SaveOperationTest {
	public static void main(String[] args) {
		User user=new User();
		UserDAO userDAO=new UserDAOImpl();
		
		user.setName("abhi");
		user.setContactNumber(4578);
		user.setEmail("abhi@gmail.com");
		user.setRole(2);
		user.setStatus("active");
		user.setLoginName("abhi");
		user.setPassword("abhi123");
		userDAO.save(user);
		System.out.println("inserted second values");
		

	}

}
