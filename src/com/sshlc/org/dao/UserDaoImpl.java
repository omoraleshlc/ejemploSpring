package com.sshlc.org.dao;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.sshlc.org.domain.User;
import com.sshlc.org.jdbc.UserRowMapper;

public class UserDaoImpl implements UserDao {

	@Autowired
	DataSource dataSource;

        @Override
	public void insertData(User user) {

		String sql = "INSERT INTO user "
				+ "(first_name,last_name, gender, city, estado) VALUES (?, ?, ?, ?, ?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { user.getFirstName(), user.getLastName(),
						user.getGender(), user.getCity() , user.getEstado() });

	}

	public List<User> getUserList() {
		List userList = new ArrayList();

		String sql = "select * from user";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		userList = jdbcTemplate.query(sql, new UserRowMapper());
		return userList;
	}

	@Override
	public void deleteData(String id) {
		String sql = "delete from user where user_id=" + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);

	}

	@Override
	public void updateData(User user) {

		String sql = "UPDATE user set first_name = ?,last_name = ?, gender = ?, city = ?, estado = ? where user_id = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { user.getFirstName(), user.getLastName(),
						user.getGender(), user.getCity(), user.getEstado(),user.getUserId() });

	}

	@Override
	public User getUser(String id) {
		List<User> userList = new ArrayList<User>();
		String sql = "select * from user where user_id= " + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		userList = jdbcTemplate.query(sql, new UserRowMapper());
		return userList.get(0);
	}

}