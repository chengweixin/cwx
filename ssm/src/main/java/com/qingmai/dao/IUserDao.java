package com.qingmai.dao;

import org.springframework.stereotype.Repository;

import com.qingmai.bean.UserBean;

// spring 自 2.0 版本开始，陆续引入了一些注解用于简化 Spring 的开发。
// @Repository注解便属于最先引入的一批，它用于将数据访问层 (DAO 层 ) 的类标识为 Spring Bean。
// 具体只需将该注解标注在 DAO类上即可。
// 同时，为了让 Spring 能够扫描类路径中的类并识别出 @Repository 注解，
// 需要在 XML 配置文件中启用Bean 的自动扫描功能，这可以通过<context:component-scan/>实现。
// <context:component-scan base-package=”bookstore.dao” /> 

// @Repository 将 DAO 类声明为 Bean 
@Repository
public interface IUserDao {

	UserBean selectUser(int id);
}
