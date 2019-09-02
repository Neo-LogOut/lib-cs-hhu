public class AmbiguousOverloadTest {
	public static void main(String[] args) {
		System.out.println(max(1,2));
	}
	public static double max(double n1, int n2){
		if(n1>=n2)
			return n1;
		else
			return n2;
	}
	public static double max(int n1, double n2){
		if (n1>=n2)
			return n1;
		else
			return n2;
	}
}
