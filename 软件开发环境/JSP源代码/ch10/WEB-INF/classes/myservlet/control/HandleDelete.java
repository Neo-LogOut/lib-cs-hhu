package myservlet.control;
import mybean.data.Login;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HandleDelete extends HttpServlet {
   public void init(ServletConfig config) throws ServletException { 
      super.init(config);
   }
   public  void  doPost(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException {
      request.setCharacterEncoding("gb2312");
      String delete = request.getParameter("delete");
      Login loginBean=null;
      HttpSession session=request.getSession(true);
      try{  loginBean=(Login)session.getAttribute("loginBean");
            boolean b =loginBean.getLogname()==null||
            loginBean.getLogname().length()==0;
            if(b)
              response.sendRedirect("login.jsp");//重定向到登录页面
            LinkedList<String> car = loginBean.getCar();
            car.remove(delete);
      }
      catch(Exception exp){
           response.sendRedirect("login.jsp");//重定向到登录页面
      }
      RequestDispatcher dispatcher= 
      request.getRequestDispatcher("lookShoppingCar.jsp");
      dispatcher.forward(request, response);//转发 
   }
   public  void  doGet(HttpServletRequest request,HttpServletResponse response)
                        throws ServletException,IOException {
      doPost(request,response);
   }
}
