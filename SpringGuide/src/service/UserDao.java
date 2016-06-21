package service;

import java.util.List;

import model.User;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDao {
	@Autowired
	private SessionFactory factory;
	
	public List<User> getList(){
		Session session = factory.openSession();
		Criteria criter = session.createCriteria(User.class);
		List<User> users = (List<User>)criter.list();
		return users;
	}
	
}
