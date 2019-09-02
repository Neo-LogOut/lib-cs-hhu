package myservlet.control;
import mybean.data.*;
import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HandleLogin extends HttpServlet{
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
      try{ 
             Class.forName("com.mysql.jdbc.Driver");
      }
      catch(Exception e){} 
   }
   public String handleString(String s){
      try{  byte bb[]=s.getBytes("iso-8859-1");
            s=new String(bb);
      }
      catch(Exception ee){} 
      return s;  
   }
   public void doPost(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException{
      Connection con; 
      Statement sql; 
      Login loginBean=null;
      String backNews="";
      HttpSession session=request.getSession(true);
      try{  loginBean=(Login)session.getAttribute("login");
            if(loginBean==null){
               loginBean=new Login();  
               session.setAttribute("login",loginBean);
            }
      }
      catch(Exception ee){
            loginBean=new Login();  
            session.setAttribute("login",loginBean);
      }
      String logname=request.getParameter("logname").trim(),
      password=request.getParameter("password").trim();
      boolean ok=loginBean.getSuccess();
      logname=handleString(logname);
      password=handleString(password);
      if(ok==true&&logname.equals(loginBean.getLogname())){
           backNews=logname+"已经登录了";
           loginBean.setBackNews(backNews);
      }
      else{
           String uri="jdbc:mysql://127.0.0.1/MakeFriend";
           boolean boo=(logname.length()>0)&&(password.length()>0);  
           try{ 
                con=DriverManager.getConnection(uri,"root","");
                String condition="select * from member where logname = '"+logname+
                                 "' and password ='"+password+"'";
                sql=con.createStatement();  
                if(boo){
                   ResultSet rs=sql.executeQuery(condition);
                   boolean m=rs.next();
                   if(m==true){
                     backNews="登录成功";
                     loginBean.setBackNews(backNews);
                     loginBean.setSuccess(true);
                     loginBean.setLogname(logname);
                   }
                   else{
                     backNews="您输入的用户名不存在，或密码不般配";
                     loginBean.setBackNews(backNews); 
                     loginBean.setSuccess(false); 
                     loginBean.setLogname(logname);
                     loginBean.setPassword(password);
                   }
                }
                else{
                  backNews="您输入的用户名不存在，或密码不般配";
                  loginBean.setBackNews(backNews); 
                  loginBean.setSuccess(false); 
                  loginBean.setLogname(logname);
                  loginBean.setPassword(password);
                }
                con.close();
           }
           catch(SQLException exp){
                backNews=""+exp;
                loginBean.setBackNews(backNews); 
                loginBean.setSuccess(false); 
           }
      }
      RequestDispatcher dispatcher=
      request.getRequestDispatcher("showLoginMess.jsp");//转发
      dispatcher.forward(request,response);
   }
   public  void  doGet(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException{
      doPost(request,response);
   }
}
