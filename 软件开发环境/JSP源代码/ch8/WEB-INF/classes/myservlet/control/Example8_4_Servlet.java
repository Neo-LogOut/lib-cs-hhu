package myservlet.control;
import mybean.data.Example8_4_Bean;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Example8_4_Servlet extends HttpServlet{
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
   }
   public void doPost(HttpServletRequest request,HttpServletResponse response)
                        throws ServletException,IOException{
      Example8_4_Bean fileBean=new Example8_4_Bean();  //创建Javabean对象
      request.setAttribute("fileBean",fileBean);
      String filePath=request.getParameter("filePath");
      String fileName=request.getParameter("fileName");
      fileBean.setFilePath(filePath);   //将数据存储在fileBean中 
      fileBean.setFileName(fileName);   
      try{   File f=new File(filePath,fileName);
             long length=f.length();
             fileBean.setFileLength(length);
             FileReader in=new FileReader(f) ;
             BufferedReader inTwo=new BufferedReader(in);
             StringBuffer stringbuffer=new StringBuffer(); 
             String s=null;
             while ((s=inTwo.readLine())!=null) 
                stringbuffer.append("\n"+s);
             String content=new String(stringbuffer);
             fileBean.setFileContent(content);
      }
      catch(IOException exp){
            fileBean.setFileContent("读取失败"+exp.toString());
      } 
      RequestDispatcher dispatcher=
      request.getRequestDispatcher("example8_4_showFile.jsp");
      dispatcher.forward(request, response);
   } 
   public  void  doGet(HttpServletRequest request,
HttpServletResponse response) 
                        throws ServletException,IOException{
      doPost(request,response);
   }
}
