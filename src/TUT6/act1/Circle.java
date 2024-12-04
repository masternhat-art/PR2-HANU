package TUT6.act1;

public class Circle extends Shape2D {
    private double radius = 1.0;
    public Circle(){}
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, Colors color, boolean filled, Point2D position){
        this.radius=radius;
        this.setColor(color);
        this.setFilled(filled);
        this.setPosition(position);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*getRadius()*getRadius();
    }
    public double getPara(){
        return Math.PI*2*getRadius();
    }
    public String toString(){
        return "getArea: " + getArea()+"getPara: " + getPara();
    }

}
