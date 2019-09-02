<%@ page contentType="text/html;charset=gb2312" %>
<HTML><body bgcolor=cyan><font size=2>
    <form action="example3_5_receive.jsp" method=post name=form>
      <br>背景音乐:<input type="radio" name="R" value="on" >打开 
          <input type="radio" name="R" value="off" checked="default">关闭 
      <br>喜欢的球队: 
          <input type="checkbox" name="item" value="国际米兰队" >国际米兰队
          <input type="checkbox" name="item" value="AC米兰队" >AC米兰队
      <br><input type="checkbox" name="item" value="罗马队" >罗马队
          <input type="checkbox" name="item" value="慕尼黑队" >慕尼黑队
          <input type="hidden" value="我是球迷,但不会踢球" name="secret">
      <br><input type="submit" value="提交" name="submit">
          <input type="reset" value="重置" >
   </form> 
</font></body></HTML>
