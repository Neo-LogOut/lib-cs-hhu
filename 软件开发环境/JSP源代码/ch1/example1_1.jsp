<%@ page contentType="text/html;charset=GB2312" %>
<HTML><BODY BGCOLOR=cyan>
<h3>这是一个简单的JSP页面</h3>
  <% int i, sum=0;
     for(i=1;i<=100;i++){
       sum=sum+i;
     }
  %>
<h5>  1到100的连续和是：
 <%=sum %> 
</h5>
</BODY></HTML>    
