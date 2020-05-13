package com.example.rolecustomer.controller;

import com.example.common.service.RoleService;
import com.example.rolecustomer.util.ReturnUtil;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class RoleController {

    @Reference
    RoleService roleService;

    @GetMapping("getAllRoleQxData")
    public Map getAllRoleQx() {
        List<Map> allRoleQx = roleService.getAllRoleQx();
        List<Map> allQx = roleService.getAllQx();
        Map map = new HashMap();
        map.put("allRoleQx", allRoleQx);
        map.put("allQx", allQx);
        return ReturnUtil.successReturn(map);
    }

    //更新角色权限
    @GetMapping("updateRoleQx")
    public Map updateRoleQx(@RequestParam List<String> roleqxs) {
        List list = new ArrayList();
        if (roleqxs != null) {
            //把请求数据进行解析  原来的2-1   解析成map  然后里面有rid=2  pid=1
            for (String roleqx : roleqxs) {
                String[] split = roleqx.split("-");
                Map map = new HashMap();
                map.put("rid", split[0]);
                map.put("pid", split[1]);
                list.add(map);
            }
        }
        roleService.updateRoleQx(list);
        return ReturnUtil.successReturn();
    }


//    @GetMapping("getAllRoleQx")
//    public List<Map> getAllRoleQx() {
//        return roleService.getAllRoleQx();
//    }
//
//    @GetMapping("getAllQx")
//    public List<Map> getAllQx() {
//        return roleService.getAllQx();
//    }
}
