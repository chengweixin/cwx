package com.qingmai.dao;

import org.springframework.stereotype.Repository;

import com.qingmai.bean.UserBean;

@Repository
public interface IUserDao {

	UserBean selectUser(int id);
}
