<%@ page contentType="text/html;charset=GB2312" %>
<HEAD><%@ include file="head.txt" %></HEAD>
<HTML><BODY bgcolor=pink><CENTER> 
<Font size=2>
<FORM action="helpModifyMess" name=form method =post>
<table>
   <tr>
       <td>新联系电话:</td>
       <td><Input type=text name="newPhone"></td>
   </tr>
   <tr>
       <td>新电子邮件:</td>
       <td><Input type=text name="newEmail"></td>
   </tr>  
  </table>
  <table>
   <tr>
        <td>新简历和交友标准：</td>
  </tr>
  <tr>
      <td><TextArea name="newMessage" Rows="6" Cols="30">
          </TextArea>
     </td>
  </tr>
   <tr>
      <td><Input type=submit name="g" value="提交修改"></td>
   </tr>
   <tr>
      <td><Input type=reset value="重置"></td>
   </tr>
 </table><Font></CENTER>
</BODY>
</HTML>
