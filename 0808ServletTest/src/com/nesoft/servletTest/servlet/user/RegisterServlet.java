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

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    IUserService<UserBean> userService = new UserServiceImp();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("uesername");
        String passWord = req.getParameter("password");
        String ueserId = req.getParameter("ueserId");
        String sex = req.getParameter("sex");
        UserBean user = new UserBean();
        user.setName(userName);
        user.setPassword(passWord);
        user.setId(ueserId);
        user.setSex(sex);
        Integer flag = userService.insertInfo(user);
if(flag >=1){
    //resp.getWriter().print("success");
    resp.sendRedirect("/user/login.jsp");

}else {
    resp.getWriter().print("fail");
}
    }
}
