package com.mfirmanakbar.service;

import com.mfirmanakbar.model.User;

public interface UserService {
	void save(User user);

	User findByUsername(String username);
}
