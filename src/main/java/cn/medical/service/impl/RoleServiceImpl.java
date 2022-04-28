package cn.medical.service.impl;

import cn.medical.dao.RoleMapper;
import cn.medical.pojo.Role;
import cn.medical.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public Role getRoleByRoleId(int role_id) {
        return roleMapper.selectByPrimaryKey(role_id);
    }
}
