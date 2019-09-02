<%@ page contentType="text/html;charset=GB2312" %>
<HTML><body ><font size=3>
 <%--通过JSP标记，用户获得一个作用域是session，id是girl的bean: --%>
 <jsp:useBean id="girl" class="tom.jiafei.Circle" scope="session" />
  <i><br>这里是example4_2_b.jsp页面
  <br>当前圆的半径是： <%=girl.getRadius()%>
  <% girl.setRadius(99);
  %>
  <br>修改后的圆的半径是：<%=girl.getRadius()%></i>
  <a href="example4_2_a.jsp"><BR>example4_2_a.jsp</a>
</font></body></HTML>  
