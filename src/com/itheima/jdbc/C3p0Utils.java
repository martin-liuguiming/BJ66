package com.itheima.jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/30 11:33
 ***************************/
public class C3p0Utils {
    /**
     * 从连接池中获取连接
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        // 1、初始化连接池
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        // 2、从连接池中获取连接
        Connection connection = dataSource.getConnection();
        return connection;
    }

    /**
     * 执行增删改操作
     * @param connection
     * @param sql
     * @return
     * @throws SQLException
     */
    public static Statement executeDML(Connection connection ,String sql) throws SQLException {
        // 3、创建操作数据库的平台对象
        Statement statement = connection.createStatement();

        // 4、执行插入数据的sql语句
        boolean flag = statement.execute(sql);

        // 5、判断执行结果
        if (flag) {
            System.out.println("执行的是查询操作");
        }
        if (!flag) {
            System.out.println("执行的是DML操作");
        }
        return statement;
    }

    /**
     * 获取操作平台对象
     * @param connection
     * @return
     * @throws SQLException
     */
    public static Statement getStatement(Connection connection) throws SQLException {
        return connection.createStatement();
    }

    /**
     * 执行查询操作
     * @param statement
     * @param sql
     * @return
     * @throws SQLException
     */
    public static ResultSet executeDQL(Statement statement, String sql) throws SQLException {
        ResultSet resultSet = statement.executeQuery(sql);
        return resultSet;
    }


    /**
     * 关闭数据库连接
     * @param connection
     * @param statement
     * @throws SQLException
     */
    public static void closeAll(Connection connection, Statement statement) throws SQLException {
        if (connection != null) {
            connection.close();
        }
        if (statement != null) {
            statement.close();
        }
    }

}
