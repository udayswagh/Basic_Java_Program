package in.codeblog.cmsapp.domain;
/**
 * This is POJO class represent person related data;
 * @author admin
 *
 */
public class Person {
	private int id;
	private String name;
	private String email;
	private int contactNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

}
