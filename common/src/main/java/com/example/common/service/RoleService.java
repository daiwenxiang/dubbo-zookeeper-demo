package com.example.common.service;

import java.util.List;
import java.util.Map;

public interface RoleService {

    //查询所有的角色权限
    List<Map> getAllRoleQx();

    //查询所有的权限
    List<Map> getAllQx();

    int updateRoleQx(List<Map> map);
}
