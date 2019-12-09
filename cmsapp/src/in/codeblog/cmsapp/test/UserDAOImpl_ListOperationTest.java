package in.codeblog.cmsapp.test;

import java.util.List;

import in.codeblog.cmsapp.dao.UserDAO;
import in.codeblog.cmsapp.daoimpl.UserDAOImpl;
import in.codeblog.cmsapp.domain.User;

public class UserDAOImpl_ListOperationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User();
		UserDAO userDAO=new UserDAOImpl();
		
				
		List<User> users=userDAO.list(); 
		
		for (User user2 : users) {
			System.out.println(user2.getPassword());
		}

	}

}
