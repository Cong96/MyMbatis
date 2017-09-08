package com.wangcc.myorm.config;

import java.io.InputStream;

public class SessionFactoryBuilder {
	private static Configuration config=new Configuration();
	public static Configuration build(String resource) {
		InputStream stream=SessionFactoryBuilder.class.getClassLoader().getResourceAsStream(resource);
	}
}
