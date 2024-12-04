package TUT6.act1;

public class Point2D {
    private double x = 0.0;
    private double y = 0.0;
    public Point2D(){}
    public Point2D(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDistance(double x, double y ){
        double deltaX = this.x - x;
        double deltaY = this.y - y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double getDistance(Point2D point){
        double deltaX = this.x - point.getX();
        double deltaY = this.y - point.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

}
