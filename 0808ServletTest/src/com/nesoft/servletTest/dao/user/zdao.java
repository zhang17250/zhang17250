package com.nesoft.servletTest.dao.user;

import com.nesoft.servletTest.bean.User.UserBean;
import com.nesoft.servletTest.util.C3p0Utils;

import java.sql.*;

public class zdao implements  Idao{
    Connection conn = C3p0Utils.getConnection();//c3p0进行数据库连接

    PreparedStatement pstmt = null;
    @Override
    public int insert(UserBean user) throws SQLException {
        String sql_add = "insert into zhihu(name,password,sex,id) values(?,?,?,?)";
        pstmt= conn.prepareStatement(sql_add);
        pstmt.setString(1, user.getName());
        pstmt.setString(2, user.getPassword());
        pstmt.setString(3, user.getSex());
        pstmt.setString(4, user.getId());
        int a=pstmt.executeUpdate();
        if (a > 0) {
            System.out.println("添加成功!");
            return 1;
        } else {
            System.out.println("添加失败!");
            return 0;
        }
    }

    @Override
    public UserBean login(UserBean user) throws Exception{
        String sql_select = "SELECT * FROM zhihu where name = ? and password = ?";
        pstmt= conn.prepareStatement(sql_select);

        pstmt.setString(1, user.getName());
        pstmt.setString(2, user.getPassword());
        ResultSet rel = pstmt.executeQuery();
        if (rel.next()) {
            System.out.println("登陆成功");
            user.setId(rel.getString("id"));
            return user;
        } else {
            System.out.println("登陆失败!");
            return null;
        }

    }

    @Override
    public int update(UserBean user) {
        return 0;
    }

    @Override
    public int delete(UserBean user) {
        return 0;
    }
}
