package tom.jiafei;
public class Goods  {
   String name="ÎÞÃû";
   double price=0;
   public String getName() {
      return name;
   }
   public void setName(String newName){
      try{ 
        byte [] bb = newName.getBytes("iso-8859-1");
        newName = new String(bb);
      }
      catch(Exception exp){}
      name=newName;
   }
   public double getPrice() {
      return price;
   }
   public void setPrice(double newPrice) {
      price=newPrice;
   }
}

