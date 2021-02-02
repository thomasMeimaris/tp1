package question3;

public class Phone extends Device implements MobileNetwork {
    private int batteryLevel;

    public Phone(){}

    public Phone(int p_width, int p_height) {
        this.setWidth(p_width);
        this.setHeight(p_height);
    }

    public Phone(String p_operatingSystem){
        this.setOperatingSystem(p_operatingSystem);
    }

    public boolean isTactile() {
        return true;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public String networkType() {
        return "4G";
    }
}
