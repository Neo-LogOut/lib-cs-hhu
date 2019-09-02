package myservlet.control;
import mybean.data.*;
import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HandleUpload extends HttpServlet{
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
      try{  
           Class.forName("com.mysql.jdbc.Driver");
      }
      catch(Exception e){} 
   }
   public  void  doPost(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException{
      HttpSession session=request.getSession(true);
      Login login=(Login)session.getAttribute("login"); 
      boolean ok=true; 
      if(login==null){
         ok=false; 
         response.sendRedirect("login.jsp"); 
      }
      if(ok==true){
         String logname=login.getLogname();
         uploadFileMethod(request,response,logname);   
      } 
   }
   public void uploadFileMethod(HttpServletRequest request,
                              HttpServletResponse response,String logname)
                              throws ServletException,IOException{
      UploadFile upFile=new UploadFile(); 
      
      String backNews="";
      upFile.setBackNews(backNews);
      upFile.setSavedFileName("暂时无名子");
      try{
           HttpSession session=request.getSession(true);
           session.setAttribute("upFile",upFile);
           String tempFileName=(String)session.getId();
           File f1=new File(tempFileName);
           FileOutputStream o=new FileOutputStream(f1);
           InputStream in=request.getInputStream();
           byte b[]=new byte[10000];
           int n;
           while( (n=in.read(b))!=-1)  
              o.write(b,0,n);  
           o.close();
           in.close();
           RandomAccessFile randomRead=new RandomAccessFile(f1,"r");
           String savedFileName=logname+".jpg"; 
           randomRead.seek(0); 
           long forthEndPosition=0;  
           int forth=1;
           while((n=randomRead.readByte())!=-1&&(forth<=4)){  
               if(n=='\n'){
                 forthEndPosition=randomRead.getFilePointer();
                 forth++;
               }
           }
           String  parentDir=f1.getAbsolutePath();
           parentDir=parentDir.substring(0,parentDir.lastIndexOf("bin")-1);
           String webDir = request.getContextPath();//获取当前Web服务目录的名称
           webDir = webDir.substring(1); //去掉名称前面的目录符号：/
           String saveDir = parentDir+"/webapps/"+webDir+"/image";
           File dir=new File(saveDir);
           dir.mkdir();
           File savingFile= new File(dir,savedFileName); 
           if(savingFile.exists()) 
               savingFile.delete();
           RandomAccessFile randomSave=new RandomAccessFile(savingFile,"rw"); 
           randomRead.seek(randomRead.length());
           long endPosition=randomRead.getFilePointer();
           long mark=endPosition;
           int j=1;
           while((mark>=0)&&(j<=6)){
               mark--;
               randomRead.seek(mark);
               n=randomRead.readByte();
               if(n=='\n'){
                  endPosition=randomRead.getFilePointer();
                  j++;
               }
           }
           randomRead.seek(forthEndPosition);
           long startPoint=randomRead.getFilePointer();
           while(startPoint<endPosition-1){
               n=randomRead.readByte();
               randomSave.write(n); 
               startPoint=randomRead.getFilePointer();
           }
           randomSave.close();
           randomRead.close();
           String uri="jdbc:mysql://127.0.0.1/MakeFriend";
           Connection con=DriverManager.getConnection(uri,"root","");
           Statement sql=con.createStatement();
           ResultSet rs=
           sql.executeQuery("SELECT * FROM member where logname='"+logname+"'"); 
           if(rs.next()){
            int mm=sql.executeUpdate
                 ("UPDATE member SET pic= '"+savedFileName+
                                         "' where logname = '"
                                         +logname+"'");
               if(mm!=0){
                 backNews="成功上传";
                 upFile.setSavedFileName(savedFileName);
                 upFile.setBackNews(backNews+": "+saveDir);
               }
           }
           con.close(); 
           f1.delete(); 
      }
      catch(Exception exp){
           backNews=""+exp;
           upFile.setBackNews(backNews);
      }
      RequestDispatcher dispatcher=
      request.getRequestDispatcher("showUploadMess.jsp");
      dispatcher.forward(request, response);
   }
   public  void  doGet(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException{
      doPost(request,response);
   }
}
