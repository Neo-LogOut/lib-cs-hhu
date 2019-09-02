<%@ page contentType="text/html;charset=gb2312" %>
<jsp:useBean id="play" class="red.star.Play" scope="session" />
 <%
    String webDir = request.getContextPath();//获取当前Web服务目录的名称
    webDir = webDir.substring(1); //去掉名称前面的目录符号：/
 %>
    <jsp:setProperty  name="play" property="webDir" value="<%= webDir %>"/> 
    <jsp:setProperty  name="play" property="imageNumber" param="imageNumber"/>
<HTML><body bgcolor=cyan><font size=2>
    <image src = image/<jsp:getProperty  name="play" property="playImage"/>
     width =120 height =90><br>这是当前显示的图像</image> 
    <br>单击"上一张"或"下一张"按钮浏览图像
    <form action="" method=post>
      <input type=submit name="ok" value="上一张">
      <input type="hidden" name="imageNumber" value="<%=play.getImageNumber()-1%>">
    </form>
    <form action="" method=post>
      <input type=submit name="ok" value="下一张">
      <input type="hidden" name="imageNumber" value="<%=play.getImageNumber()+1 %>">
    </form>
</font></body></HTML>
