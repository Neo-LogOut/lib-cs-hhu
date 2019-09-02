<%@ page contentType="text/html;charset=gb2312" %>
<%@ page import="java.util.*" %>
<head> 
  <br>输入姓名：<a href="example3_15_a.jsp">确定姓名页面</a>
  <br>选择图书：<a href="example3_15_b.jsp">选择图书页面</a>
  <br>结账：    <a href="example3_15_c.jsp">结账页面</a> 
</head>
<%! public String handleStr(String s) {
       try {  byte [] bb= s.getBytes("iso-8859-1");
              s = new String(bb);
       }
       catch(Exception exp){}
       return s;
    }
%>
<HTML><body bgcolor=#EEEEFF><font size=2>
<%  String personName=(String)session.getAttribute("name");
    StringBuffer bookMess=null;
    if(personName==null||personName.length()== 0) {
      out.println("到输入名字页面输入姓名"); 
    }
    else {
       bookMess = (StringBuffer)session.getAttribute("book");
    }
 %>
 <%  String buyBook=new String(bookMess);
     double sum =0;
     String [] price =buyBook.split("[^0123456789.]");
     if(price!=null) {
       for(String item:price)
         try {  sum+=Double.parseDouble(item);
         }
         catch(NumberFormatException exp){}
     }
 %><br><%=handleStr(personName) %>购书信息：<br>
   <%= handleStr(buyBook) %> <br>
   总价格：<%= sum %>
</FONT></body></HTML>
