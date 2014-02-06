package com.sshlc.org.dao;

import java.util.List;
import com.sshlc.org.domain.User;

public interface UserDao {
	public void insertData(User user);

	public List<User> getUserList();

	public void updateData(User user);

	public void deleteData(String id);

	public User getUser(String id);

}
