<%@ page contentType="text/html;charset=gb2312" %>
<HTML><body  bgcolor=#DDEEFF> 
 <% String name=request.getParameter("name");
      if(name==null||name.length()==0) {
         response.sendRedirect("example3_12.jsp"); 
      }
      byte [] b = name.getBytes("iso-8859-1");
      name = new String(b);
 %>
    <b>»¶Ó­<%= name %>À´µ½±¾ÍøÒ³¡£
</body></HTML>
