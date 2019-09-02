<%@ page contentType="text/html;charset=gb2312" %>
<HTML><body bgcolor=yellow>
 <jsp:useBean id="boy" class="tom.jiafei.Circle" scope="application" />
  圆的初始半径是：<%=boy.getRadius()%>
  <% boy.setRadius(1000);
  %>
 <br><b>修改后的圆的半径是：<%=boy.getRadius()%>
</body></HTML>     
