package in.codeblog.cmsapp.test;

import in.codeblog.cmsapp.dao.UserDAO;
import in.codeblog.cmsapp.daoimpl.UserDAOImpl;
import in.codeblog.cmsapp.domain.User;

public class UserDAOImpl_DeleteOperationTest {

	public static void main(String[] args) {
		User user = new User();
		UserDAO userDAO = new UserDAOImpl();

		
		userDAO.delete(1);

		System.out.println("delete Successfully");

	}

}
