<%@ page contentType="text/html;charset=gb2312" %>
<jsp:useBean id="testtBean" 
     class="mybean.data.Example7_10_Bean" scope="session"/>
<HTML><body bgcolor=#DEEFF9><font size=2>
      <jsp:getProperty name="testBean" property="score"/>
      <jsp:getProperty name="testBean" property="mess"/>
  <br> <jsp:getProperty name="testBean" property="content"/>
  <br> A.<br><jsp:getProperty name="testBean" property="choiceA"/>
  <br> B.<br><jsp:getProperty name="testBean" property="choiceB"/>
  <br> C.<br><jsp:getProperty name="testBean" property="choiceC"/>
  <br> D.<br><jsp:getProperty name="testBean" property="choiceD"/>
  <br>
 <form action="scoreBean" method=post name=form>
      <br>选择:<input type="radio" name="R" >A 
               <input type="radio" name="R" >B
               <input type="radio" name="R" >C
               <input type="radio" name="R" >D
      <br><input type="submit" value="提交" name="submit">
 </form>
 <form action="testBean" method=post name=form>
     <br><input type="hiddent" value="<%session.getAttribute("xuehao")%>" name ="number">
     <br><input type="submit" value="下一题" name="submit">
 </form> 
 <form action="testBean" method=post name=form>
     <br><input type="hiddent" value="<%session.getAttribute("xuehao")%>" name ="number">
     <br><input type="submit" value="交卷" name="submit">
 </form>  

</font></body></HTML> 
