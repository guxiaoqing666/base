package com.demo.base.service;


import com.demo.base.entity.po.Permission;

public interface PermissionService {

	void save(Permission permission);

	void update(Permission permission);

	void delete(Long id);
}
