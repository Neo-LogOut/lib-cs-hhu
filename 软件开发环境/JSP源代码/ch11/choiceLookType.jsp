<%@ page contentType="text/html;charset=GB2312" %>
<HEAD><%@ include file="head.txt" %></HEAD>
<HTML>
<BODY bgcolor=cyan><center><Font size=3>
    <table>
    <FORM action="helpShowMember" method="post" name="form">
     <BR>分页显示全体会员
      <INPUT type="hidden" value="1" name="showPage" size=6> 
    <INPUT type="submit" value="显示" name="submit"> 
    </Form>
   <FORM action="helpShowMember" method="get" name="form">
     <br>输入要查找的会员名：
     <INPUT type="text"  name="logname" size=6> 
     <INPUT type="submit" value="显示" name="submit">
    </FORM>
 </BODY>
</HTML>
