public class CircumferenceTester {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.radius = 50;
		Circle c2 = new Circle();
		c2.radius = 10;
		double circum1 = c1.circumference();
		double circum2 = c2.circumference();
		System.out.println("Circle 1 has circumference: "+circum1);
		System.out.println("Circle 2 has circumference: "+circum2);
	}
}
