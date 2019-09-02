package moon.yourbean;
import javax.xml.parsers.*;
import org.xml.sax.helpers.*;
import org.xml.sax.*;
public class SAXBean
{  String stationName="北京西站";                     //站名
   String startOrArrive="" ;                         //始发或终到
   StringBuffer trainMessages=new StringBuffer();    //信息
   SAXParserFactory factory=null;
   SAXParser saxParser=null;  //解析器
   MyHandler handler;         //事件处理器
   public void setStationName(String s)
    {  stationName=s.trim();
       try{ byte b[]=stationName.getBytes("ISO-8859-1");
            stationName=new String(b);
          }
       catch(Exception ee){} 
    }
   public String getStationName()
    {  return  stationName;
    }
   public void setStartOrArrive(String s)
    {  startOrArrive=s.trim();
       try{ byte b[]=startOrArrive.getBytes("ISO-8859-1");
            startOrArrive=new String(b);
          }
       catch(Exception ee){} 
    }
   public String getStartOrArrive()
    {  return  startOrArrive;
    }
  public StringBuffer getTrainMessages()
   { try{  factory=SAXParserFactory.newInstance() ;
           saxParser=factory.newSAXParser();
           handler=new MyHandler(trainMessages,stationName,startOrArrive); 
           saxParser.parse("D:/1000/trainList.xml",handler);
        }
     catch(Exception e){ System.out.println(e);} 
     return trainMessages;
   }
}
class MyHandler extends DefaultHandler
{  StringBuffer trainMessages;
   String stationName,startOrArrive;
   boolean 站名标记=false,始发或终到标记=false;
   MyHandler(StringBuffer mess,String sName,String startOrArr)
   {  trainMessages=mess;
      stationName=sName;
      startOrArrive=startOrArr; 
   }
  public void startDocument() 
   {  trainMessages.append("<table border=2> ");
      trainMessages.append("<tr>");
        trainMessages.append("<th>车次名字</th>");
        trainMessages.append("<th>运行区间</th>");
        trainMessages.append("<th>始发时间</th>");
        trainMessages.append("<th>终到时间</th>");
      trainMessages.append("</tr>");
   }
   public void endDocument() 
   {  trainMessages.append("</table> ");
   }
  public void startElement(String uri,String localName,
                           String qName,Attributes atts)
   {  qName=qName.trim();
      if(qName.equals(stationName))
      {  站名标记=true;
         trainMessages.append(" "+qName);
      }
      if(qName.equals(startOrArrive))
      {  始发或终到标记=true;
      }
      if(qName.endsWith("车次"))
      {  trainMessages.append("<tr>");
      }
    
   }
   public void endElement(String uri,String localName,String qName)
   {
     if(qName.startsWith(stationName))
      {  站名标记=false;
      }
      if(qName.startsWith(startOrArrive))
      {  始发或终到标记=false;
      }
     if(qName.endsWith("车次"))
      {  trainMessages.append("</tr>");
      }
   }
   public void characters(char[] ch,int start,int length)
   {
     String text=new String(ch,start,length);
     text=text.trim();
     if(站名标记==true&&始发或终到标记==true&&text.length()>0)
       {  String str=text.trim();
          trainMessages.append("<td>"+str+"</td>");
       }
   }
}
