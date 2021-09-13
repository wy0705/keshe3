package com.DIDI.servlet.cart;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DIDI.entity.InFormation_USER;
import com.DIDI.entity.LMONKEY_CART;
import com.DIDI.service.InFormation_USERDao;
import com.DIDI.service.LMONKEY_CARTDao;

/**
 * Servlet implementation class CartShopDel
 */
@WebServlet("/cartshopdel")
public class CartShopDel extends HttpServlet {
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int didi = Integer.parseInt(request.getParameter("id"));
	LMONKEY_CARTDao.getDeleteDD(didi);
		response.sendRedirect("showcart");
	}
	

}
