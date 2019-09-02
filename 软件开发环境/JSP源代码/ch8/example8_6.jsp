<%@ page contentType="text/html;charset=gb2312" %>
<%@ page import ="java.io.*" %>
 <jsp:useBean id="fileBean" class="mybean.data.Example8_6_Bean" scope="request"/>
<HTML><body>
 <P>选择要上传的文件：<BR>
 <form action="upFile" method="post" ENCTYPE="multipart/form-data">
      <input type=FILE name="boy" size="45"> 
      <br> <input type="submit" name ="boy" value="提交">
 </form>
 <br> 上传的文件名字：
 <jsp:getProperty name="fileBean" property="fileName"/> 
   <br> 上传反馈：
 <jsp:getProperty name="fileBean" property="mess"/>
 <%
    String name=fileBean.getFileName();
    boolean boo =name.endsWith(".jpg");
    boo = boo||name.endsWith(".gif");
    if(boo) {
 %>     <image src = "image/<%=name%>" width=200 height =200><%=name %></image>
 <% }
    else {
 %>     <%=name %>
 <% }
 %>
</body></HTML>
