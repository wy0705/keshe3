package com.DIDI.service;

import com.DIDI.dao.Basedao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Admin_UserDao {
    public static int selectBy(String name, String pwd){
        int count =0;

        Connection conn = Basedao.getconn();
        PreparedStatement ps = null;
        ResultSet rs = null;



        try {
            String sql = "select count(*) from Admin_user where user=? and pwd=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, pwd);
            rs = ps.executeQuery();

            while(rs.next()) {
                count = rs.getInt(1);
            }


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            Basedao.closeall(rs, ps, conn);
        }


        return count;

    }
}
