package com.hontee.commons.service;

import java.util.Set;

public interface RoleManagerService {
	
	/**
	 * 根据用户Id获取角色
	 * @param userId
	 * @return
	 */
	Set<String> getUserRoles(Long userId);
	
	/**
	 * 根据用户ID获取权限
	 * @param roleId
	 * @return
	 */
	Set<String> getPermissions(Long userId);

}
