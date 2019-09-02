public class OverloadTest {
	public static void main(String[] args){
		System.out.printf("The maximum between %d and %d is %d\n", 1, 2, max(1,2));
		System.out.printf("Tne maximum between %f and %f is %f\n", 1.0, 2.0, max(1.0,2.0));
		System.out.printf("Tne maximum between %f£¬ %f and %f is %f\n", 1.0, 2.0, 3.0, max(1.0,2.0,3.0));
	}
	
	public static int max(int n1, int n2){
		if (n1>=n2) 
			return n1;
		else
			return n2;
	}
	
	public static double max(double n1, double n2){
		return (n1>=n2)?n1:n2;
	}
	
	public static double max(double n1, double n2, double n3){
		return max(max(n1,n2),n3);
	}
}
