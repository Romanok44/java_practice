public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);      //  Создание объекта класса Мяч с помощью конструктора с параметрами
        System.out.println(b1);                  // Вывод информации о мяче
        b1.move(50,35);              // Изменим координаты x и y мяча на соответствующие значения
        System.out.println(b1);                  // Вывод информации о мяче, где видно, что положение мяча изменилось
    }
}