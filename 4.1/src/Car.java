public class Car extends Transport{
    double cost; //Full cost of trip
    double costPerKM = 2; //How much will cost riding through whole road
    double BillRoadCost = 3;//How much cost to pass through special post
    int countOfBill = 0; //Amount of passed special posts
    public Car(double distance, double speed) {
        super(distance,speed);
    }
    @Override //Calculate whole cost of the trip
    void CostOfRoad() {
        cost = (getDistance() * costPerKM) + (countOfBill * BillRoadCost);
        System.out.println("Поездка на машине стоит "+cost);
    }

    @Override
    void timeOfTrip() {
        System.out.println("Поездка на поезде длится "+ getDistance()/getSpeed() + " часов");
    }

    public void setCountOfBill(int countOfBill) {
        this.countOfBill = countOfBill;
    }

    public void setBillRoadCost(double billRoadCost) {
        BillRoadCost = billRoadCost;
    }

    public void setCostPerKM(double costPerKM) {
        this.costPerKM = costPerKM;
    }
}
