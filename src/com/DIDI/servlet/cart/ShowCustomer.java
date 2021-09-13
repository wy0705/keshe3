package com.DIDI.servlet.cart;

import com.DIDI.entity.InFormation_USER;
import com.DIDI.entity.LMONKEY_USER;
import com.DIDI.service.InFormation_USERDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/showcustomer")
public class ShowCustomer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

        HttpSession session =  req.getSession();

		String isLogin = (String)session.getAttribute("isLogin");

		LMONKEY_USER user=(LMONKEY_USER)session.getAttribute("name");

        ArrayList<InFormation_USER> list= InFormation_USERDao.getCart();

        req.setAttribute("shoplist1", list);

        req.getRequestDispatcher("ShowCus.jsp").forward(req, resp);
        PrintWriter out = resp.getWriter();

        out.write("<script>");
        out.write("alert('登录后，进行审核 ')");
        out.write("location.href='login.jsp'");
        out.write("</script>");
        out.close();
    }
}
