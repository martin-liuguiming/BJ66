package com.itheima.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/30 16:28
 ***************************/
public class JDBCTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://node1:3306/test?useUnicode=true&characterEncoding=UTF-8";
        String username = "root";
        String password = "123456";


        // 1、注册数据库对应的驱动
        // 相当于执行Driver中的静态代码块{DriverManager.registerDriver(new Driver());}
        Class.forName("com.mysql.jdbc.Driver");

        // 2、创建与数据库mysql的连接
        Connection connection = DriverManager.getConnection(url, username, password);

        // 3、创建操作数据库的平台对象
        Statement statement = connection.createStatement();

        // 4、执行插入数据的sql语句
        String sql = "insert into user(name, sex, age)" +
                " values ('yangkun', '男', 33)";
        boolean flag = statement.execute(sql);

        // 5、判断执行结果
        if (flag) {
            System.out.println("执行的是查询操作");
        }
        if (!flag) {
            System.out.println("执行的是DML操作");
        }

        // 6、关闭连接
        statement.close();
        connection.close();
    }

}
