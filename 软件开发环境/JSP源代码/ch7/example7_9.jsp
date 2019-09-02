<%@ page contentType="text/html;charset=GB2312" %>
<%@ page import="java.sql.*" %>
<HTML><BODY bgcolor=cyan>
 <% Connection con;
    Statement sql; 
    ResultSet rs;
    try{  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    }
    catch(ClassNotFoundException e){
          out.print(e);
    }
    try { con=DriverManager.getConnection("jdbc:odbc:myData","","");
          sql=con.createStatement();
          rs=sql.executeQuery("SELECT * FROM goods ");
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
</BODY></HTML>
