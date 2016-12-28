package com.qingmai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.qingmai.bean.ListXmlBean;
import com.qingmai.bean.UserBean;
import com.qingmai.bean.XmlBean;
import com.qingmai.service.UserService;

@Controller
public class HelloController {

	@Autowired
	private UserService userService;

	// 访问数据库测试
	@RequestMapping(value = "hello.do")
	public ModelAndView hello() {
		UserBean user = userService.getUser(2);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		mv.addObject("ssm", "" + user.getUsername());
		return mv;
	}

	// 返回json数据
	@RequestMapping(value = "helloJson.do")
	@ResponseBody
	public UserBean helloJson() {
		UserBean user = userService.getUser(2);
		return user;
	}

	// 返回xml数据
	@RequestMapping(value = "helloXml.do")
	@ResponseBody
	public XmlBean helloXml() {
		XmlBean xml = new XmlBean();
		xml.setId(1);
		xml.setEmail("qingmai@qq.com");
		xml.setName("java_0912");
		return xml;
	}

	// 返回xml数组
	@RequestMapping(value = "helloXmls.do")
	@ResponseBody
	public ListXmlBean helloXmls() {
		ListXmlBean listBean = new ListXmlBean();
		List<XmlBean> list = new ArrayList<XmlBean>();
		XmlBean xml = new XmlBean();
		xml.setId(1);
		xml.setEmail("qingmai@qq.com");
		xml.setName("java_0912");
		list.add(xml);
		xml = new XmlBean();
		xml.setId(2);
		xml.setEmail("dream@qq.com");
		xml.setName("javaweb_guangzhou");
		list.add(xml);
		listBean.setList(list);
		return listBean;
	}

}
