package com.itheima.jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/30 11:27
 ***************************/
public class DataSourcePoolTest {

    public static void main(String[] args) throws SQLException {
        // 1、初始化连接池
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        // 2、从连接池中获取连接
        Connection connection = dataSource.getConnection();
        // 3、创建一个预编译平台对象
        String sql = "select * from user where name = ? and age = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        // 4、接收对应的参数执行sql
        preparedStatement.setString(1, "yangkunlin");
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
