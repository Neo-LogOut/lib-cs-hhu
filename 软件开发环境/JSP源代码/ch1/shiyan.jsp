<%@ page contentType="text/html;charset=GB231" %>
<HTML>
<BODY BGCOLOR=green>
<FONT Size=3>
<br> с╒ндвжд╦╠Мё╨<br>
    <%   char c ='A';
         for(c='A';c<='Z';c++) {
            out.print(" "+c);
            if(c=='M')
              out.print("<br>");
         }
    %>
</FONT></BODY></HTML>
