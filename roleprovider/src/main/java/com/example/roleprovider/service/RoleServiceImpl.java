package com.example.roleprovider.service;

import com.example.common.service.RoleService;
import com.example.roleprovider.mapper.RoleMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Component
@Transactional
@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    RoleMapper roleMapper;

    @Override
    public List<Map> getAllRoleQx() {
        return roleMapper.getAllRoleQx();
    }

    @Override
    public List<Map> getAllQx() {
        return roleMapper.getAllQx();
    }

    @Override
    public int updateRoleQx(List<Map> map) {
        roleMapper.delRoleQx();
        return roleMapper.addRoleQxs(map);
    }
}
