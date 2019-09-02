<%@ page contentType="text/html;charset=gb2312" %>
<jsp:useBean id="count" class="red.star.ComputerCount" scope="session"/>
<HTML><body><font size=3>
<p> 网站的example4_10_b.jsp页面
   <br>您是第<jsp:getProperty name="count" property="number"/>             
      个访问者。<br>
   <a href="example4_10_a.jsp">欢迎去example4_10_a.jsp参观</a>
</body></HTML>
