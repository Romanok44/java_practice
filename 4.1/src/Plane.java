public class Plane extends Transport{
    double cost;
    double costOfTakeoff,costOfLanding = 10; //How much cost takeoff and landing
    double costPerKm = 6;
    public Plane(double distance, double speed) {
        super(distance, speed);
    }

    @Override
    void CostOfRoad() {
        cost = getDistance()*costPerKm + costOfLanding + costOfTakeoff;
        System.out.println("Полет на самолете стоит "+cost);
    }

    @Override
    void timeOfTrip() {
        System.out.println("Полет на самолете длится "+ getDistance()/getSpeed() + " часов");
    }
}