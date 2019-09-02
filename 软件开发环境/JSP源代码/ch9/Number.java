package sun.yourservlet;
import java.io.*;
import org.w3c.dom.*; 
import javax.xml.parsers.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Number extends HttpServlet
{  public void init(ServletConfig config) throws ServletException
    {super.init(config);
    }
   public  void  doPost(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException
    {  boolean boo=false;
       response.setContentType("text/html;charset=GB2312");
       PrintWriter out=response.getWriter();
       out.println("<html><body>");
       String searchedNumber=request.getParameter("studentNmber");
try{   DocumentBuilderFactory  factory=DocumentBuilderFactory. newInstance();
       DocumentBuilder  builder= factory.newDocumentBuilder();
       Document  document= builder. parse(new File("D:\\1000\\Score.xml")) ;
      Element root=document.getDocumentElement() ;  //获取根节点
        //返回根节点的Element子节点，这些子节点对应着XML文件中的“学号"标记：
        NodeList  elemnetNodes=root.getElementsByTagName("学号") ; 
       int size=elemnetNodes.getLength();
       for(int k=0;k<size;k++)
        { Node node=elemnetNodes.item(k);
          if(node.getNodeType()==Node.ELEMENT_NODE) //判断node节点的类型
           { //再得到node节点的number属性的值：
             String stuNumber=((Element)node).getAttribute("number");//获取学号
             if(stuNumber.equals(searchedNumber))
             { boo=true;
               NodeList childNodes=node.getChildNodes();//获取node的全部子节点
               for(int i=0;k<childNodes.getLength();i++)
               { Node child=childNodes.item(i);
                 if(child.getNodeType()==Node.ELEMENT_NODE)
                  {  String nodeName=((Element)child).getTagName().trim();
                     out.println("<BR>"+nodeName);
                     String courseType=((Element)child).getAttribute("课程性质");
                     String contentStr=((Element)child).getTextContent();
                     if(nodeName.startsWith("姓名"))
                       out.println("："+contentStr);   
                     else
                        out.println("("+courseType+") ："+contentStr);  
                      }
                    }
                }
             }
        }
       if(boo==false)
          out.println("不存在您要查询的学号！");      
      }
    catch(Exception ee)
     {}
    out.println("</body></html>");
   } 
   public  void  doGet(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException
   { doPost(request,response);
   }
}
