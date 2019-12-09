package in.codeblog.cmsapp.dao;

import java.util.List;

import in.codeblog.cmsapp.domain.User;

/**
 * UserDAO interface represent CRUD operation of user
 * 
 * @author admin
 *
 */
public interface UserDAO {
	/**
	 * save method represent insert operation for user
	 * 
	 * @param admin
	 */
	public void save(User user);

	/**
	 * Delete method represent delete operation for user
	 * 
	 * @param admin
	 */

	public void delete(int id);

	/**
	 * Delete method represent delete operation for user
	 * 
	 * @param admin
	 */

	public void delete(User user);

	/**
	 * update method represent update operation for user
	 * 
	 * @param admin
	 */
	public void update(User user);

	/**
	 * list method represent listing the user
	 * 
	 * @param admin
	 */
	public List<User> list();

}
