package com.itheima.ssm.service;

import com.itheima.ssm.dao.RolesDao;
import com.itheima.ssm.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RoleService {

    public List<Role> findAll();
    public void save(Role role);
}
