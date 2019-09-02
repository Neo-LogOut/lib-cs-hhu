<%@ page contentType="text/html;charset=gb2312" %>
<HTML>
<body bgcolor=cyan><font size=3>
   <form  action="" method=post name=form>
      <input type="text" name="information_fees" size=50> 
      <input type="submit" value="确定" name="submit">
   </form>  
   <%   request.setCharacterEncoding("gb2312");
        String information_fees=request.getParameter("information_fees");
        double number=0;
        if(information_fees==null) {
           information_fees="";
        }
    %>  <b> 账单内容:<br><%= information_fees %><br>
    <%  String []a = information_fees.split("[^0123456789.]");
        double sum=0;
        for(String s:a) {
           try {
             sum+=Double.parseDouble(s);
           }
           catch(NumberFormatException exp){} 
        }
    %> <b> 账单总消费额:<%= sum %> 
</font></body></HTML> 
