package myservlet.control;
import mybean.data.Example7_2_Bean; //引入例子2中的Javabean模型
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Example7_3_Servlet extends HttpServlet{
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
   }
   public void doPost(HttpServletRequest request,HttpServletResponse response)
               throws ServletException,IOException{
      Example7_2_Bean resultBean=null;
      try{  resultBean=(Example7_2_Bean)request.getAttribute("resultBean");
            if(resultBean==null){
                resultBean=new Example7_2_Bean(); //创建Javabean对象
                request.setAttribute("resultBean",resultBean);
            }
      }
      catch(Exception exp){
            resultBean=new Example7_2_Bean();  //创建Javabean对象
            request.setAttribute("resultBean",resultBean);
      } 
     try{  Class.forName("com.mysql.jdbc.Driver");
     }
     catch(Exception e){} 
     request.setCharacterEncoding("gb2312");
     String dataBase = request.getParameter("dataBase");
     String tableName = request.getParameter("tableName");
     String nu=request.getParameter("number");
     String na=request.getParameter("name");
     String mT=request.getParameter("madeTime");
     String pr=request.getParameter("price");
     if(nu==null||nu.length()==0) {
        fail(request,response,"添加记录失败,必须给出记录");
        return;
     }
     float p=Float.parseFloat(pr);
     String condition = "INSERT INTO "+tableName+" VALUES"+
      "("+"'"+nu+"','"+na+"','"+mT+"',"+p+")";
     Connection con;
     Statement sql; 
     ResultSet rs;
     try{ 
          String uri="jdbc:mysql://127.0.0.1/"+dataBase+"?"+
                      "user=root&password=&characterEncoding=gb2312";
          con=DriverManager.getConnection(uri);
          sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                 ResultSet.CONCUR_READ_ONLY);
          sql.executeUpdate(condition);
          rs=sql.executeQuery("SELECT * FROM "+tableName);
          ResultSetMetaData metaData = rs.getMetaData();
          int columnCount = metaData.getColumnCount(); //得到结果集的列数
          String []columnName = new String[columnCount];
          for(int i=0;i<columnName.length;i++) {
             columnName[i] = metaData.getColumnName(i+1); //得到列名
          }
          resultBean.setColumnName(columnName);   //更新Javabean数据模型
          rs.last();
          int rowNumber=rs.getRow();  //得到记录数
          String [][] tableRecord=resultBean.getTableRecord();
          tableRecord = new String[rowNumber][columnCount];
          rs.beforeFirst();
          int i=0;
          while(rs.next()){
            for(int k=0;k<columnCount;k++) 
              tableRecord[i][k] = rs.getString(k+1);
            i++; 
          }
          resultBean.setTableRecord(tableRecord); //更新Javabean数据模型
          con.close();
          RequestDispatcher dispatcher=
          request.getRequestDispatcher("showRecord.jsp");
          dispatcher.forward(request,response);
     }
     catch(SQLException e){
          System.out.println(e);
          fail(request,response,"添加记录失败:"+e.toString());
     }  
   }
   public  void  doGet(HttpServletRequest request,HttpServletResponse response)
           throws ServletException,IOException{
       doPost(request,response);
   }
   public void fail(HttpServletRequest request,HttpServletResponse response,
                      String backNews) {
        response.setContentType("text/html;charset=GB2312");
        try {
         PrintWriter out=response.getWriter();
         out.println("<html><body>");
         out.println("<h2>"+backNews+"</h2>") ;
         out.println("返回");
         out.println("<a href =example7_3.jsp>输入记录</a>");
         out.println("</body></html>");
        }
        catch(IOException exp){} 
    }
}
