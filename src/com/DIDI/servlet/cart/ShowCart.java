package com.DIDI.servlet.cart;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DIDI.entity.LMONKEY_CART;
import com.DIDI.entity.LMONKEY_USER;
import com.DIDI.service.LMONKEY_CARTDao;

/**
 * Servlet implementation class ShowCart
 */
@WebServlet("/showcart")
public class ShowCart extends HttpServlet {
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		HttpSession session =  request.getSession();
		
		String isLogin = (String)session.getAttribute("isLogin");
		
		LMONKEY_USER user=(LMONKEY_USER)session.getAttribute("name");
		
		if(user!=null && isLogin.equals("1")) {//判断用户是否是登录的
			String uid = (String)user.getUSER_NAME();
			
			ArrayList<LMONKEY_CART> list= LMONKEY_CARTDao.getCart(uid);
			
			request.setAttribute("shoplist", list);
			
			request.getRequestDispatcher("cart.jsp").forward(request, response);
			
		}

		else{
			PrintWriter out = response.getWriter();

		out.write("<script>");
		out.write("alert('登录后，再审核！！')");
		out.write("location.href='login.jsp'");
		out.write("</script>");
		out.close();
		}
	}


}
