package mybean.data;
public class Example8_4_Bean {
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
   public void setFileContent(String str){
      fileContent=str;
   }
   public String getFileContent(){
      return fileContent; 
   }
   public void setFileLength(long len){
      fileLength=len; 
   }
   public long getFileLength(){
      return fileLength; 
   }
}
