<%@ page contentType="text/html;charset=gb2312" %>
<jsp:useBean id="digitBean" 
             class="mybean.data.Example6_2_Bean" scope="session"/>
<HTML><body bgcolor=#EFDDFA><font size=2>
  <form action="compute" method=post name=form>
   <table>
   <tr><td> 输入两个数:</td>
       <td> <input type=text name="numberOne" value=0 size=6></td>
     <td> <input type=text name="numberTwo" value=0 size=6></td>
   </tr>
   <tr><td>选择运算符号:</td>
       <td> <select name="operator">
              <option value="+">+(加)
              <option value="-">-（减）
              <option value="*">*（乘）
              <option value="/">/（除）
            </select> 
       </td>
       <td> <input type="submit" value="提交" name="sub"></td>
   </tr>
   </table>
   </form> 
    运算结果：
  <jsp:getProperty name="digitBean" property="numberOne"/>
  <jsp:getProperty name="digitBean" property="operator"/>
  <jsp:getProperty name="digitBean" property="numberTwo"/> =
  <jsp:getProperty name="digitBean" property="result"/> 
</font></body></HTML>
