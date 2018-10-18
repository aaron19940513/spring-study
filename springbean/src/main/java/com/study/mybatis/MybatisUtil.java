package com.study.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	private static final SqlSessionFactory SQL_SESSION_FACTORY;

	static {
		String resource = "resource/mybatis/mybatis-config.xml";
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
		}
		SQL_SESSION_FACTORY = new SqlSessionFactoryBuilder().build(reader);
	}
	
	public static SqlSessionFactory getSqlSeesionFactory() {
		return SQL_SESSION_FACTORY;
	}
}
