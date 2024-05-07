public class TestTransport {
    public static void main(String[] args) {
        Car c = new Car(100,50);
        Train t = new Train(2374,120);
        c.CostOfRoad();
        t.setNumOfStops(4);
        t.timeOfTrip();
        t.CostOfRoad();
    }
}