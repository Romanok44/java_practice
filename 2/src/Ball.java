public class Ball {
    private double x = 0.0;
    private double y = 0.0;
    public Ball(){};                            // Конструктор без параметра
    public Ball(double x, double y){            // Конструктор
        this.x = x;
        this.y = y;
    }
    public double getX() {                      // Получить координату x
        return x;
    }
    public double getY() {                      // Получить координату Y
        return y;
    }
    public void setX(double x) {                // Установить координату x
        this.x = x;
    }
    public void setY(double y) {                // Установить координату y
        this.y = y;
    }
    public void setXY(double x, double y)       // Установить координаты X и Y
    {
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp)        // Изменить положение мяча по координатам
    {
        x+=xDisp;
        y+=yDisp;
    }
    public String toString()                            // Все данные о мяче
    {
        return "Ball ("+this.x+", "+this.y+").";
    }
}