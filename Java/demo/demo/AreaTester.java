public class AreaTester {
	public static void main(String args[]){
		Circle c = new Circle();
		c.radius = 50;
		Rectangle r = new Rectangle();
		r.width = 20;
		r.height = 30;
		System.out.println("Circle has area: "+ c.getArea());
		System.out.println("Rectangle has area: "+ r.getArea());
	}
}
