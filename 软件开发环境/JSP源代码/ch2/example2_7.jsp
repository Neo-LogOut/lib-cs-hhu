<%@ page contentType="text/html;charset=GB2312" %>
<HTML><body>
  <!-- 以下字体的颜色为蓝色 -->
  <FONT size=3 color=blue>抽取字符串"C:\myfile\jspfile\example.jsp"中的"example.jsp" 
</FONT>
   <%-- 下面是成员变量的声明 --%>
  <%!  String s="C:\\myfile\\jspfile\\example.jsp";
  %>
  <%-- 下面是Java程序片 --%>
  <%  int index=s.lastIndexOf("\\"); 
      String str=s.substring(index+1);
  %>
  <BR><%-- 下面是Java表达式 --%> 
  <%= str %>
</body></HTML>  
