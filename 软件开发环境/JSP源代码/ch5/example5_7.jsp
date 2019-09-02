<%@ page contentType="text/html;charset=gb2312" %>
<HTML><body bgcolor=#EEFFDD ><font size=3>
<% session.setAttribute("message","请您猜字母");
   char a[]=new char[26];
   int m=0;
   for(char c='a';c<='z';c++) {
      a[m]=c;
      m++;
   }
   int randomIndex=(int)(Math.random()*a.length);      
   char ch=a[randomIndex];     //获取一个英文字母
   session.setAttribute("savedLetter",new Character(ch));//将该字母放入session中
%>
访问或刷新该页面可以随机得到一个英文字母.
<BR>单击超链接去猜出这个字母:<a href="example5_7_input.jsp">去猜字母</a>
</font></body></HTML>
