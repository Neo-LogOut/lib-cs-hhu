<%@ page contentType="text/html;charset=gb2312" %>
<%@ page import="java.sql.*" %>
<HTML><body bgcolor=#EEDDFF>
 <% Connection con;
    PreparedStatement sql; //预处理语句
    ResultSet rs;
    try{  Class.forName("com.mysql.jdbc.Driver");
    }
    catch(Exception e){
       out.println("忘记把MySQL数据库的JDBC-数据库驱动程序复制到JDK的扩展目录中");
    }
    try { String uri= "jdbc:mysql://127.0.0.1/warehouse";
          String user="root";
          String password="";
          con=DriverManager.getConnection(uri,user,password);
          sql=con.prepareStatement("SELECT * FROM product");
          rs=sql.executeQuery();
          out.print("<table border=2>");
          out.print("<tr>");
            out.print("<th width=100>"+"产品号");
            out.print("<th width=100>"+"名称");
            out.print("<th width=50>"+"生产日期");
            out.print("<th width=50>"+"价格");
          out.print("</TR>");
          while(rs.next()){
            out.print("<tr>");
              out.print("<td >"+rs.getString(1)+"</td>"); 
              out.print("<td >"+rs.getString(2)+"</td>");
              out.print("<td >"+rs.getDate("madeTime")+"</td>"); 
              out.print("<td >"+rs.getFloat("price")+"</td>");
            out.print("</tr>") ; 
          }
          out.print("</table>");
          con.close();
    }
    catch(SQLException e){ 
          out.print(e);
    }
 %>
</body></HTML>
