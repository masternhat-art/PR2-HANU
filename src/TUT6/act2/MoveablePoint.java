package TUT6.act2;

import TUT5.ex2.MovablePoint;

public class MoveablePoint extends Point implements Moveable {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MoveablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MoveablePoint(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MoveablePoint(){}

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        return new float[2];
    }
    public String toString(){
        return super.toString()+ ", "+ String.format("speed=(%.1f, %.1f)",xSpeed,ySpeed);
    }
    public MoveablePoint move(){
        setX(getX() + xSpeed); // Update x using getters and setters
        setY(getY() + ySpeed); // Update y using getters and setters
        return this;
    }
    @Override
    public void moveUp() {
        setY(getY()+1);
        System.out.println("Point moved up");
    }

    @Override
    public void moveDown() {
        setY(getY()-1);
        System.out.println("Point moved down");
    }

    @Override
    public void moveLeft() {
        setX(getX()-1);
        System.out.println("Point moved left");
    }

    @Override
    public void moveRight() {
        setX(getX()+1);
        System.out.println("Point moved right");
    }

}
