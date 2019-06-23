package com.itheima.ssm.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserTest {

    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

        String s = "123";
        String encode = bCryptPasswordEncoder.encode(s);
        System.out.println(encode);
        //$2a$10$W4h910Y.XMqOXgvQVnv7YeWABda7gWf5qkUcoo3T1I.v4n5DbuWqq
        //$2a$10$BlXUYdtoKZrEE7li6mwTlOm9MkCItzdsCFU8rATZIYfktnFtUyJwe
    }

}
