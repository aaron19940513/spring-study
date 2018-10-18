package com.study.mybatis;

public interface UserMapper {
	public void insertUser(User user);

	public User getUser(Integer id);
}
