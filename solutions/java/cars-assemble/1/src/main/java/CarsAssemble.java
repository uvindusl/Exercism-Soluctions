public class CarsAssemble {

    final int carProducePerhour = 221;

    public double productionRatePerHour(int speed) {
        double prPerHour;
        if (speed == 10) {
            prPerHour = speed * (carProducePerhour * 0.77);
        }
        else if (speed == 9) {
            prPerHour = speed * (carProducePerhour * 0.8); 
        } else if (speed >= 5) {
            prPerHour = speed * (carProducePerhour * 0.9);
        } else{
            prPerHour = (double) speed * carProducePerhour;
        }
        return prPerHour;
    }

    public int workingItemsPerMinute(int speed) {
        double itemPerHour = productionRatePerHour(speed);
        int itemPerMinute = (int) itemPerHour / 60;
        return itemPerMinute;
    }
}
