public class Task2 {
    public static void main(String[] args) {
        Phone phone1 = new Phone(9999999, "Iphone", 500.);
        Phone phone2 = new Phone(8888888, "Samsung", 600.);
        Phone phone3 = new Phone(7777777, "Huawei", 700.);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println(phone1.receiveCall("Вова"));
        System.out.println(phone1.getNumber());
        System.out.println(phone2.receiveCall("Иван"));
        System.out.println(phone2.getNumber());
        System.out.println(phone3.receiveCall("Паша"));
        System.out.println(phone3.getNumber());
        System.out.println(phone1.receiveCall("Настя", 1000000));
        System.out.println(phone1.sendMessage(1234567, 7654321, 5553535));
    }
}