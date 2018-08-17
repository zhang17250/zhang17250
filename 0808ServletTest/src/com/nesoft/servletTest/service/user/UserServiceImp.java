package com.nesoft.servletTest.service.user;

import com.nesoft.servletTest.bean.User.UserBean;
import com.nesoft.servletTest.dao.user.Idao;
import com.nesoft.servletTest.dao.user.zdao;
import com.nesoft.servletTest.service.IUserService;
public class UserServiceImp implements IUserService<UserBean> {


    private Idao<UserBean> user = new zdao();

    @Override
    public int insertInfo(UserBean userBean) {

        try {
            //数据库操作：插入数据返回判断
            int flg = user.insert(userBean);
            if (flg == 1) {
                return 1;//成功
            } else {
                return 0;//失败
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

    }

    @Override
    public UserBean login(UserBean userBean) {
//加密，数据验证等操作

        try {
            userBean = user.login(userBean);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return userBean;
    }
}