package com.zzy.web;

import com.zzy.pojo.User;
import com.zzy.service.UserServiceImpl;
import com.zzy.service.impl.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistServlet extends HttpServlet {

    UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //1.获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String repwd = req.getParameter("repwd");
        String email = req.getParameter("email");
        String code = req.getParameter("code");

        //2.检查验证码是否正确 ===>>>暂时写死，为abcde
        if ("abcde".equalsIgnoreCase(code)) {
            if (userService.existsUsername(username)) {
                System.out.println("用户名[" + username + "]不可用");
                req.getRequestDispatcher("/pages/user/regist.html").forward(req, resp);
            } else {
                userService.registUser(new User(null, username, password, email));
                req.getRequestDispatcher("/pages/user/regist_success.html").forward(req, resp);
            }

        } else {
            System.out.println("验证码[" + code + "]错误！");
            req.getRequestDispatcher("/pages/user/regist.html").forward(req, resp);
        }
    }
}
