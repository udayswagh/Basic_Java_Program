package in.codeblog.cmsapp.test;

import in.codeblog.cmsapp.dao.UserDAO;
import in.codeblog.cmsapp.daoimpl.UserDAOImpl;
import in.codeblog.cmsapp.domain.User;

public class UserDAOImpl_UpdateOperationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user=new User();
		UserDAO userDAO=new UserDAOImpl();
		
		user.setId(1);
		userDAO.update(user);
		
		System.out.println("update Successfully");
		

	}

}
