<%@ page contentType="text/html;charset=gb2312" %>
<head> 
  <br>输入姓名：<a href="example3_15_a.jsp">确定姓名页面</a>
  <br>选择图书：<a href="example3_15_b.jsp">选择图书页面</a>
  <br>结账：    <a href="example3_15_c.jsp">结账页面</a> 
</head>
<HTML><body bgcolor=cyan><font size=2>
 <p>选择购买的书籍：
   <form action="" method=post name=form>
       <input type="checkbox" name="choice" value="Java教程32.5圆" >Java教程32.5圆
       <input type="checkbox" name="choice" value="数据库原理23圆" >数据库原理23圆
   <br><input type="checkbox" name="choice" value="操作系统35圆" >操作系统35圆
       <input type="checkbox" name="choice" value="C语言教程28.6圆" >C语言教程28.6圆
       <br><input type="submit" value="提交" name="submit">
  </form> 
  <%  String book[]=request.getParameterValues("choice"); 
      if(book!=null) {
         StringBuffer str = new StringBuffer();
         for(int k=0;k<book.length;k++) {
            str.append(book[k]+"<br>");
         }
         session.setAttribute("book",str);//将书籍放入用户的session中
      }
  %> 
 </font></body></HTML>
