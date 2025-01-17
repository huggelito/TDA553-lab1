package src;
import java.awt.*;

public class Volvo240 extends Vehicle{

    public final static double trimFactor = 1.25;
    
    public Volvo240(double xCoordinate, double yCoordinate) {
        super(4, 100, Color.black, "Volvo240", xCoordinate, yCoordinate, true);
    }

    @Override
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    @Override
    public void incrementSpeed(double amount){
        if(getCurrentSpeed() < getEnginePower()) {
            setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount,getEnginePower()));
            }
        else { 
            setCurrentSpeed(getEnginePower());
        }
    }

    @Override
    public void decrementSpeed(double amount){
        if(getCurrentSpeed()>= 0){
        setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount,0));
        }
        else{
            setCurrentSpeed(0.1);
        }
    }   
}
