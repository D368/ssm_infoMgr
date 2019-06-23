package com.itheima.ssm.service;

import com.itheima.ssm.domain.Users;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<Users> findAll();

    void save(Users users);

    Users findById(String id);
}
