<%@ page contentType="text/html;charset=gb2312" %>
<HTML><body bgcolor=yellow>
 <% String sideA=request.getParameter("sizeA");
    String sideB=request.getParameter("sizeB");
    String sideC=request.getParameter("sizeC");
    try {  double a=Double.parseDouble(sideA);
           double b=Double.parseDouble(sideB);
           double c=Double.parseDouble(sideC);
           double p=(a+b+c)/2,area=0;
           area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
           out.println("<BR>三角形面积"+area);
    }
    catch(NumberFormatException ee){
          out.println("<BR>请输入数字字符");
    } 
 %>
</body></HTML>