package com.qingmai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qingmai.bean.UserBean;
import com.qingmai.service.UserService;

@Controller
public class HelloController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "hello.do")
	public ModelAndView hello() {

		UserBean user = userService.getUser(2);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		mv.addObject("ssm", "" + user.getUsername());
		return mv;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
