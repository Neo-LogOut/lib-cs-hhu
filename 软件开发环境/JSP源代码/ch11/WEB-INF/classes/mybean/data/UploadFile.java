package mybean.data;
public class UploadFile{
   String savedFileName,backNews="";   
   public void setSavedFileName(String name){
      savedFileName=name;
   }
   public String getSavedFileName(){
      return savedFileName;
   }
   public String getBackNews(){
      return backNews;
   }
   public void setBackNews(String s){
      backNews=s;
   } 
}
