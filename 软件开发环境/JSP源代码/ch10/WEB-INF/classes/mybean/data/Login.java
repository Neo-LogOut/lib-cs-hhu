package mybean.data;
import java.util.*;
public class Login {
   String logname="",
          backNews="未登录";
   LinkedList<String> car; //用户的购物车
   public Login() {
      car = new LinkedList<String>();
   }
   public void setLogname(String logname){  
      this.logname = logname;
   }
   public String getLogname(){
      return logname;
   }
   public void setBackNews(String s) {
      backNews = s;
   } 
   public String getBackNews(){
      return backNews;
   }
   public LinkedList<String> getCar() { 
      return car;
   }
}
