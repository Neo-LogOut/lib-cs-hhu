class Rectangle2 implements Shape2D{
	double width, height;
	public Rectangle2(double w, double h){
		width = w;
		height = h;
	}
	public double area(){
		return (width*height);
	}
}