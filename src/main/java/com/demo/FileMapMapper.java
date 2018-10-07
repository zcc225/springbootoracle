package com.demo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface FileMapMapper {

	//插入
	void test_insert(FileMap fileMap);
	
	//查询。@Param对应参数属性注解，There is no getter for property named 'xx' in 'class java.lang.Integer
	List<FileMap> test_query(@Param("id")Integer id);
}
