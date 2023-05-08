package com.example.springbootregisterlogin.service;

import com.example.springbootregisterlogin.model.User;

public interface UserService {

	void save(User user);

	User findByUsername(String username);

}
