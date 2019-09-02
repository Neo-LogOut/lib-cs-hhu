<%@ page contentType="text/html;charset=GB2312" %>
<%@ page import="java.io.*"%> 
<HTML><body bgcolor=cyan><font Size=2>
<%  String jspPage=request.getServletPath();    //请求的页面的名称
    String webDir = request.getContextPath();//获取当前Web服务目录的名称
    webDir = webDir.substring(1); //去掉名称前面的目录符号：/
    jspPage =jspPage.substring(1); //去掉名称前面的目录符号：/
    File f= new File(""); //该文件认为在Tomcat引擎启动的目录中，即bin目录中
    String path = f.getAbsolutePath();
    int index = path.indexOf("bin");
    String tomcatDir = path.substring(0,index);//tomcat的安装目录
    File file=new File(tomcatDir+"/webapps/"+webDir,jspPage);
  %>
  文件<%=file.getName()%>是可读的吗？<b><%=file.canRead()%></b>
 <br>文件<%=file.getName()%>的长度：<b><%=file.length()%>字节</b>
 <br><%=file.getName()%>的父目录是:<br><b><%=file.getParent()%></b>
 <br> <%=file.getName()%>的绝对路径是：<br><b><%=file.getAbsolutePath()%>
</font></body></HTML>
