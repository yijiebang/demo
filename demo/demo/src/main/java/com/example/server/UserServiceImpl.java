package com.example.server;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserMapper;
import com.example.entity.Users;

@Service
public class UserServiceImpl implements UserService {
	  private final static Log logger = LogFactory.getLog(UserServiceImpl.class);

	@Autowired
	UserMapper userMapper;
	
	@Override
	public List<Users> getUser(int age) {
		logger.info("getUser():age="+age);
 		return userMapper.getUser(age);
	}

}
