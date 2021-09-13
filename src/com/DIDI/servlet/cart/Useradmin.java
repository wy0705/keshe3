package com.DIDI.servlet.cart;

import com.DIDI.entity.InFormation_USER;
import com.DIDI.service.Admin_UserDao;
import com.DIDI.service.InFormation_USERDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


@WebServlet("/useradmin")
public class Useradmin extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

        String userName = req.getParameter("userName");
        String passWord = req.getParameter("passWord");
        //查询数据库中的用户名和密码id并返回
        int count = Admin_UserDao.selectBy(userName, passWord);

        if (count > 0) {
            ArrayList<InFormation_USER> list= InFormation_USERDao.getCart();

            req.setAttribute("shoplist1", list);

            req.getRequestDispatcher("ShowCus.jsp").forward(req, resp);
        }
        else{
            PrintWriter out = resp.getWriter();

            out.write("<script>");
            out.write("alert('管理员登录失败！');");
            out.write("location.href='Login.jsp'");
            out.write("</script>");
            out.close();
        }
    }
}
