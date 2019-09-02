<%@ page contentType="text/html;charset=gb2312" %>
<HTML>
<body bgcolor=cyan><font size=3>
   <form  action="" method=post name=form>
      表格的行数<input type="text" name="table_rows" size=6> 
      表格的列数<input type="text" name="table_cols" size=6> 
      <input type="submit" value="确定" name="submit">
   </form>  
 <%   String rows=request.getParameter("table_rows");
      String cols=request.getParameter("table_cols");
      if(cols==null||rows==null) {
         rows=cols="0";
      }
      int m =Integer.parseInt(rows);
      int n =Integer.parseInt(cols);
 %>   <table border=2>
 <%   for(int i=1;i<=m;i++) {
 %>      <tr> 
 <%      for(int j=1;j<=n;j++) {
 %>        <td>表格第<%=i%>行，第<%=j%>列</td>
 <%      }
 %>      </tr>
 <%   }
 %>   </table>
</font></body></HTML> 
