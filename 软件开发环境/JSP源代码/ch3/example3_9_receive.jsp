<%@ page contentType="text/html;charset=gb2312" %>
<HTML><body bgcolor=#EEEEFF> 
  <%  String id = request.getParameter("id");
      String price = request.getParameter("price");
  %>
  <b>商品编号:<%= id %><br>
     商品价格:<%= price %>
</body></HTML>
