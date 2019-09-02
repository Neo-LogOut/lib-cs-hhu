//import java.math.*;
class Circle{
	public double radius;
	
    @Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	Circle (){
//    	radius = 10.0;
    }
	Circle (double rads){
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
