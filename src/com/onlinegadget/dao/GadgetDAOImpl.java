package com.onlinegadget.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onlinegadget.model.Gadget;
import com.onlinegadget.model.User;
@Repository("gadgetDao")
public class GadgetDAOImpl implements GadgetDAO{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public User doRegister(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		return user;
	}
	@Override
	public User doLogin(User user) {
		Session session = sessionFactory.getCurrentSession();
		User user2 = (User)session.get(User.class, user.getUsername());
		if(user2 == null || !(user.getPassword().equals(user2.getPassword()))) {
			return null;
		}
		return user2;
	}
	@Override
	public User doReset(User user) {
		Session session = sessionFactory.getCurrentSession();
		User user2 = (User)session.get(User.class, user.getUsername());
		user2.setPassword(user.getPassword());
		session.update(user2);
		return user2;
	}
	@Override
	public Gadget doAdd(Gadget gadget) {
		Session session = sessionFactory.getCurrentSession();
		session.save(gadget);
		return gadget;
	}
	
	@Override
	public Gadget doRemove(Gadget gadget) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(gadget);
		return gadget;
	}
	@Override
	public List getList() {
		Session session = sessionFactory.getCurrentSession();
		List<Gadget> list = (List<Gadget>)session.createCriteria
				(Gadget.class).list();
		return list;
	}
}
