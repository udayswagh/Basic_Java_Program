package in.codeblog.cmsapp.controller;

import java.io.IOException;

import javax.naming.AuthenticationException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.codeblog.cmsapp.domain.User;
import in.codeblog.cmsapp.service.UserService;
import in.codeblog.cmsapp.serviceimpl.UserServiceImple;

/**
 * Servlet implementation class UserAuthenticationController
 */
@WebServlet("/UserAuthenticationController")
public class UserAuthenticationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	public UserAuthenticationController() {
		userService = new UserServiceImple();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String loginName = request.getParameter("loginName");
		String password = request.getParameter("password");

		try {
			User logged = userService.authenticationUser(loginName, password);
			HttpSession session = request.getSession();
			session.setAttribute("name",logged.getLoginName());
			response.sendRedirect("./userDashBord.jsp?msg=hello Dear User");
		} catch (AuthenticationException e) {

			response.sendRedirect("./signIn.jsp?msg=" + e.getMessage());
		}

	}

}
