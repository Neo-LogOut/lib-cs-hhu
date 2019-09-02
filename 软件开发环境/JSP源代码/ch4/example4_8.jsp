<%@ page contentType="text/html;charset=gb2312" %>
<jsp:useBean id="computer" class="red.star.ComputerBean" scope="session"/>
<HTML><body bgcolor=yellow><font size=2>
  <jsp:setProperty name="computer" property="*"/>
  <form action="" method=post name=form>
    <input type=text name="numberOne" size=6>
          <select name="operator" >
           <option value="+">+
           <option value="-">-
           <option value="*">*
           <option value="/">/
          </select> 
    <input type=text name="numberTwo" size=6>
    <br> <input type="submit" value="Ìá½»" name="submit">
  </form> 
  <b>
  <jsp:getProperty name="computer" property="numberOne"/> 
  <jsp:getProperty name="computer" property="operator"/>  
  <jsp:getProperty name="computer" property="numberTwo"/> =
  <jsp:getProperty name="computer" property="result"/>  </b>
</font></body></HTML>
