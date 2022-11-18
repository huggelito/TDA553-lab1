package src;
import static java.lang.Math.*;

public class HasPosition {
    
    private double xCoordinate; // initial x-coord
    private double yCoordinate; // initial y-coord
    private double dX;  // delta x
    private double dY;  // delta y
    private double currentDirectionRadian;  // which way the car is heading

    public HasPosition() {
        this.xCoordinate = 5;
        this.yCoordinate = 5;
        this.dX = 0;
        this.dY = 0;
        this.currentDirectionRadian = PI/2;
    }
    public void updateCoordinate(){
        
        this.xCoordinate += this.dX;
        this.yCoordinate += this.dY;
    }

    public void setCurrentDirectionRadian(double leftOrRight) {
        this.currentDirectionRadian += (PI/180) * leftOrRight;
    }
    
    public void setCurrentDirection(double currentSpeed) {

        this.dX = cos(currentDirectionRadian) * currentSpeed;
        this.dY = sin(currentDirectionRadian) * currentSpeed;
    }

    public double getCurrentDirectionRadian(){
        return this.currentDirectionRadian;
    }
     
    public double getX() {
        return xCoordinate;
    }

    public double getY() {
        return yCoordinate;
    }

    public double currentDX() {
        return dX;
    }

    public double currentDY() {
        return dY;
    }

}