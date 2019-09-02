package mybean.data;
public class Register{
   String logname="",password="",email="", phone="", message="";
   String backNews; 
   public void setLogname(String name){
      logname=name;
   }
   public String getLogname(){
      return logname;
   }
   public void setPassword(String pw){
      password=pw;
   }
   public String getPassword(){
      return password;
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
   public String getBackNews(){
      return backNews;
   }
   public void setBackNews(String s){
      backNews=s;
   } 
}
