public class Point {
	private int x;
	private int y;
	public static int pointCount=0;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
		pointCount++;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
}
