package com.wangcc.myorm.config;

import java.util.HashMap;
import java.util.Map;

public class Configuration {
	private  DataSource dataSource;
	private  Map<String,ResultMap> resultMap=new HashMap<String, ResultMap>();
	private Map<String,Class<?>> mapperMap=new HashMap<String, Class<?>>();
	
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public Map<String, ResultMap> getResultMap() {
		return resultMap;
	}
	public void setResultMap(Map<String, ResultMap> resultMap) {
		this.resultMap = resultMap;
	}
	public Map<String, Class<?>> getMapperMap() {
		return mapperMap;
	}
	public void setMapperMap(Map<String, Class<?>> mapperMap) {
		this.mapperMap = mapperMap;
	}
	
}
