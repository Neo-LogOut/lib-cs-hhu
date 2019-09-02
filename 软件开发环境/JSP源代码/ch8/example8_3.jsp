<%@ page contentType="text/html;charset=GB2312" %>
<%@ page import="java.io.*"%> 
<%! class FileJSP implements FilenameFilter{ 
       String str=null;
       FileJSP(String s){
          str="."+s;
       }
       public boolean accept(File dir,String name){
          return name.endsWith(str);
       }              
    }
%>
<HTML><body bgcolor=#EEFFAD><font Size=2>
<% 
    String name="jsp";
    String webDir = request.getContextPath();
    webDir = webDir.substring(1); 
    File f= new File(""); 
    String path = f.getAbsolutePath();
    int index = path.indexOf("bin");
    String tomcatDir = path.substring(0,index);//tomcat的安装目录
    File dir=new File(tomcatDir+"/webapps/"+webDir);
%>
 <br> 在<%=dir%>下<%=name%>文件：
<%
    FileJSP file_jsp=new FileJSP(name);
    String file_name[]=dir.list(file_jsp);
    for(int i=0;i<file_name.length;i++)
       out.print("<br>"+file_name[i]);
%>
</font></body></HTML>
