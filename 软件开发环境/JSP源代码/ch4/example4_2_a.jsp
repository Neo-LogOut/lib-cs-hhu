<%@ page contentType="text/html;charset=GB2312" %>
<HTML><body bgcolor=cyan><font size=3>
   <%--通过JSP标记，用户获得一个作用域是session，id是girl的bean: --%>
   <jsp:useBean id="girl" class="tom.jiafei.Circle" scope="session" />
 <br>这里是example4_2_a.jsp页面
 <br>圆的半径是： <%=girl.getRadius()%>
 <a href="example4_2_b.jsp"><br>example4_2_b.jsp </a>
</font></body></HTML> 
