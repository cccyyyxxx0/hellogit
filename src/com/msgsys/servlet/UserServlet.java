package com.msgsys.servlet;

import com.msgsys.entity.User;
import com.msgsys.service.UserService;
import com.msgsys.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

/**
 * 作者：cyx
 * 日期: 2020/11/26 16:54
 * 描述:
 */
@WebServlet("/user.do")
public class UserServlet extends BaseServlet {
    UserService userService=new UserServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request,response);
    }
    //注册
    public void register(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        int result = userService.register(new User(username, password, email));

    }
    //登陆
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String code =request.getParameter("code");
        String token=(String) request.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        if (token!=null&&token.equalsIgnoreCase(code)){
            User user = userService.login(new User(username, password, null));
            if (user!=null){
                HttpSession session = request.getSession();
                session.setAttribute("user",user);
                //request.getRequestDispatcher("/list.jsp").forward(request,response);
                request.getRequestDispatcher("/message.do?action=queryList").forward(request,response);
            }else{                          //项目名称
                response.sendRedirect(request.getContextPath()+"/login.jsp");
            }
        }else{
            //response.setContentType("text/html; charset=UTF-8");//注意text/html，和application/html
            //response.getWriter().print("<html><body><script type='text/javascript'>alert('验证码错误！');</script></body></html>");
            //response.getWriter().close();
        }



    }
}
