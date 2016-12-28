package com.qingmai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qingmai.bean.UserBean;
import com.qingmai.dao.IUserDao;

@Service
public class UserService {

	@Autowired
	private IUserDao iUserDao;

	public UserBean getUser(int id) {
		return iUserDao.selectUser(id);
	}

}
