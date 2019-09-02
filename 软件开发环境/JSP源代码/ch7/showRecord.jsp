<%@ page contentType="text/html;charset=gb2312" %>
<jsp:useBean id="resultBean" 
     class="mybean.data.Example7_2_Bean" scope="request"/>
<HTML><body bgcolor=#DEEFF9><font size=2>
  <table border=1>
  <%  String []columnName=resultBean.getColumnName(); 
  %>
      <tr>
  <%  for(String s:columnName) {
  %>    <th><%= s %></th>
  <%  }
  %>  </tr>
  <%  String [][] record = resultBean.getTableRecord();
      for(int i=0;i<record.length;i++) {
  %>    <tr>
  <%     for(int j=0;j<record[i].length;j++) {
  %>        <td><%= record[i][j] %> </td>
  <%     }
  %>    </tr>
  <%  }
  %>
  </table>
</font></body></HTML>  
