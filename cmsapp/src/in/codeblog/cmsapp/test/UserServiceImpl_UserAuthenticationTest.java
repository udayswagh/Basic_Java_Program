package in.codeblog.cmsapp.test;

import javax.naming.AuthenticationException;

import in.codeblog.cmsapp.domain.User;
import in.codeblog.cmsapp.service.UserService;
import in.codeblog.cmsapp.serviceimpl.UserServiceImple;

public class UserServiceImpl_UserAuthenticationTest {

	public static void main(String[] args) throws AuthenticationException {

		UserService userService=new UserServiceImple();
		User user=userService.authenticationUser("uday", "uday123");
		System.out.println(user.getEmail());
	}

}
