package com.wangcc.myorm.session;

public interface Session {
	public  <T> T select();
	public 	<T> T getMapper(Class<T> type);
}
