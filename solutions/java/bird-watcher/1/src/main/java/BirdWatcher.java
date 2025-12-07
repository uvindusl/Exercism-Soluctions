
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        int lengthOfArray = birdsPerDay.length;
        return birdsPerDay[lengthOfArray-1];
    }

    public void incrementTodaysCount() {
        int lengthOfArray = birdsPerDay.length;
        birdsPerDay[lengthOfArray-1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        int count = 0;
        for (int i = 0; i < birdsPerDay.length; i ++){
            if (birdsPerDay[i] == 0){
                count ++;
            }
        }
        return count != 0;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++){
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int count = 0;
        for (int i = 0; i < birdsPerDay.length; i ++){
            if (birdsPerDay[i] >= 5){
                count ++;
            }
        }

        return count;
    }
}
