package com.itheima.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/30 11:38
 ***************************/
public class UtilsTest {

    public static void main(String[] args) throws SQLException {
        // 1、获取连接
        Connection connection = C3p0Utils.getConnection();

        // 2、执行insert语句
        String sql = "insert into user(name, sex, age)" +
                " values ('yangkunlin', '男', 33)";
        Statement statement = C3p0Utils.executeDML(connection, sql);

        // 3、关闭连接
        C3p0Utils.closeAll(connection, statement);
    }

}
