<%@ page contentType="text/html;charset=gb2312" %>
<%@ page import="java.util.*" %>
<HTML><body bgcolor=cyan>
<P>现在的时间是：<BR>
<%   out.println(""+new Date());
     response.setHeader("Refresh","5");
 %>
</body></HTML>
