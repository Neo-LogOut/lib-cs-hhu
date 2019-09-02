<%@ page contentType="text/html;charset=gb2312" %>
 <jsp:useBean id="fileBean" type="mybean.data.Example8_4_Bean" scope="request"/>
<HTML><body bgcolor=#EEFFAE><font size=2>
  文件的位置: <jsp:getProperty name="fileBean" property="filePath"/>,
  文件的名字：<jsp:getProperty name="fileBean" property="fileName"/>,
  文件的长度：<jsp:getProperty name="fileBean" property="fileLength"/> 字节。
  <br>文件的内容：
  <br><TextArea  rows="6" cols="60">
       <jsp:getProperty name="fileBean" property="fileContent"/>
     </TextArea>
</font></body></HTML>
