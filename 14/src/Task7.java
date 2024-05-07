import java.util.Scanner;
import java.util.regex.*;

public class Task7 {
    public static void main(String[] args) {
        String text = "12/20-2004";
        Pattern p1 = Pattern.compile("\\d{2}\\S\\d{2}\\S\\d{4}");
        Matcher m1 = p1.matcher(text);
        boolean b = m1.matches();
        System.out.println(b);

        String regex = "abcdefghijklmnopqrstuv18340";
        String t2 = "abcdefghijklmnoprstuv18340";
        Pattern p2 = Pattern.compile(regex);
        Matcher m2 = p2.matcher(t2);
        boolean b2 = m2.matches();
        System.out.println(b2);

        System.out.println("Write your password: ");
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();

        Pattern symbCount = Pattern.compile("\\w{8,}");
        Pattern lowerEnglish = Pattern.compile("\\w[a-z]++");
        Pattern UpperEnglish = Pattern.compile("\\w[A-Z]++");
        Pattern number = Pattern.compile("\\d+");

        Matcher m3 = symbCount.matcher(pass);
        Matcher m4 = lowerEnglish.matcher(pass);
        Matcher m5 = UpperEnglish.matcher(pass);
        Matcher m6 = number.matcher(pass);

        boolean f1 = m3.find();
        boolean f2 = m4.find();
        boolean f3 = m5.find();
        boolean f4 = m6.find();

        System.out.println("Has 8 or more symbols? "+f1);
        System.out.println("Has lower case letters? "+f2);
        System.out.println("Has upper case letters? "+f3);
        System.out.println("Has digits? "+f4);
    }
}