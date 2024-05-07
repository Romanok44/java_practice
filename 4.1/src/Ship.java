public class Ship extends Transport{
    double cost;
    double costByKm = 7;
    double costByDay = 3;
    int days = 1;//Counts how many days trip goes
    public Ship(double distance, double speed) {
        super(distance,speed);
    }

    @Override
    void CostOfRoad() {
        cost = getDistance()*costByKm + days*costByDay;
        System.out.println("Поездка на корабле стоит "+cost);
    }

    @Override
    void timeOfTrip() {
        System.out.println("Поездка на корабле длится "+ getDistance()/getSpeed() + " часов и "+ days + " дней");
    }

    public void setDays(int days) {
        this.days = days;
    }
}