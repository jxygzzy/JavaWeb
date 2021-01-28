package com.zzy.test;

import com.zzy.pojo.User;
import com.zzy.service.impl.UserServiceImpl;
import com.zzy.service.UserService;
import org.junit.Test;

public class UserServiceTest {

    UserService userService = new UserServiceImpl();

    @Test
    public void registUser() {
        userService.registUser(new User(null,"abc193","666666","abc193@zzy.com"));
    }

    @Test
    public void login() {
        System.out.println(userService.login(new User(null,"admin","admin",null)));
    }

    @Test
    public void existsUsername() {
        if(userService.existsUsername("admin1")){
            System.out.println("用户名已存在！");
        }else {
            System.out.println("用户名可用！");
        }

    }
}