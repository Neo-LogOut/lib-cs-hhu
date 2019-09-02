package mybean.data;
public class Password{
   String oldPassword,newPassword,backNews="";   
   public void setNewPassword(String pw){
      newPassword=pw;
   }
   public String getnewPassword(){
      return newPassword;
   }
   public void setOldPassword(String pw){
      oldPassword=pw;
   }
   public String getOldPassword(){
      return oldPassword;
   }
   public String getBackNews(){
      return backNews;
   }
   public void setBackNews(String s){
      backNews=s;
   } 
}
