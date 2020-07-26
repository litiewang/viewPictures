package xyz.lyxself.pictures.service;

import java.util.List;

public interface BaseService<T>{
	List<T> findAll();   // 查询数据库所有实体的数据的方法（jpa内置方法）
	T findById(Long id); // 更具id查询数据库中实体的数据的方法（jpa内置方法）
}

