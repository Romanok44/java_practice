public abstract class Transport {
    protected double distance;
    protected double speed;
    abstract void CostOfRoad();
    abstract void timeOfTrip();
    public Transport(double distance, double speed) {
        this.distance = distance;
        this.speed = speed;
    }
    public double getDistance() {
        return distance;
    }
    public double getSpeed() {
        return speed;
    }
}