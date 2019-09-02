<%@ page contentType="text/html;charset=gb2312" %>
<jsp:useBean id="zhang" class="tom.jiafei.Student" scope="request"/>
<HTML><body bgcolor=pink><font size=3>
<jsp:setProperty name="zhang" property="name" value="张三"/>
<b> 学生姓名：<jsp:getProperty name="zhang" property="name"/></b>
<jsp:setProperty name="zhang" property="height" value="<%=1.78%>"/>
<br><b> 学生身高：<jsp:getProperty name="zhang" property="height"/>米</b>
</font></body></HTML>
