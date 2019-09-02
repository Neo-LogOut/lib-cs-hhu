<%@ page contentType="text/html;charset=gb2312" %>
<%! public String handleStr(String s) {
       try {  byte [] bb= s.getBytes("iso-8859-1");
              s = new String(bb);
       }
       catch(Exception exp){}
       return s;
    }
%>
  <%   String music = request.getParameter("music");
       String pic = request.getParameter("pic");
       if(music==null) music = "";
       if(pic==null)   pic = "";
       music = handleStr(music);
       pic   = handleStr(pic); 
  %>
 
<HTML><center>
   <body background="image/<%= pic %>"><font size=2 >
   <bgsound src = "sound/<%=music %>" loop = -1/>  
   <form action="" method=post name=form>
   <b>选择背景音乐:<br>
       <select name="music" >
          <Option selected value="back1.mp3">绿岛小夜曲
          <Option value="back2.mp3">我是一片云
          <Option value="back3.mp3">红河谷
       </select> 
   <br><b>选择背景图像:<br>
       <select name="pic" size = 2>
          <option value="back1.jpg">荷花图
          <option value="back2.jpg">玫瑰图
          <option value="back3.jpg">校园图
       </select> <br>
     <input type="submit" value="提交" name="submit">
   </form> 
</font></body></Center></HTML>
