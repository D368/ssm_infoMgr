package com.itheima.ssm.service.impl;


import com.itheima.ssm.dao.UserDao;
import com.itheima.ssm.domain.Role;
import com.itheima.ssm.domain.Users;
import com.itheima.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String s) {
        Users users = null;
        try {
            users = userDao.findByUsername(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        User user = new User(users.getUsername(), users.getPassword(), users.getStatus() == 0 ? false : true, true, true, true, getAuthoritys(users.getRoles()));
        return user;
    }

    private List<SimpleGrantedAuthority> getAuthoritys(List<Role> roles) {
        List<SimpleGrantedAuthority> list = new ArrayList();
        for (Role role : roles) {
            list.add(new SimpleGrantedAuthority("ROLE_" + role.getRoleName()));
        }
        return list;
    }

    @Override
    public List<Users> findAll() {
       List<Users> users = userDao.findAll();
        return users;
    }

    @Override
    public void save(Users users) {
        users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
        userDao.save(users);
    }

    @Override
    public Users findById(String id) {

        Users users = userDao.findById(id);
        return users;
    }
}
