<%@ page contentType="text/html;charset=gb2312" %>
<HTML><body bgcolor=yellow><font size=2>
<%  Integer integer=(Integer)session.getAttribute("guess");
%>
<p><%= integer %>数大了，请再猜：
   <form action="example3_16_result.jsp" method="post" name=form >
       <input type="text" name="guess" > 
       <input type="submit" value="送出" name="submit">
   </form>
</font></body></HTML>
