public class Train extends Transport{
    double cost;
    double costPerKm = 5;
    double costOfStop = 2;
    double timeOfStops = 0.2; //Hours
    int numOfStops = 0;
    public Train(double distance, double speed) {
        super(distance,speed);
    }

    @Override
    void CostOfRoad() {
        cost = getDistance()*costPerKm + costOfStop*numOfStops;
        System.out.println("Поездка на поезде стоит "+cost);
    }

    @Override
    void timeOfTrip() {
        System.out.println("Поездка на поезде длится  "+ (getDistance()/getSpeed()+timeOfStops*numOfStops) + " часов");
    }

    public void setNumOfStops(int numOfStops) {
        this.numOfStops = numOfStops;
    }
}