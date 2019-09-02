<%@ page contentType="text/html;charset=gb2312" %>
<%! public String handleStr(String s) {
       try {  byte [] bb= s.getBytes("iso-8859-1");
              s = new String(bb);
       }
       catch(Exception exp){}
       return s;
    }
%>
<HTML><body><font size=2>
   <%  
       String onOrOff=request.getParameter("R");             //获取radio提交的值
       String secretMess=request.getParameter("secret");     //获取hidden提交的值
       String itemName[]=request.getParameterValues("item"); //获取checkbox提交的值
       out.println("<p> 是否打开背景音乐:"+onOrOff);
       out.println("<p> 您喜欢的球队:");
       if(itemName==null) {
          out.print("一个都不喜欢");
       } 
       else {
         for(int k=0;k<itemName.length;k++) {
           out.println(" "+handleStr(itemName[k]));
         }
       }
       out.println("<P> 你提交的隐藏信息:"+handleStr(secretMess));
       if(onOrOff.equals("on")) {
   %>    <bgsound src='sound/back.mp3' loop ="-1"/>
   <%  } 
   %>
</font></body></HTML>
