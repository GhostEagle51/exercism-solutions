public class CarsAssemble {
    public int producedPerHour = 221;

    public double productionRatePerHour(int speed) {
        if(speed >= 1 && speed <= 4){
            return (speed * producedPerHour);
        }else if (speed >= 5 && speed <= 8){
            return (speed * producedPerHour) * 0.90;
        }else if (speed == 9){
            return (speed * producedPerHour)*0.80;
        }else{
            return (speed * producedPerHour)*0.77;
        }
    }
    

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed)/60);
        
    }

}
