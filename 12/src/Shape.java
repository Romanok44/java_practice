public class Shape {
    public String getType()
    {
        return "Shape";
    }
    public double getPerimeter()
    {
        return 0;
    }
    public double getArea()
    {
        return 0;
    }
    public double posX;
    public double posY;
    int Red;
    int Green;
    int Blue;
    public Shape(double posX, double posY, int Red,int Green,int Blue) {
        this.posX = posX;
        this.posY = posY;
        this.Red = Red;
        this.Green = Green;
        this.Blue = Blue;
    }
    @Override
    public String toString() {
        return "Your shape is ";
    }
    public int getColorR(){
        return Red;
    }
    public int getColorG(){
        return Green;
    }
    public int getColorB(){
        return Blue;
    }
}
