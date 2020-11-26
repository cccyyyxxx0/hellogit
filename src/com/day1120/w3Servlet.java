package com.day1120;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 作者：cyx
 * 日期: 2020/11/20 20:11
 * 描述:
 */
//@WebServlet("/w3Servlet")
public class w3Servlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        getServletContext().setAttribute("count",0);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求参数
        response.setContentType("text/html;charset=UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String[] hobby = request.getParameterValues("hobby");

        PrintWriter writer = response.getWriter();
        int count = (int)getServletContext().getAttribute("count");
        count++;
        getServletContext().setAttribute("count",count);

        writer.println("<h1>"+username+count+"登陆成功</h1>");
        System.out.println("用户名：" + username);
        System.out.println("密码：" + password);

    }
}
