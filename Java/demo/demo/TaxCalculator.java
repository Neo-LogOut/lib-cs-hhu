public class TaxCalculator {
	public TaxCalculator() {
		// TODO Auto-generated constructor stub
	}
	  public static void main(String[] args) 
	  {
	   double income = 1197.64;
	   double taxRate = 0.06;
	   double tax = income * taxRate;  // tax = 71.8584
	   double trueTax = ((int)((tax + 0.005) * 100)) / 100.0;
	   System.out.println( "tax = " + trueTax);  // tax = 71.86
	}
}