package com.jxw.mapper;

import com.jxw.pojo.Role;

import java.util.List;

public interface RoleMapper {
    public List<Role> listRolesByUserName(String userName);
}
