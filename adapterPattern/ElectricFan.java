package adapterPattern;

public class ElectricFan {
    public String turnOn(){
        return "Electric Fan turning on...";
    }

    public String turnOff(){
        return "Electric Fan turning off...";
    }

    public String increaseSpeed(){
        return "Increasing fan level...";
    }

    public String decreaseSpeed(){
        return "Decreasing fan level...";
    }
}