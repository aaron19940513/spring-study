package com.study.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class Test {
	static SqlSessionFactory sqlSessionFactory;

	static {
		sqlSessionFactory = MybatisUtil.getSqlSeesionFactory();
	}

	public void testAdd() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			User user = new User("tom", new Integer(5));
			userMapper.insertUser(user);
			sqlSession.commit();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			sqlSession.close();
		}
	}

	public void getUser() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			User user = userMapper.getUser(1);
			System.out.println(user.toString());
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			sqlSession.close();
		}
	}
}
