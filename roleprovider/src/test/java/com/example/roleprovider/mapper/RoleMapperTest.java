package com.example.roleprovider.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RoleMapperTest {

    @Resource
    RoleMapper roleMapper;

    @Test
    void getAllRoleQx() {
        List<Map> allRoleQx = roleMapper.getAllRoleQx();
        System.out.println("allRoleQx = " + allRoleQx);
    }
}