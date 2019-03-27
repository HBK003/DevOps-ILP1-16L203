package com.onlinegadget.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.onlinegadget.model.Gadget;
import com.onlinegadget.model.User;
import com.onlinegadget.service.GadgetService;

@Controller
public class GadgetController {
	@Autowired
	private GadgetService gadgetService;
	
	@RequestMapping("/toRegister")
	public String redirectToRegister() {
		return "register";
	}
	@RequestMapping("/toLogin")
	public String redirectToLogin() {
		return "login";
	}
	@RequestMapping("/toReset")
	public String redirectToReset() {
		return "reset";
	}
	@RequestMapping("/toAdmin")
	public String redirectToAdmin() {
		return "admin";
	}
	@RequestMapping("/register") 
	public String doRegister(@ModelAttribute User user) {
		User user2 = gadgetService.doRegister(user);
		return "login";
	}
	@RequestMapping("/login") 
	public String doLogin(@ModelAttribute User user, Map<String, Object> map) {
		User user2 = gadgetService.doLogin(user);
		if (user2 == null) {
			return "login";
		}
		else {
			List gadgetList = gadgetService.getList();
			map.put("gadgets", gadgetList);
			return "display";
		}
	}
	@RequestMapping("/reset")
	public String doReset(@ModelAttribute User user) {
		gadgetService.doReset(user);
		return "login";
	}
	@RequestMapping("/add")
	public String doAdd(@ModelAttribute Gadget gadget) {
		gadgetService.doAdd(gadget);
		return "admin";
	}
	@RequestMapping("/remove")
	public String doRemove(@ModelAttribute Gadget gadget) {
		gadgetService.doRemove(gadget);
		return "admin";
	}
	@RequestMapping("/display")
	public String doDisplay(Map<String, Object> map) {
		List gadgetList = gadgetService.getList();
		map.put("gadgets", gadgetList);
		return "display";
	}
}
