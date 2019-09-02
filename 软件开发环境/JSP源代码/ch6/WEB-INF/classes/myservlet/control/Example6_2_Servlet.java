package myservlet.control;
import mybean.data.Example6_2_Bean;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Example6_2_Servlet extends HttpServlet{
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
   }
   public void doPost(HttpServletRequest request,HttpServletResponse response)
               throws ServletException,IOException{
      Example6_2_Bean digitBean=null;
      HttpSession session=request.getSession(true);
      try{  digitBean=(Example6_2_Bean)session.getAttribute("digitBean");
            if(digitBean==null){
                digitBean=new Example6_2_Bean(); //创建Javabean对象
                 //将digitBean存储到session对象中: 
                session.setAttribute("digitBean",digitBean);
            }
      }
      catch(Exception exp){
            digitBean=new Example6_2_Bean();  //创建Javabean对象
            session.setAttribute("digitBean",digitBean);//digitBean存储到session中
      } 
      String str1=request.getParameter("numberOne");
      String str2=request.getParameter("numberTwo");
      if(str1==null||str2==null)
         return;
      if(str1.length()==0||str2.length()==0)
         return;
      double numberOne=Double.parseDouble(str1);
      double numberTwo=Double.parseDouble(str2);
      String operator=request.getParameter("operator");
      double result=0;
      if(operator.equals("+"))
         result=numberOne+numberTwo;
      else if(operator.equals("-"))
         result=numberOne-numberTwo;
      else if(operator.equals("*"))
         result=numberOne*numberTwo;
      else if(operator.equals("/"))
         result=numberOne/numberTwo;
      digitBean.setNumberOne(numberOne);     //将数据存储在digitBean中 
      digitBean.setNumberTwo(numberTwo);  
      digitBean.setOperator(operator);   
      digitBean.setResult(result); 
      //请求example6_2.jsp显示digitBean中的数据
      response.sendRedirect("example6_2.jsp");  //重定向
   } 
   public  void  doGet(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException{
       doPost(request,response);
   }
}
