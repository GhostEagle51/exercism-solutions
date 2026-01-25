public class JedliksToyCar {
    
    private int metersDriven = 0;
    private int batteryPercentage = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + metersDriven + " meters";
    }

    public String batteryDisplay() {
        if (batteryPercentage == 0) {
            return "Battery empty";
        }
        return "Battery at " + batteryPercentage + "%";
    }

    public void drive() {
        if (batteryPercentage == 0) {
            return; // hareket edemez
        }
        metersDriven += 20;
        batteryPercentage -= 1;
    }
}
