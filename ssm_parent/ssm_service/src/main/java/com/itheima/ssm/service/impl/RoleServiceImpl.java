package com.itheima.ssm.service.impl;

import com.itheima.ssm.dao.RolesDao;
import com.itheima.ssm.domain.Role;
import com.itheima.ssm.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RolesDao rolesDao;

    public List<Role> findAll(){
        List<Role> roles =  rolesDao.findAll();

        return roles;
    }

    public void save(Role role) {
        rolesDao.save(role);

    }
}
