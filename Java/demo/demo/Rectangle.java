class Rectangle {
	double width, height;
	public Rectangle(double w, double h){
		width = w;
		height = h;
	}
	
	public Rectangle(){
		width = 10.0;
		height = 5.0;
	}
	public double getArea(){
		return (width*height);
	}
}
