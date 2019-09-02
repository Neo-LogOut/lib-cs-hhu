<%@ page contentType="text/html;charset=gb2312" %>
<HTML><body bgcolor=yellow ><font size=2>
<form action="sumORproduct" method=post>
  输入数字，用逗号分隔提交给servlet(post方式)：
  <br><input type=text name="number">
  <input type=submit value="提交">
</form>
<form action="sumORproduct" method=get>
   输入数字，用逗号分隔提交给servlet(get方式)：
  <br><input type=text name="number">
  <input type=submit value="提交">
</form>
</body></HTML>
