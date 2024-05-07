public class Circle extends Shape {
    String name = "Circle";
    int radius;
    public Circle(int radius, double posX, double posY,int Red,int Green,int Blue) {
        super(posX, posY,Red,Green,Blue);
        this.radius = radius;
    }
    @Override
    public String getType() {
        return name;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }
    @Override
    public double getArea() {
        return Math.pow(radius,2)*Math.PI;
    }

    @Override
    public String toString() {
        return (super.toString() + getType() + "\nIt's area is " + getArea() + "\nIt's perimeter is " + getPerimeter());
    }

    public int getRadius() {
        return radius;
    }
}