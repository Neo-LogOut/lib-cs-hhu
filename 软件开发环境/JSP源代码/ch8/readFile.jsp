<%@ page contentType="text/html;charset=gb2312" %>
<HTML><body bgcolor=cyan><font size=2>
 <jsp:useBean id="fileBean" class="mybean.data.Shiyan2_Bean" scope="request"/>
 <form action="readFileByLine" method="post" name="form">
 输入文件的路径(如:d:/2000):
 <input type="text" name="filePath" size=12>
 <br>输入文件的名字(如:Hello.java):
 <input type="text" name="fileName" size=9>
 <br><input type="submit" value="读取" name="submit">
 </form>
 <b><br>读入的内容:<br>
 <br> <%= fileBean.getContent() %>
 </b>   
 </font></body></HTML>
