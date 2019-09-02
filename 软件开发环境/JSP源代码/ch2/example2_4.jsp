<%@ page contentType="text/html;charset=gb2312" %>
<HTML><body>
    <%! int count=0;                    //被用户共享的count
        synchronized void setCount() {  //synchronized修饰的方法
           count++;
        }
    %>
    <%  setCount();
        out.println("您是第"+count+"个访问本站的客户");   
    %>
</body></HTML>
