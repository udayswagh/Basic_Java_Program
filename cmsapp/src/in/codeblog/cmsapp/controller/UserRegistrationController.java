package in.codeblog.cmsapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.codeblog.cmsapp.domain.User;
import in.codeblog.cmsapp.service.UserService;
import in.codeblog.cmsapp.serviceimpl.UserServiceImple;

/**
 * Servlet implementation class UserRegistrationController
 */
@WebServlet("/UserRegistrationController")
public class UserRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserService userService ;

	public UserRegistrationController() {
		userService = new UserServiceImple();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();
		User user = new User();
		user.setName(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));
		user.setLoginName(request.getParameter("loginName"));
		user.setPassword(request.getParameter("password"));
		userService.registerUser(user);

		getServletContext().getRequestDispatcher("/signIn.jsp?msg= User Register Successfully").forward(request, response);
		out.println("User Register successfully");
	}

}
