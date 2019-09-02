<%@ page contentType="text/html;charset=GB2312" %>
<HTML><body  bgcolor=cyan><font size=3>
<%  int x=12,y=9;
%>
  计算表达式x+y+x%y,即<%=x%>+<%=y%>+<%=x%>%<%=y%>的值: 
  <%= x+y+x%y %>
<br>计算表达式x>y即<%=x%> > <%=y%>的值:
  <%= x>y %>
<br>计算表达式sin(<%=Math.PI %>/2)的值:
    <%= Math.sin(Math.PI/2)%>
<br> 
<%  if(x-y>=0) {
%>     如果<%=x%>大于<%=y%>计算<%=x%>与<%=y%>
       的差:<%=x-y%>的平方根：
       <%=Math.sqrt(x-y)%>
<%  }
%>
</font></body></HTML>
