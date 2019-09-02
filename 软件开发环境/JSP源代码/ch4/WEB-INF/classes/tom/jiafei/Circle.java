package tom.jiafei;
public class Circle {
    double radius;
    public Circle() {
       radius=1;
    }
    public double getRadius() {
       return radius;
    }
    public void setRadius(double newRadius) {
       radius=newRadius;
       
    }
    public double circleArea() {
       return Math.PI*radius*radius;
    }
    public double circlLength() {
       return 2.0*Math.PI*radius;
    }
}
