<%@ page contentType="text/html;charset=gb2312" %>
<jsp:useBean id="recordBean" class="mybean.data.Shiyan1_Bean" scope="session"/>
<HTML><body bgcolor=yellow><font size=2>
<form action="shiyan1Servlet" method=post>
<b>数据库:<input type="text" name="dataBase" size=22 value =warehouse>
<br>表名：<input type="text" name="tableName" size=23 value=product>
<br>用户名(默认root)：<input type="text" name="user" size=10 value=root>
<br>用户密码(默认空)：<input type="text" name="password" size=10>
<br><input type="submit" name="b" value="提交">
</form>
 <table border=1>
  <%
      String [][] table=recordBean.getTableRecord();
      if(table==null) {
         out.print("没有记录");
         return;
      }
      String []columnName=recordBean.getColumnName();
      if(columnName!=null) { 
        out.print("<tr>");
        for(int i=0;i<columnName.length;i++){
          out.print("<th>"+columnName[i]+"</th>");
        }
        out.print("</tr>");
      } 
      out.println("全部记录数"+table.length); //全部记录数
      for(int i=0;i<table.length;i++) { 
          out.print("<tr>");
          for(int j=0;j<columnName.length;j++) {
                out.print("<td>"+table[i][j]+"</td>");
          }
          out.print("</tr>");
     }
%>
 </table>
</font></body></HTML>  
