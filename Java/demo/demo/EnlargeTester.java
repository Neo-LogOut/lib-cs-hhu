public class EnlargeTester {
	public static void main(String args[]){
		Circle c1 = new Circle();
		c1.radius = 50;
		Circle c2 = new Circle();
		c2.radius = 10;
		System.out.println("The circumference of circle 1 is: "+c1.circumference());
		System.out.println("The circumference of circle 2 is: "+c2.circumference());
		c2.enlarge(4.0);
		System.out.println("The circumference of enlarged circle c2 is: "+c2.circumference());
	}
}
