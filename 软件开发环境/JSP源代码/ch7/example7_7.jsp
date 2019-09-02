<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=gb2312" %>
<HTML><body bgcolor=AAEF9E><font size=2>
<%  Connection con=null;
    Statement sql; 
    ResultSet rs;
    try { Class.forName("com.mysql.jdbc.Driver");  
    } 
    catch(ClassNotFoundException e){}
    try{  int n=50;
          String uri=
         "jdbc:mysql://127.0.0.1/bank?"+
         "user=root&password=&characterEncoding=gb2312";
          con=DriverManager.getConnection(uri);
          con.setAutoCommit(false);       //关闭自动提交模式
          sql=con.createStatement();
          rs=sql.executeQuery("SELECT userMoney FROM user WHERE name='geng'");
          rs.next();
          double gengMoney=rs.getDouble("userMoney");
          rs=sql.executeQuery("SELECT userMoney FROM user WHERE name='zhang'");
          rs.next();
          double zhangMoney=rs.getDouble("userMoney");
          out.print("转账前geng的userMoney的值是"+gengMoney+"<br>");
          out.print("转账前zhang的userMoney的值是"+zhangMoney+"<br>");
          gengMoney=gengMoney-n;
          if(gengMoney>=0) {
            zhangMoney=zhangMoney+n;
            sql.executeUpdate
            ("UPDATE user SET userMoney ="+gengMoney+" WHERE name='geng'");
            sql.executeUpdate
           ("UPDATE user SET userMoney="+zhangMoney+" WHERE name='zhang'");
            con.commit();                 //开始事务处理
          }
          rs=sql.executeQuery("SELECT * FROM user WHERE name='zhang'||name='geng'"); 
          out.println("<b>转账后的情况如下:<br>"); 
          while(rs.next()) {
              out.print(rs.getString(1)+"	");
              out.print(rs.getString(2)); 
              out.print("<br>");
          }
          con.close();
     }
     catch(SQLException e){
          try{ con.rollback();             //撤消事务所做的操作
          }
          catch(SQLException exp){}
          out.println(e);
     }
%>
</font></body></HTML>
