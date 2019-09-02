<%@ page contentType="text/html;charset=gb2312" %>
<HTML><body bgcolor=pink ><font size=2>
<form action="insertServlet?dataBase=warehouse&tableName=product" method=post>
添加新记录:
<table border=1>
<tr><td> 产品号：</td><td><Input type="text" name="number"></td></tr>
<tr><td>名称：</td><td><Input type="text" name="name"></td></tr>
<tr><td>生产日期：</td><td><Input type="text" name="madeTime"></td></tr>
<tr><td>价格：</td><td><Input type="text" name="price"></td></tr>
</table>
<br><input type="submit" name="b" value="提交">
</font></body></HTML>
