package myservlet.control;
import mybean.data.Example7_2_Bean; //引入例子2中的Javabean模型
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Calendar;
public class Example7_6_Servlet extends HttpServlet{
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
     String number=request.getParameter("number");
     String name=request.getParameter("name");
     String madeTime=request.getParameter("madeTime");
     String pr=request.getParameter("price");
     if(number==null||number.length()==0) {
        fail(request,response,"更新记录失败,必须给出记录");
        return;
     }
     float price=Float.parseFloat(pr);
     String [] str=madeTime.split("[-/]");//输入的日期必须用-或/格式
     int year=Integer.parseInt(str[0]);
     int month=Integer.parseInt(str[1]); 
     int day=Integer.parseInt(str[2]);
     Calendar calendar =Calendar.getInstance();
     calendar.set(year,month-1,day); 
     Date date=new Date(calendar.getTimeInMillis());
     Connection con;
     PreparedStatement sql; //预处理语句 ; 
     ResultSet rs;
     try{ 
          String uri="jdbc:mysql://127.0.0.1/warehouse?"+
                      "user=root&password=&characterEncoding=gb2312";
          con=DriverManager.getConnection(uri);
          String condition =
         "UPDATE product SET name = ?,price = ?,madeTime = ?  WHERE number=?";
          sql=con.prepareStatement(condition);  
          sql.setString(1,name);   //设置第1个统配符“？”代表的具体值
          sql.setFloat(2,price);   //设置第2个统配符“？”代表的具体值
          sql.setDate(3,date);     //设置第3个统配符“？”代表的具体值
          sql.setString(4,number); //设置第4个统配符“？”代表的具体值
          sql.executeUpdate();
          sql=con.prepareStatement("select * from product");
          rs=sql.executeQuery();
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
          dispatcher.forward(request,response);  //转发
     }
     catch(SQLException e){
          System.out.println(e);
          fail(request,response,"更新记录失败:"+e.toString());
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
         out.println("<a href =example7_6.jsp>输入记录</a>");
         out.println("</body></html>");
        }
        catch(IOException exp){} 
    }
}
