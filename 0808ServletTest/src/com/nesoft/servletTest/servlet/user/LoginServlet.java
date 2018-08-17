package com.nesoft.servletTest.servlet.user;

import com.nesoft.servletTest.bean.User.UserBean;

import com.nesoft.servletTest.service.IUserService;
import com.nesoft.servletTest.service.user.UserServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    IUserService<UserBean> userService = new UserServiceImp();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("ueserName");
        String pass = req.getParameter("passWord");//map.get();
        UserBean user = new UserBean();
        user.setName(name);
        user.setPassword(pass);
        user = userService.login(user);
        System.out.println(user.getId());
        req.getSession().setAttribute("user", user.getName());
        resp.sendRedirect("/user/loginSuccess.jsp");


    }
}
