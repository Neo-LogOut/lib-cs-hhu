<%@ page contentType="text/html;charset=gb2312" %>
<jsp:useBean id="testBean" 
     class="mybean.data.Example7_10_Bean" scope="session"/>
<HTML><body bgcolor=#EAFFCF><font size=2>
<jsp:setProperty name="testBean" property="score" value="0"/>
<jsp:setProperty name="testBean" property="number" value="0"/>
<h2> 考题数量是<jsp:getProperty name="testBean" property="testAmount"/>
<form action="readTestServlet?amount=3"  method="post" >
   <br>输入考号<input type=text name="id" value =-1 size=16 >
   <br><input type=submit name="sub" value="开始考试">
</form>
</font></body></HTML> 
