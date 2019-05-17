package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.entity.Users;

/**
 * 使用注解开发dao层,不用配置mapper.xml
 *  
 */
@Mapper
public interface UserMapper {
	
@Select("select * from users where age=#{age}")	
public List<Users> getUser(int age);
}
