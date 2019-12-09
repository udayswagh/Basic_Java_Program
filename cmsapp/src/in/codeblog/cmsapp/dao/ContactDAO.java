package in.codeblog.cmsapp.dao;

import java.util.List;

import in.codeblog.cmsapp.domain.Contact;

public interface ContactDAO {

	public void save(Contact contact);

	public void delete(int id);

	public void delete(Contact contact);

	public void update(Contact contact);

	public List<Contact> list();
}
