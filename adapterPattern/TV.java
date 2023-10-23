package adapterPattern;

public class TV {
    public String switchOn(){
        return "TV turning on...";
    }

    public String switchOff(){
        return "TV turning off...";

    }

    public String changeChannelUp(){
        return "Next";
    }

    public String changeChannelDown(){
        return "Previous";
    }
}