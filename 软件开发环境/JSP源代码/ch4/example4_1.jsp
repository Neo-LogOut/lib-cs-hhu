<%@ page contentType="text/html;charset=GB2312" %>
<HTML><body bgcolor=cyan><font size=3>
   <jsp:useBean id="circle" class="tom.jiafei.Circle" scope="page" />
   <%--通过上述JSP标记，用户获得了一个作用域是page，名字是circle的bean --%>
   <P>圆的初始半径是：<%=circle.getRadius()%>
   <% double newRadius =100;  
      circle.setRadius(newRadius);   //修改半径
   %>
   <P>修改半径为<%= newRadius %>
   <br><b>目前圆的半径是：<%=circle.getRadius()%>
   <br><b>圆的周长是：<%=circle.circlLength()%>
   <br><b>圆的面积是：<%=circle.circleArea()%>
</font></body></HTML>
