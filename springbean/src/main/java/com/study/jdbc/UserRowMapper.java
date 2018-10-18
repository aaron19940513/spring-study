package com.study.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet set, int rowNum) throws SQLException {
		User person  = new User(set.getInt("id"),set.getString("name"),set.getInt("age"),set.getString("sex"));
		return person;
	}


}
