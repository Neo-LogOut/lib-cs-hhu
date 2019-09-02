package red.star;
public class ComputerBean {
   double numberOne,numberTwo,result;
   String operator="+";
   public void setNumberOne(double n) {
      numberOne=n;
   }
   public double getNumberOne() {
      return numberOne; 
   }
   public void setNumberTwo(double n) {
      numberTwo=n;
   }
   public double getNumberTwo() {
      return numberTwo; 
   }
   public void setOperator(String s) {
      operator=s.trim();;
   }
   public String getOperator() {
      return operator;
   }
   public double getResult() {
      if(operator.equals("+"))
          result=numberOne+numberTwo;
      else if(operator.equals("-"))
          result=numberOne-numberTwo;
      else if(operator.equals("*"))
          result=numberOne*numberTwo;
      else if(operator.equals("/"))
          result=numberOne/numberTwo;
      return result; 
   }
}
