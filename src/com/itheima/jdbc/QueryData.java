package com.itheima.jdbc;

import java.sql.*;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/30 10:34
 ***************************/
public class QueryData {

    public static void main(String[] args) {
        String url = "jdbc:mysql://node1:3306/test?useUnicode=true&characterEncoding=UTF-8";
        String username = "root";
        String password = "123456";


        // 1、注册数据库对应的驱动
        // 相当于执行Driver中的静态代码块{DriverManager.registerDriver(new Driver());}
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("驱动类找不到，请正确配置对应的驱动！");;
        }

        // 2、创建与数据库mysql的连接
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println("连接信息有误，请正确配置连接信息-连接地址，用户名，密码");
        }

        // 3、创建操作数据库的平台对象
        Statement statement = null;
        try {
            statement = connection.createStatement();
            // 4、执行查询sql语句
            String sql = "select * from user where id = 3 or 1 = 1";
            ResultSet resultSet = statement.executeQuery(sql);
            // 5、遍历结果对象
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.println("name为：" + name + "   age为：" + age);
            }
        } catch (SQLException e) {
            System.out.println("数据操作平台有误");
        }

        try {
            connection.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
