package com.study.jdbc;

import java.util.List;

public interface UserService {
	public void save(User user);

	public List<User> getUser();
}
