package adapterPattern;

public class TVAdapter implements  RemoteControlFunc {
    private TV tv;

    public TVAdapter(TV tv){
        this.tv = tv;
    }


    @Override
    public String powerOn() {
        return tv.switchOn();
    }

    @Override
    public String powerOff() {
        return tv.switchOff();
    }

    @Override
    public String pressPlusButton() {
        return tv.changeChannelUp();
    }

    @Override
    public String pressMinusButton() {
        return tv.changeChannelDown();
    }
}
