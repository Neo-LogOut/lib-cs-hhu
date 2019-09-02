class Circle1 implements Shape2D{
	double radius;
	double area;
	public Circle1(double r){
		radius = r;
	}
	public double area(){
		area = pi*radius*radius;
		return area;
	}
}