import java.awt.*;

public abstract class Car implements Movable {

    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private int xCoordinate; // initial x-coord
    private int yCoordinate; // initial y-coord


    public String getModelName(){
        return modelName;
    }

    public int getNrDoors(){
        return nrDoors;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public void setColor(Color clr){
	    color = clr;
    }

    public Color getColor(){
        return color;
    }
    //interface methods

    public void startEngine(){
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }
    
    public void move() {

    }

    public Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, int xCoordinate, int yCoordinate) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.color = color;
        this.modelName = modelName;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
}