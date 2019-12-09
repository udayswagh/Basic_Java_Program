package in.codeblog.cmsapp.domain;
/**
 * This is POJO class represent contact related data;
 * @author admin
 *
 */

public class Contact extends Person {

	/**
	 * user_id of contact
	 */
	private int user_id;
	private String cGroup;
	private String address;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getcGroup() {
		return cGroup;
	}

	public void setcGroup(String cGroup) {
		this.cGroup = cGroup;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
