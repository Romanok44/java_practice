import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1");
        String str = "I like Java!!!";
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("2) Последний символ строки: " + lastChar);
        if (str.endsWith("!!!")) {
            System.out.println("3) Строка заканчивается на '!!!'");
        } else {
            System.out.println("Строка не заканчивается на '!!!'");
        }
        if (str.startsWith("I like")) {
            System.out.println("4) Строка начинается с 'I like'");
        } else {
            System.out.println("Строка не начинается с 'I like'");
        }
        if (str.contains("Java")) {
            System.out.println("5) В строке содержится подстрока 'Java'");
        } else {
            System.out.println("В строке нет подстроки 'Java'");
        }
        int indexOfJava = str.indexOf("Java");
        System.out.println("6) Позиция подстроки 'Java' в исходной строке: " + indexOfJava);
        str = str.replaceAll("a", "o");
        System.out.println("7) Результат замены всех символов 'a' на 'o': " + str);
        str = str.toUpperCase();
        str = "I like Java";
        System.out.println("8) Приведённая строка к верхнему регистру: " + str);
        str = str.toLowerCase();
        System.out.println("9)Приведённая строка к нижнему регистру: " + str);
        System.out.println("10) Вырезать строку java: " + str.substring(indexOfJava,str.length()) + "\n");

        System.out.println("Задание 2");
        Person person1 = new Person("Roman", "Kvasnoy", "Borisovich");
        person1.callout();
        System.out.println();
        System.out.println("Задание 3");
        Address address = new Address("Russia,Moscow region,Moscow-prospekt Vernadskogo:78;A417");
        System.out.println(address);
        System.out.println();
        System.out.println("Задание 4");
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt[] shirts1 = new Shirt[11];
        for (int i = 0;i<11;i++){
            shirts1[i] = new Shirt(shirts[i]);
            System.out.println(shirts1[i]);
        }
        System.out.println();
        System.out.println("Задание 5");
        PhoneNumber phoneNumberRussian = new PhoneNumber("89175655655");
        PhoneNumber phoneNumber = new PhoneNumber("+104289652211");
        phoneNumberRussian.printNumber();
        phoneNumber.printNumber();
        System.out.println();
        System.out.println("Задание 6");
        System.out.println("Введите слова, разделённые пробелами");
        String textGot = scanner.nextLine();
        String[] words = textGot.split(" ");
        StringBuilder stringBuilder = Words.getLine(words);
        System.out.println(stringBuilder);
    }
}
