<%@ page contentType="text/html;charset=gb2312" %>
<head> 
  <br>输入姓名：<a href="example3_15_a.jsp">确定姓名页面</a>
  <br>选择图书：<a href="example3_15_b.jsp">选择图书页面</a>
  <br>结账：    <a href="example3_15_c.jsp">结账页面</a> 
</head>
<HTML><body bgcolor=cyan><font size=3>
  <p>输入姓名
   <form action="" method=post name=form>
       <input type="text" name="name"> 
       <input type="submit" value="确定" name=submit>
  </form> 
  <%  String name=request.getParameter("name");
      if(name==null)
         name="";
      else
         session.setAttribute("name",name); //将名字存入用户的session中
  %> 
</font></body></HTML>
