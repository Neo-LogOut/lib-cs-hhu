<%@ page contentType="text/html;charset=gb2312" %>
<HTML><body>
<h1> 产生一个1-10之间的随机数
<%  double i=(int)(Math.random()*10)+1;
    if(i<=5) {
%>       <jsp:forward page="example2_12_a.jsp" >
            <jsp:param name="number" value="<%= i %>" />
         </jsp:forward> 
<%  }
    else {
 %>     <jsp:forward page="example2_12_b.jsp" >
           <jsp:param name="number" value="<%= i %>" />
        </jsp:forward> 
 <% }
 %>
</body></HTML>
