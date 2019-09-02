<%@ page contentType="text/html;charset=gb2312" %>
<HTML><body ><font size=2>
<%  String message=(String)session.getAttribute("message"); //获取会话中的信息
%>
<table border=1>
<form action="guess" method=post>
 <tr><td> 输入您的猜测（a~z之间的字母）:</td>
 <td><input Type=text name=clientGuessLetter size=4>
     <input Type=submit value="提交"></td>
 </tr><td> 提示信息:</td>
      <td> <%= message%></td>
</form>
<form action="getLetter.jsp" method=post>
  <tr><td>单击按钮重新开始: </td>
      <td><Input Type=submit value="随机得到一个字母"></td>
  </tr>
</form>
</font></body></HTML>
