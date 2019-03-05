package com.jxw.mapper;

import com.jxw.pojo.Permission;

import java.util.List;

public interface PermissionMapper {
    public List<Permission> listPermissionsByUserName(String userName);

}