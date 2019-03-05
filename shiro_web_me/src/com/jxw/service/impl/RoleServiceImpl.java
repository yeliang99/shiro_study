package com.jxw.service.impl;

import com.jxw.mapper.RoleMapper;
import com.jxw.pojo.Role;
import com.jxw.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired RoleMapper roleMapper;
    @Override
    public Set<String> listRoles(String userName) {
        List<Role> roles = roleMapper.listRolesByUserName(userName);
        Set<String> result = new HashSet<>();
        for (Role role: roles) {
            result.add(role.getName());
        }
        return result;
    }
}
