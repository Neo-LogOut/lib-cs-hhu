package mybean.data;
public class MemberInform{
   String logname,email,phone,message,pic,backNews; 
   public void setLogname(String name){
      logname=name;
   }
   public String getLogname(){
      return logname;
   }
   public void setEmail(String em){
      email=em;
   }
   public String getEmail(){
      return email;
   }
   public void setPhone(String ph){
      phone=ph;
   }
   public String getPhone(){
      return phone;
   }
   public String getMessage(){
      return message;
   } 
   public void setMessage(String m){
      message=m;
   } 
   public String getPic(){
      return pic;
   }
   public void setPic(String s){
      pic=s;
   } 
   public String getBackNews(){
      return backNews;
   }
   public void setBackNews(String s){
      backNews=s;
   } 
}
