package adapterPattern;

public class AirPodsAdapter implements RemoteControlFunc {
    private AirPods airPods;

    public AirPodsAdapter(AirPods airPods){
        this.airPods = airPods;
    }

    @Override
    public String powerOn() {
        return airPods.airPodsOn();
    }

    @Override
    public String powerOff() {
        return airPods.airPodsOff();
    }

    @Override
    public String pressPlusButton() {
        return airPods.volumeUp();
    }

    @Override
    public String pressMinusButton() {
        return airPods.volumeDown();
    }
}
