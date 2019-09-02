<%@ page contentType="text/html;charset=gb2312" %>
<HTML><body bgcolor=#EEDDEE><font Size=2>
<p>随机分给了一个1到100之间的数，请猜！
  <%  int number=(int)(Math.random()*100)+1;
      session.setAttribute("count",new Integer(0));
      session.setAttribute("save",new Integer(number));
  %>
<br>输入猜测:
   <form action="example3_16_result.jsp" method="post" name=form>
       <input type="text" name="guess" > 
       <input type="submit" value="送出" name="submit">
   </form>
</font></body></HTML>
