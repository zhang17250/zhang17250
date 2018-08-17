package com.nesoft.servletTest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;                 //导入java.sql包

public class Conn {                           //创建类Conn
    Connection con;
    public Connection getConnection() {       //建立返回值为Connection的方法
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("驱动加载成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            con=DriverManager.getConnection(
                    "jdbc:mysql:"+"//127.0.0.1:3306/test","root","123456");
            System.out.println("数据库连接成功");
        } catch (SQLException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        return con;

    }
    public static void main(String[] args) {
        Conn c =new Conn();          //创建本类对象
        c.getConnection();           //调用数据库连接的方法
    }
}
