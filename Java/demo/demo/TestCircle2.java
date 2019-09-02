class Circle2{
	public double radius;
	
    Circle2(){
    	radius = 10.0;
    }
	Circle2(double rads){
		radius = rads;
	}
	
	public double circumference(){
		return 2*Math.PI*radius;
	}
	
	public double getArea(){
		return radius*radius*Math.PI;		
	}
	
	public void enlarge(double factor){
		this.radius = radius*factor;
	}
	
	public boolean fitInside(Rectangle r){
		return (2*radius<=r.width) && (2*radius <= r.height);
	}
}

public class TestCircle2{
	public static void main(String[] args){
		Circle2 c2 = new Circle2(30.0);
		System.out.println("The area of cirle is: "+c2.getArea());
	}
}
