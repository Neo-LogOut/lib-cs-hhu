package myservlet.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Example5_7_Servlet extends HttpServlet {
   public void init(ServletConfig config) throws ServletException {
      super.init(config);
   }
   public  void  doPost(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException {
      HttpSession session=request.getSession(true);  //获取客户的会话对象
      String str=request.getParameter("clientGuessLetter"); 
      Character guessLetter=str.trim().charAt(0);    //获取客户猜测所提交的字母
      //获得曾放入session中的字母：
      Character savedLetter=(Character)session.getAttribute("savedLetter");
      char realLetter=savedLetter.charValue();
      if(Character.isUpperCase(guessLetter)) {
          guessLetter=Character.toLowerCase(guessLetter);
      } 
      if(guessLetter<realLetter) {
          session.setAttribute("message","您猜小了");
          response.sendRedirect("example5_7_input.jsp");          
      }
      if(guessLetter>realLetter) {
          session.setAttribute("message","您猜大了");
          response.sendRedirect("example5_7_input.jsp");          
      }
      if(guessLetter==realLetter){
          session.setAttribute("message","您猜对了");
          response.sendRedirect("example5_7_input.jsp");          
      }
   } 
   public  void  doGet(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException {
      doPost(request,response);
   }
}
