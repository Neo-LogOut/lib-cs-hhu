<%@ page contentType="text/html;charset=GB2312" %>
<HEAD><%@ include file="head.txt" %></HEAD>
<HTML>
<BODY bgcolor=yellow>
<Font size=2 color=blue>
<CENTER>
 <BR>文件将被上传到 Web服务目录mkfrend的子目录image中。
 <BR>选择要上传的图像照片文件(名字不可以含有非ASCII码字符，比如汉字等)：
  <FORM action="helpUpload" method="post" ENCTYPE="multipart/form-data">
      <INPUT type=FILE name="fileName" size="40"> 
      <BR><INPUT type="submit" name ="g" value="提交">
 </FORM>
</CENTER>
</Font>
</BODY>
</HTML>

