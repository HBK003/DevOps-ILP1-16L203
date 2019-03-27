package com.onlinegadget.dao;

import java.util.List;

import com.onlinegadget.model.Gadget;
import com.onlinegadget.model.User;

public interface GadgetDAO {
	public User doRegister(User user);
	public User doLogin(User user);
	public User doReset(User user);
	public Gadget doAdd(Gadget gadget);
	public Gadget doRemove(Gadget gadget);
	public List getList();
}
