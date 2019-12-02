package com.demo.base.service;

import com.demo.base.entity.dto.UserDto;
import com.demo.base.entity.po.User;

public interface UserService {

	User saveUser(UserDto userDto);
	
	User updateUser(UserDto userDto);

	String passwordEncoder(String credentials, String salt);

	User getUser(String username);

	void changePassword(String username, String oldPassword, String newPassword);

}
