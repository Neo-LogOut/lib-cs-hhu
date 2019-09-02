package myservlet.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Example5_4_Servlet extends HttpServlet{
   double sum=0,i=1,j=1; //被所有用户共享
   int number=0;         //被所有用户共享
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
   }
   public synchronized void service(HttpServletRequest request,
              HttpServletResponse response) throws IOException{
      response.setContentType("text/html;charset=gb2312");
      PrintWriter out=response.getWriter();
      out.println("<html><body>");
      number++;
      sum=sum+i/j;
      j=j+2;
      i=-i;  
      out.println("servlet:"+getServletName()+"已经被请求了"+number+"次");
      out.println("<BR>现在PI的值是:");
      out.println(4*sum);
      out.println("</body></html>");
  } 
}
