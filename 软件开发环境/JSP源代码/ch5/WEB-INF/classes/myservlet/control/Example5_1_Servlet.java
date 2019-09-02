package myservlet.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Example5_1_Servlet extends HttpServlet{
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
   }
   public void service(HttpServletRequest reqest,HttpServletResponse response)
                       throws IOException{
      reqest.setCharacterEncoding("gb2312");
      String str=reqest.getParameter("moon");
      response.setContentType("text/html;charset=gb2312");//设置响应的MIME类型
      PrintWriter out=response.getWriter();//获得一个向用户发送数据的输出流
      String sevletName=getServletName();
      out.println("<html><body bgcolor = #EEDDFF>");
      out.println("<b>请求的servlet的名字是"+sevletName+"<br></b>");
      out.println("<b>servlet在Web设计中非常重要<br>（见稍后的第6章)</b>");
      if(str!=null&&str.length()>=1)
         out.println("<br><h2>"+str+"<h2>");
      out.println("</body></html>");
   } 
}
