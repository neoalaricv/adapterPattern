package adapterPattern;

public class ElectricFanAdapter implements RemoteControlFunc {
    private ElectricFan electricFan;

    public ElectricFanAdapter(ElectricFan electricFan){
        this.electricFan = electricFan;
    }

    @Override
    public String powerOn() {
        return electricFan.turnOn();
    }

    @Override
    public String powerOff() {
        return electricFan.turnOff();
    }

    @Override
    public String pressPlusButton() {
        return electricFan.increaseSpeed();
    }

    @Override
    public String pressMinusButton() {
        return electricFan.decreaseSpeed();
    }
}
