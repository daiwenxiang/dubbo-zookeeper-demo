package com.example.roleprovider.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface RoleMapper {

    //查询所有的角色权限
    List<Map> getAllRoleQx();

    //查询所有的权限
    @Select("select * from sys_permission")
    List<Map> getAllQx();

    //删除角色权限的所有记录
    @Delete("delete from sys_role_permission")
    int delRoleQx();

    //添加所有的角色权限记录
    int addRoleQxs(@Param("roleQxs") List<Map> roleQxs);
}
