package com.jxw.service.impl;

import com.jxw.mapper.PermissionMapper;
import com.jxw.pojo.Permission;
import com.jxw.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PermissionServiceImpl  implements PermissionService {

    @Autowired
    PermissionMapper permissionMapper;

    @Override
    public Set<String> listPermissions(String userName) {
        List<Permission> permissions = permissionMapper.listPermissionsByUserName(userName);
        Set<String> result = new HashSet<>();
        for (Permission permission: permissions) {
            result.add(permission.getName());
        }
        return result;
    }
}