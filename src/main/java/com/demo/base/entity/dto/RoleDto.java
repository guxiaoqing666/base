package com.demo.base.entity.dto;

import com.demo.base.entity.po.Role;

import java.util.List;

public class RoleDto extends Role {

	private static final long serialVersionUID = 4218495592167610193L;

	private List<Long> permissionIds;

	public List<Long> getPermissionIds() {
		return permissionIds;
	}

	public void setPermissionIds(List<Long> permissionIds) {
		this.permissionIds = permissionIds;
	}
}
