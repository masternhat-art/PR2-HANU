package TUT6.act1;

public class Rectangle extends Shape2D {
    private double length = 1.0;
    private double width = 1.0;
    public Rectangle(){}
    public Rectangle(double length, double width){
        this.length=length;
        this.width= width;
    }

    public Rectangle(double length, double width, Colors color, boolean filled){
        this.length=length;
        this.width= width;
        setColor(color);
        setFilled(filled);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return getLength()*getWidth();
    }

    public double getPara(){
        return 2*(getLength()+getWidth());
    }
}
