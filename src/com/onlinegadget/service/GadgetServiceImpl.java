package com.onlinegadget.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onlinegadget.dao.GadgetDAO;
import com.onlinegadget.model.Gadget;
import com.onlinegadget.model.User;
@Service("gadgetService")
public class GadgetServiceImpl implements GadgetService{
	@Autowired
	private GadgetDAO gadgetDAO;
	@Transactional
	@Override
	public User doRegister(User user) {
		return gadgetDAO.doRegister(user);
	}
	@Transactional
	@Override
	public User doLogin(User user) {
		return gadgetDAO.doLogin(user);
	}
	@Transactional
	@Override
	public User doReset(User user) {
		return gadgetDAO.doReset(user);
	}
	@Transactional
	@Override
	public Gadget doAdd(Gadget gadget) {
		return gadgetDAO.doAdd(gadget);
	}
	
	@Transactional
	@Override
	public Gadget doRemove(Gadget gadget) {
		return gadgetDAO.doRemove(gadget);
	}
	@Transactional
	@Override
	public List getList() {
		return gadgetDAO.getList();
	}
}
