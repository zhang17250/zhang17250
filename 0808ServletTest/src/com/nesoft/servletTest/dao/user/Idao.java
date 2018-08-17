package com.nesoft.servletTest.dao.user;

import com.nesoft.servletTest.bean.User.UserBean;

import java.sql.SQLException;

public interface Idao<T> {

    int insert (UserBean user) throws SQLException;

    UserBean login (UserBean user) throws Exception;

    int update(UserBean user);

    int delete(UserBean user);

}
