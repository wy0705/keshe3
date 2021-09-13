package com.DIDI.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.DIDI.dao.Basedao;
import com.DIDI.entity.LMONKEY_CART;

public class LMONKEY_CARTDao {
	public static int insert(LMONKEY_CART cart){
		String sql = "insert into DIDI_wugong values(null,?,?,?,?,?,?,?,1)";

		Object[] params = {
				cart.getDidi_p_filename(),
				cart.getDidi_p_name(),
				cart.didi_p_phone,
				cart.didi_price,
				cart.didi_p_address,
				cart.getDidi_id(),
				cart.didi_u_id

		};

		return Basedao.exectuIUD(sql, params);
	}


	public static LMONKEY_CART getCartShop(String id) {
		LMONKEY_CART es =null;
		//声明结果集
		ResultSet rs = null;
		//获取连接对象
		Connection conn = Basedao.getconn();

		PreparedStatement ps = null;


		try {
			String sql = "select * from DIDI_wugong where didi_id=? and didi_valid=1 order by didi_id desc";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);

			rs = ps.executeQuery();

			 while(rs.next()) {
				 es = new LMONKEY_CART(
						 	rs.getInt("didi_id"),
						 	rs.getString("didi_p_filename"),
						 	rs.getString("didi_p_name"),
						 	rs.getString("didi_p_phone"),
						 	rs.getString("didi_price"),
						 	rs.getString("didi_p_address"),
						 	rs.getInt("didi_p_id"),
						 	rs.getString("didi_u_id"),
						 	rs.getInt("didi_valid")
						 );






			 }


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Basedao.closeall(rs, ps, conn);
		}



		return es;
	}



	public static LMONKEY_CART getCartShop(String uid, String pid) {
		LMONKEY_CART es =null;
		//声明结果集
		ResultSet rs = null;
		//获取连接对象
		Connection conn = Basedao.getconn();

		PreparedStatement ps = null;



		try {
			String sql = "select * from DIDI_wugong where didi_u_id=? and didi_p_id=? and didi_valid=1 order by didi_id desc";
			ps = conn.prepareStatement(sql);
			ps.setString(1, uid);
			ps.setInt(2, Integer.parseInt(pid));
			rs = ps.executeQuery();

			 while(rs.next()) {
				 es = new LMONKEY_CART(
						 rs.getInt("didi_id"),
						 rs.getString("didi_p_filename"),
						 rs.getString("didi_p_name"),
						 rs.getString("didi_p_phone"),
						 rs.getString("didi_price"),
						 rs.getString("didi_p_address"),
						 rs.getInt("didi_p_id"),
						 rs.getString("didi_u_id"),
						 rs.getInt("didi_valid")
						 );






			 }


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Basedao.closeall(rs, ps, conn);
		}



		return es;
	}


	public static ArrayList<LMONKEY_CART> getCart(String id){
		ArrayList<LMONKEY_CART> list = new ArrayList<LMONKEY_CART>();
		//声明结果集
		ResultSet rs = null;
		//获取连接对象
		Connection conn = Basedao.getconn();

		PreparedStatement ps = null;

		try {
			String sql = "select *from DIDI_wugong where didi_u_id=? and didi_valid=1 order by didi_id desc";

			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();

			 while(rs.next()) {
				 LMONKEY_CART c = new LMONKEY_CART(
						 rs.getInt("didi_id"),
						 rs.getString("didi_p_filename"),
						 rs.getString("didi_p_name"),
						 rs.getString("didi_p_phone"),
						 rs.getString("didi_price"),
						 rs.getString("didi_p_address"),
						 rs.getInt("didi_p_id"),
						 rs.getString("didi_u_id"),
						 rs.getInt("didi_valid")
						 );


				 list.add(c);

			 }


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Basedao.closeall(rs, ps, conn);
		}



		return list;
	}

	public static ArrayList<LMONKEY_CART> get(String id){
		ArrayList<LMONKEY_CART> list = new ArrayList<LMONKEY_CART>();
		//声明结果集
		ResultSet rs = null;
		//获取连接对象
		Connection conn = Basedao.getconn();

		PreparedStatement ps = null;

		try {
			String sql = "select *from DIDI_wugong where didi_u_id=? and didi_valid=1 order by didi_id desc";

			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();

			while(rs.next()) {
				LMONKEY_CART c = new LMONKEY_CART(
						rs.getInt("didi_id"),
						rs.getString("didi_p_filename"),
						rs.getString("didi_p_name"),
						rs.getString("didi_p_phone"),
						rs.getString("didi_price"),
						rs.getString("didi_p_address"),
						rs.getInt("didi_p_id"),
						rs.getString("didi_u_id"),
						rs.getInt("didi_valid")
				);


				list.add(c);

			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Basedao.closeall(rs, ps, conn);
		}



		return list;
	}
	public static int updatenum(int esid, int count){

		String sql = "update DIDI_wugong set didi_price=? where didi_id=? ";

		Object[] params = {count, esid};

		return Basedao.exectuIUD(sql, params);

	}

	public static int getDeleteDD(int id) {

		String sql="delete from DIDI_wugong where didi_id=?";

		Object[] params={id};

		return Basedao.exectuIUD(sql, params);
	}

}
