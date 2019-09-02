<%@ page contentType="text/html;charset=GB2312" %>
<%@ page import="mybean.data.Register"%> 
<jsp:useBean id="register" type="mybean.data.Register" scope="request"/>
<HEAD><%@ include file="head.txt" %></HEAD>
<HTML><BODY bgcolor=cyan >
<CENTER>
  <Font size=4 color=blue>
    <BR><jsp:getProperty name="register"  property="backNews"/>
  </Font> 
<table>
 <tr><td>注册的会员名称: </td>
     <td><jsp:getProperty name="register" property="logname"/></td>
 </tr>
 <tr><td>注册的电子邮件:</td>
     <td><jsp:getProperty name="register" property="email"/></td>
 </tr>
 <tr><td>注册的联系电话:</td>
     <td><jsp:getProperty name="register" property="phone"/></td>
 </tr>
</table>
 <table><tr><td>您的简历和交友标准：</td></tr>
   <tr><td><TextArea name="message" Rows="6" Cols="30">
       <jsp:getProperty name="register" property="message"/>
       </TextArea>
       </td>
   </tr>
</table>
</CENTER>
</BODY>
</HTML>
