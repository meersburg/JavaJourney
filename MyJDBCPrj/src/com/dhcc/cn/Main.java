package com.dhcc.cn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static final String URL="jdbc:mysql://localhost:3306/zyh";
    public static final String USER="root";
    public static final String PASSWORD="123";

    public static void main(String[] args) throws Exception {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获得数据库连接
        Connection conn= DriverManager.getConnection(URL,USER,PASSWORD);
        //3.操作数据库实现功能（增删改查）
        Statement stmt=conn.createStatement();
        ResultSet result=stmt.executeQuery("SELECT STUNAME , LEVEL FROM MEMBER WHERE ID ='1'");
        while(result.next()){
            System.out.println(result.getString("STUNAME")+" 级别："+result.getInt("LEVEL"));
        }
    }
}
