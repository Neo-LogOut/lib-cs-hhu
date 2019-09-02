package myservlet.control;
import mybean.data.Example7_10_Bean; //引入Javabean模型
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class Example7_10_End_Servlet extends HttpServlet{
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
   }
   public void doPost(HttpServletRequest request,HttpServletResponse response)
               throws ServletException,IOException{
      Example7_10_Bean testBean=null;
      HttpSession session=request.getSession(true);
      try{  testBean=(Example7_10_Bean)session.getAttribute("testBean");
      }
      catch(Exception exp){
         response.sendRedirect("example7_10.jsp");   
      } 
      try{  Class.forName("com.mysql.jdbc.Driver");
      }
      catch(Exception e){} 
      request.setCharacterEncoding("gb2312"); 
      String id=testBean.getId();
      Connection con;
      Statement sql; 
      String condition = "INSERT INTO student VALUES"+
                          "("+"'"+id+"',"+testBean.getScore()+")";

      try{ 
          String uri="jdbc:mysql://127.0.0.1/school?"+
                      "user=root&password=&characterEncoding=gb2312";
          con=DriverManager.getConnection(uri);
          sql=con.createStatement();
          sql.executeUpdate(condition);
          float score = testBean.getScore();
          notify(request,response,id+"最后得分:"+score);
          session.invalidate();              //销毁用户的session对象
      }
      catch(SQLException exp){}   
   }
   public  void  doGet(HttpServletRequest request,HttpServletResponse response)
           throws ServletException,IOException{
       doPost(request,response);
   }
   public void notify(HttpServletRequest request,HttpServletResponse response,
                      String backNews) {
        response.setContentType("text/html;charset=GB2312");
        try {
         PrintWriter out=response.getWriter();
         out.println("<html><body>");
         out.println("<h2>"+backNews+"</h2>") ;
         out.println("</body></html>");
        }
        catch(IOException exp){} 
    }
}
