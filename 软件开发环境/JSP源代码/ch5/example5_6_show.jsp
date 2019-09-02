<%@ page contentType="text/html;charset=gb2312" %>
<HTML><body bgcolor=pink><font size=2>
 尽管example5_6.jsp它没有直接请求我<br>
 我能获得example5_6.jsp提交的非负数，
 <br>但不能获得example5_6.jsp提交的负数。
 <%
     String number= request.getParameter("number");
 %>
 <b><br>用户在example5_6.jsp输入的非负数是<%= number%>  
</body></HTML>
