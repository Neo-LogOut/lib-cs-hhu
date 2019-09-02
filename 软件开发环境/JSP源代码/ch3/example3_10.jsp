<%@ page contentType="text/html;charset=gb2312" %>
<HTML><body bgcolor=cyan><font size=3>
 <p>我正在学习response对象的
 <br>setContentType方法
 <p>将当前页面保存为word文档吗？
  <form action="" method="get" name=form>
     <input type="submit" value="yes" name="submit">
   </form>
 <% String str=request.getParameter("submit");
    if(str==null) {
       str="";
    }
    if(str.equals("yes")) {
       response.setContentType("application/msword;charset=gb2312");
    }
 %> 
</font></body></HTML>
