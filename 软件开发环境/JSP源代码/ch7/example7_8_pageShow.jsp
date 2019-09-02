<%@ page contentType="text/html;charset=gb2312" %>
<jsp:useBean id="pageBean" class="mybean.data.Example7_8_Bean" scope="session"/>
<HTML><body bgcolor=#9FEFDF><center>
<br>当前显示的内容是：
<jsp:setProperty name="pageBean" property="pageSize" param="pageSize"/>
<jsp:setProperty name="pageBean" property="currentPage" param="currentPage"/>
  <table border=1>
  <%
      String [][] table=pageBean.getTableRecord();
      if(table==null) {
         out.print("没有记录");
         return;
      }
      String []columnName=pageBean.getColumnName();
      if(columnName!=null) { 
        out.print("<tr>");
        for(int i=0;i<columnName.length;i++){
          out.print("<th>"+columnName[i]+"</th>");
        }
        out.print("</tr>");
      } 
      int totalRecord = table.length;
      out.println("全部记录数"+totalRecord); //全部记录数
      int pageSize=pageBean.getPageSize();  //每页显示的记录数
      int totalPages = pageBean.getTotalPages();
      if(totalRecord%pageSize==0)
           totalPages = totalRecord/pageSize;//总页数
      else
           totalPages = totalRecord/pageSize+1;
      pageBean.setPageSize(pageSize);
      pageBean.setTotalPages(totalPages);
      if(totalPages>=1) {
         if(pageBean.getCurrentPage()<1)
             pageBean.setCurrentPage(pageBean.getTotalPages());
         if(pageBean.getCurrentPage()>pageBean.getTotalPages())
             pageBean.setCurrentPage(1);
         int index=(pageBean.getCurrentPage()-1)*pageSize;
         int start=index;  //table的currentPage页起始位置
         for(int i=index;i<pageSize+index;i++) { 
            if(i==totalRecord)
               break;
            out.print("<tr>");
            for(int j=0;j<columnName.length;j++) {
                out.print("<td>"+table[i][j]+"</td>");
            }
            out.print("</tr>");
        }
     }
%>
 </table>
 <br>每页最多显示<jsp:getProperty name="pageBean" property="pageSize"/>条信息
 <br>当前显示第<font color=blue>
     <jsp:getProperty name="pageBean" property="currentPage"/>
   </font>页,共有
   <font color=blue><jsp:getProperty name="pageBean" property="totalPages"/>
   </font>页。
<table>
  <tr><td><form action="" method=post>
          <input type=hidden name="currentPage" value=
         "<%=pageBean.getCurrentPage()-1 %>">
           <input type=submit name="g" value="上一页"></form></td>
      <td><form action="" method=post>
          <input type=hidden name="currentPage"
           value="<%=pageBean.getCurrentPage()+1 %>">
          <input type=submit name="g" value="下一页"></form></td></tr>
 <tr><td> <form action="" method=post>
          每页显示<input type=text name="pageSize" value =1 size=3>
          条记录<input type=submit name="g" value="确定"></form></td>
      <td> <form action="" method=post>
           输入页码：<input type=text name="currentPage" size=2 >
           <input type=submit name="g" value="提交"></form></td></tr>
</table>
</center>
</body></HTML>
