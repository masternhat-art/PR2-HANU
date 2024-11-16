package TUT5.ex2;

public class Demo {
    public static void main(String[] args) {
        Point p1= new Point();
        System.out.println(p1.toString());
        MovablePoint p2 = new MovablePoint(1.0f,1.0f,1.5f,1.5f);
        p2.move();
        System.out.println(p2.toString());
    }
}
