package com.study.jdbc;

import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserServiceImpl implements UserService {
	private JdbcTemplate jdbcTemplate;

	@Override
	public void save(User user) {
		jdbcTemplate.update("inser into user(name,age,sex) values(?,?,?)",
				new Object[] { user.getName(), user.getAge(), user.getSex() },
				new int[] { Types.VARCHAR, Types.INTEGER, Types.INTEGER });

	}

	@Override
	public List<User> getUser() {
		List<User> list = jdbcTemplate.query("select * from user", new UserRowMapper());
		return list;
	}

	public void setDateSource(DataSource dataSource ) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
}
