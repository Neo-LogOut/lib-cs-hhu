<%@ page contentType="text/html;charset=gb2312" %>
<%! public String handleStr(String s) {
       try {  byte [] bb= s.getBytes("iso-8859-1");
              s = new String(bb);
       }
       catch(Exception exp){}
       return s;
    }
%>
  <%   String vedio = request.getParameter("vedio");
       if(vedio==null)   vedio = "";
       vedio = handleStr(vedio);
  %>
<HTML><center>
   <form action="" method=post name=form>
   <b>选择视频:<br>
       <select name=vedio  >
          <option value="我的祖国.avi">我的祖国
          <option value="梦幻.avi">梦幻
          <option value="夕阳山顶.avi" selected>夕阳山顶
       </select> 
      <input type="submit" value="提交" name="submit">
   </form> 
   <image src="image/flower.jpg" width=120 height=90></image><!-- 图像 -->
   <embed src="avi/<%=vedio %>" width=300 height=180 >视频</embed><!-- 视频 -->
</font></body></Center></HTML>
