<%@ page contentType="text/html;charset=gb2312" %>
<HTML>
<body bgcolor=cyan><FONT size=4>
   <form  action="" method=post name=form>
      <input type="text" name="girl"> 
      <input type="submit" value="确定" name="submit">
   </form>  
   <%   String textContent=request.getParameter("girl");
        if(textContent==null) {
           textContent="0";
        }
        String []a = textContent.split("#");
        double sum=0;
        try {  
              for(String s:a) {
                 out.print(s+" ");
                 sum+=Double.parseDouble(s);
              } 
              out.print("<br>数字的和是"+sum);
        }
        catch(NumberFormatException e) {
           out.print("<BR>"+"请输入数字字符");
        }
    %>
</FONT></body></HTML>
