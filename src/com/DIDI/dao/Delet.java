package com.DIDI.dao;

import com.DIDI.entity.Admin_User;
import com.DIDI.entity.LMONKEY_CART;

import java.sql.*;
import java.util.ArrayList;

public class Delet {
    public static void main(String[] args) throws SQLException {
        Statement stmt=null;
        Connection conn=null;
        try {
            //1 导入驱动jar包
            //2 注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //3 获取数据库连接对象
            conn=DriverManager.getConnection("jdbc:mysql://localhost/tst_ks?useSSL = false&serverTimezone = UTC&","root","root");

            PreparedStatement ps=null;
            //4 定义sql语句
            //String sql="update lxj set name='sss' where id=1";//更改数据
            String sql="insert into Admin_user values(?,?)";//添加数据
            //String sql="delete from DIDI_wugong where 'did_id'=6";
            //5 获取执行sql的对象 Statement
            ps = conn.prepareStatement(sql);
            Admin_User admin_user=new Admin_User("aaa","123");
            Object[] objects={admin_user.getName(),admin_user.getPasswd()};
            ps.setObject(1,objects[0]);
            ps.setObject(2,objects[1]);
            int count = ps.executeUpdate();
            stmt =conn.createStatement();
            // 6 执行sql
            //int count= (int) stmt.executeLargeUpdate(sql);
            System.out.println(count);
            if (count>0){
                System.out.println("删除成功！");
            }else {
                System.out.println("添加失败！");
            }

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        finally {
            //7释放资源
            //避免空指针
            if (stmt!=null){
                try {
                    stmt.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            //避免空指针
            if (conn!=null){
                try {
                    conn.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
