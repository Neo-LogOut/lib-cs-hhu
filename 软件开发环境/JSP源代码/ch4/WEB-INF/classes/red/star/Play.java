package red.star;
import java.io.*; 
public class Play {
   int imageNumber=0,max;
   String pictureName[],playImage;
   String webDir="";        //web服务目录的名字
   String tomcatDir;        //tomcat的安装目录
   public Play() {
      File f= new File(""); //该文件认为在Tomcat引擎启动的目录中，即bin目录中
      String path = f.getAbsolutePath();
      int index = path.indexOf("bin");
      tomcatDir = path.substring(0,index); 
     
  }
  public void setWebDir(String s) {
     webDir =s;
     if(pictureName==null) {
       File dirImage=new File(tomcatDir+"/webapps/"+webDir+"/image"); 
       pictureName=dirImage.list();
     }
     if(pictureName!=null)
        max=pictureName.length;
  }
  public void setImageNumber(int n){
      if(n<0)
        n=max-1;
      if(n==max)
        n=0; 
      imageNumber=n;
   }
   public int getImageNumber() {
      return imageNumber;
   }
   public String getPlayImage() {
      if(pictureName!=null)
        playImage=pictureName[imageNumber]; 
      return playImage; 
   } 
}
