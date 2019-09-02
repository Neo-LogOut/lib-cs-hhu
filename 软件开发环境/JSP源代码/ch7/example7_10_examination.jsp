<%@ page contentType="text/html;charset=gb2312" %>
<jsp:useBean id="testBean" 
     class="mybean.data.Example7_10_Bean" scope="session"/>
<HTML><body bgcolor=#DEEFF9><font size=2>
  <br><b> <jsp:getProperty name="testBean" property="questions"/></b>
  <br> <br><jsp:getProperty name="testBean" property="choiceA"/>
  <br> <br><jsp:getProperty name="testBean" property="choiceB"/>
  <br> <br><jsp:getProperty name="testBean" property="choiceC"/>
  <br> <br><jsp:getProperty name="testBean" property="choiceD"/> 
  <% String pic=testBean.getImage();
     if(pic!=null&&pic.length()>=1) { 
  %>  <br> <image src =image/<%=pic%> width=100 height=60></image>
  <% }
  %>   
  <br>
  <% String studentAnswer = request.getParameter("R");  
     if(studentAnswer!=null&&studentAnswer.length()>=1){
         testBean.setAnswer(studentAnswer.trim());
     }
  %>
   <b>   目前分数： <jsp:getProperty name="testBean" property="score"/>,
   消息： <jsp:getProperty name="testBean" property="mess"/><br>
 <form action="" method=post name=form>
   <br>选择:<input type="radio" name="R" value=A>A 
            <input type="radio" name="R" value=B>B
            <input type="radio" name="R" value=C>C
            <input type="radio" name="R" value=D>D
   <br><input type="submit" value="确认(再读取下一题之前，可反复确认)" name="submit">
 </form>
 <b>你目前给出的选择是<%=studentAnswer %>
 <form action="readTestServlet" method=post name=form>
   <br><input type= "hidden" 
        value="<%=testBean.getId()%>" name ="id">
     <br><input type="submit" value="下一题" name="submit">
 </form> 
 <form action="endTestServlet" method=post name=form>
    <input type="submit" value="交卷" name="submit">
 </form> 
</font></body></HTML> 
