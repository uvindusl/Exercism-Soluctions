public class JedliksToyCar {
    private int distance;
    private int battery = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", distance);
    }

    public String batteryDisplay() {
        if (this.battery == 0){
            return new String("Battery empty");
        }else {
            return String.format("Battery at %d%%", battery);
        }
    }

    public void drive() {
        if(this.battery != 0){
            this.distance += 20;
            this.battery --;
        }
    }
}
