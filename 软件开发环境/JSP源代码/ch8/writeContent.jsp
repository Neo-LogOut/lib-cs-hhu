<%@ page contentType="text/html;charset=gb2312" %>
 <jsp:useBean id="fileBean" class="mybean.data.Shiyan1_Bean" scope="request"/>
<HTML><body bgcolor=yellow>
<font size=2>
  <form action="writeFile" method=post>
     请选择一个目录：
     <Select name="fileDir" >
       <Option value="C:/1000">C:/1000
       <Option value="D:/2000">D:/2000
       <Option value="D:/1000">D:/1000
     </Select> 
  <br>输入保存文件的名字：<input type=text name="fileName" >
  <br>输入文件的内容：<BR>
   <TextArea name="fileContent" Rows="5" Cols="38"></TextArea>
  <br><input type=submit value="提交">
  </form> 
  <b>文件的位置: <jsp:getProperty name="fileBean" property="filePath"/>,
  文件的名字：<jsp:getProperty name="fileBean" property="fileName"/>,
  文件的长度：<jsp:getProperty name="fileBean" property="fileLength"/>字节。
</font>
</body></HTML>
