package myservlet.control;
import mybean.data.Example6_1_Bean;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Example6_1_Servlet extends HttpServlet{
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
   }
   public void doPost(HttpServletRequest request,HttpServletResponse response)
                        throws ServletException,IOException{
      Example6_1_Bean seriesData=new Example6_1_Bean();  //创建Javabean对象
      request.setAttribute("seriesData",seriesData);//将seriesData存到request对象中
      double a=Double.parseDouble(request.getParameter("firstItem"));
      double d=Double.parseDouble(request.getParameter("var"));
      int n=Integer.parseInt(request.getParameter("number"));
      seriesData.setFirstItem(a);      //将数据存储在数据模型seriesData中 
      seriesData.setVar(d);           
      seriesData.setNumber(n);
      double sum=0,item=a;
      int i=1;
      seriesData.setName("等差数列的公差");
      while(i<=n){                     //计算等差数列的和
         sum=sum+item;
         i++;
         item=item+d;  
      }
      seriesData.setSum(sum);
      //请求example6_1_show.jsp显示seriesData中的数据:
      RequestDispatcher dispatcher=
      request.getRequestDispatcher("example6_1_show.jsp");
      dispatcher.forward(request,response);  
   } 
   public  void  doGet(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException{
      Example6_1_Bean seriesData=new Example6_1_Bean(); 
      request.setAttribute("seriesData",seriesData);
      double a=Double.parseDouble(request.getParameter("firstItem"));
      double d=Double.parseDouble(request.getParameter("var"));
      int n=Integer.parseInt(request.getParameter("number"));
      seriesData.setFirstItem(a);            
      seriesData.setVar(d);           
      seriesData.setNumber(n);
      double sum=0,item=a;
      int i=1;
      seriesData.setName("等比数列的公比");
      while(i<=n){                     //计算等比数列的和
          sum=sum+item;
          i++;
          item=item*d;  
      }
      seriesData.setSum(sum);
      RequestDispatcher dispatcher=
      request.getRequestDispatcher("example6_1_show.jsp");
      dispatcher.forward(request,response);  
    }
}
