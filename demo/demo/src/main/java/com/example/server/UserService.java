package com.example.server;

import java.util.List;

import com.example.entity.Users;

public interface UserService {
	public List<Users> getUser(int age);

}
