package adapterPattern;

public class ApplianceApp {

    public static void main(String[] args){

        TV tv = new TV();
        RemoteControlFunc tvRc = new TVAdapter(tv);

        ElectricFan electricFan = new ElectricFan();
        RemoteControlFunc electricFanRc = new ElectricFanAdapter(electricFan);

        AirPods airPods = new AirPods();
        RemoteControlFunc airPodsRc = new AirPodsAdapter(airPods);

        //turn on the appliances
        System.out.println(tvRc.powerOn());
        System.out.println(electricFanRc.powerOn());
        System.out.println(airPodsRc.powerOn());

        System.out.println();

        //press button up
        System.out.println(tvRc.pressPlusButton());
        System.out.println(electricFanRc.pressPlusButton());
        System.out.println(airPodsRc.pressPlusButton());

    }
}
