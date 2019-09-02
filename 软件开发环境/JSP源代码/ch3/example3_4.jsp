<%@ page contentType="text/html;charset=gb2312" %>
<%@ page import="java.util.*" %>
<MHML><body bgcolor=cyan><font size=2 >  
   <% String path=request.getServletPath();    //请求的页面
      String webDir = request.getContextPath();//获取当前Web服务目录的名称
      webDir = webDir.substring(1); //去掉名称前面的目录符号：/
      String  clientIP=request.getRemoteAddr();//用户的IP地址
      int serverPort=request.getServerPort(); // 服务器的端口号
    %> 
 用户请求的页面：<%=path %>
<br>Web服务目录的名字：<%=webDir %>
<br>用户的IP地址:<%=clientIP %>
<br>服务器的端口号:<%=serverPort %>
</font></body></HTML>

