package com.nesoft.servletTest.util;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class C3p0Utils {
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource("test");

    public static DataSource getDataSource() {
        return dataSource;
    }
    //归还
    public static Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
//获取单个链接
