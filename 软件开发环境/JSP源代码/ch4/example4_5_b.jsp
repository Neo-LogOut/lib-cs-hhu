<%@ page contentType="text/html;charset=gb2312" %>
<jsp:useBean id="iPhone" class="tom.jiafei.Goods" scope="request"/>
<HTML><body bgcolor=cyan><font size=3>
  <jsp:setProperty name="iPhone" property="name" param ="name" />
  <jsp:setProperty name="iPhone" property="price" param ="price"/>
  <br><b>Ãû³Æ£º<jsp:getProperty name="iPhone" property="name"/>
  <br><b>¼Û¸ñ£º<jsp:getProperty name="iPhone" property="price"/>
</font></body></HTML>