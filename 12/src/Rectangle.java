public class Rectangle extends Shape {
    String name = "Rectangle";
    int a;
    int b;
    public Rectangle(int a, int b, double posX, double posY,int Red,int Green,int Blue) {
        super(posX,posY,Red,Green,Blue);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public String getType() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString() + getType() + "\nIt's area is " + getArea()+"\nit's perimeter "+getPerimeter();
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}