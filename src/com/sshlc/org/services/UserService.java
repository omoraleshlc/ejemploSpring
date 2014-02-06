package com.sshlc.org.services;

import java.util.List;

import com.sshlc.org.domain.User;

public interface UserService {
	public void insertData(User user);

	public List<User> getUserList();

	public void deleteData(String id);

	public User getUser(String id);

	public void updateData(User user);
}
