package com.hontee.commons.service.impl;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.hontee.commons.exception.BusinessException;
import com.hontee.commons.service.RoleManagerService;

@Service
public class RoleManagerServiceImpl implements RoleManagerService {

	public Set<String> getUserRoles(Long userId) throws BusinessException {
		return null;
	}

	public Set<String> getPermissions(Long userId) throws BusinessException {
		return null;
	}

}
