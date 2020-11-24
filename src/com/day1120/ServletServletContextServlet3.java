package com.day1120;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 作者：cyx
 * 日期: 2020/11/20 19:56
 * 描述:
 */
@WebServlet("/ServletServletContextServlet3")
public class ServletServletContextServlet3 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("在保存后ServletContextServlet3当中name=studentname的value为:"+getServletContext().getAttribute("studentname"));

    }
}
