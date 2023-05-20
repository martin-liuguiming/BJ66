package com.itheima.jdbc;

import java.sql.*;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/30 10:56
 ***************************/
public class PreparedStat {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://node1:3306/test?useUnicode=true&characterEncoding=UTF-8";
        String username = "root";
        String password = "123456";


        // 1、注册数据库对应的驱动
        // 相当于执行Driver中的静态代码块{DriverManager.registerDriver(new Driver());}
        Class.forName("com.mysql.jdbc.Driver");

        // 2、创建与数据库mysql的连接
        Connection connection = DriverManager.getConnection(url, username, password);

        // 3、创建一个预编译平台对象
        String sql = "select * from user where name = ? and age = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        // 4、接收对应的参数执行sql
        preparedStatement.setString(1, "yangkunlin or 1=1");
        preparedStatement.setInt(2, 33);

        ResultSet resultSet = preparedStatement.executeQuery();

        // 5、遍历结果对象
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            System.out.println("name为：" + name + "   age为：" + age);
        }

        // 关闭连接
        preparedStatement.close();
        connection.close();
    }

}
