package mybean.data;
public class Shiyan1_Bean {
   String filePath,fileName,fileContent;
   long fileLength;
   public void setFilePath(String str){
      filePath=str;
   }
   public String getFilePath(){
      return filePath; 
   }
   public void setFileName(String str){
      fileName=str;
   }
   public String getFileName(){
      return fileName; 
   }
   public void setFileLength(long len){
      fileLength=len; 
   }
   public long getFileLength(){
      return fileLength; 
   }
}
