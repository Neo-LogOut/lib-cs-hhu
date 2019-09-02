<%@ page contentType="text/html;charset=gb2312" %>
<jsp:useBean id="iPhone" class="tom.jiafei.Goods" scope="request"/>
<HTML><body bgcolor=yellow><font size=3>
  <form action="" Method="post" >
     手机名称:<input type=text name="name">
     <br>手机价格:<input type=text name="price">
     <br><input type=submit value="提交给本页面">
  </form>
   <form action="example4_5_b.jsp" Method="post" >
     手机名称:<input type=text name="name">
     <br>手机价格:<input type=text name="price">
     <br><input type=submit value="提交给example4_5_b.jsp页面">
  </form>
  <jsp:setProperty name="iPhone" property="name" param ="name" />
  <jsp:setProperty name="iPhone" property="price" param ="price"/>
  <br><b>名称：<jsp:getProperty name="iPhone" property="name"/>
  <br><b>价格：<jsp:getProperty name="iPhone" property="price"/>
</font></body></HTML>
