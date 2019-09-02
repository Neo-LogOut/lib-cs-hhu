<%@ page contentType="text/html;charset=GB2312" %>
<%@ page import="moon.yourbean.*"%> 
<jsp:useBean id="ok" class="moon.yourbean.SAXBean" scope="page"/>
<jsp:setProperty name="ok" property="stationName" param="stationName"/>
<jsp:setProperty name="ok" property="startOrArrive" param="startOrArrive"/>
<HTML><BODY bgcolor=cyan><Font size=2>
 <FORM action="" Method="post" >
    选择站名:
    <Select name="stationName">
           <Option value="北京西站">北京西站
           <Option value="广东站">广东站
    </Select> 
   选择始发或终到：
  <INPUT type="radio" name="startOrArrive" value="始发列车" checked="default">始发列车 
  <INPUT type="radio" name="startOrArrive" value="终到列车">终到列车
  <BR> <Input type=submit value="提交">
 </FORM>
 <jsp:getProperty name="ok" property="stationName"/>,
<jsp:getProperty name="ok" property="startOrArrive"/>:
<jsp:getProperty name="ok" property="trainMessages"/>
</FONT></BODY></HTML>
