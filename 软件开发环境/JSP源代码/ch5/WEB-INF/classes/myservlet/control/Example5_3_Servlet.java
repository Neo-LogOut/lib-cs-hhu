package myservlet.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Example5_3_Servlet extends HttpServlet{
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
   }
   public void service(HttpServletRequest request,HttpServletResponse response)
                       throws IOException{
      request.setCharacterEncoding("gb2312");
      response.setContentType("text/html;charset=gb2312");
      PrintWriter out=response.getWriter();
      out.println("<html><body bgcolor=#EEFFAA>");
      String a=request.getParameter("sideA");
      String b=request.getParameter("sideB");
      String c=request.getParameter("sideC");
      if(a==null||a.length()==0)
         return;
      double sideA=0,sideB=0,sideC=0;
      try {
         sideA = Double.parseDouble(a);
         sideB = Double.parseDouble(b);
         sideC = Double.parseDouble(c);
      }
      catch(NumberFormatException exp){
         return;
      }
      double area = 0,p=0;
      p = (sideA+sideB+sideC)/2;
      area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
      out.print("三角形"+a+","+b+","+c+"的面积是"+area);      
      out.println("</body></html>");
   } 
}
