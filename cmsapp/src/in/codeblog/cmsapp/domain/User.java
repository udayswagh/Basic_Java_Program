package in.codeblog.cmsapp.domain;
/**
 * This is POJO class represent user related data;
 * @author admin
 *
 */

public class User extends Person {

	/**
	 * role of the user
	 */
	private int role;

	/**
	 * status of the user
	 */
	private String status;

	/**
	 * loginName of the user
	 */
	private String loginName;

	/**
	 * password of the user
	 */
	private String password;

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
