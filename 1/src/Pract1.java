import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Pract1 {
    public static void z3() {
        System.out.println("3:");
        Scanner str = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = str.nextInt();
        int[] mas = new int[n];
        System.out.println("Вводите числа массива");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            mas[i] = str.nextInt();
            sum += mas[i];
        }
        System.out.println();
        System.out.println(sum);
        System.out.println((float) sum / n);
        System.out.println();
    }

    public static void z4() {
        System.out.println("4:");
        Scanner str = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = str.nextInt();
        int[] mas = new int[n];
        System.out.println("Вводите числа массива");
        int i = 0;
        do {
            mas[i] = str.nextInt();
            i++;
        } while (i != n);
        int maxim = 0;
        int minim = 100000000;
        i = 0;
        while (i != n) {
            if (mas[i] > maxim) {
                maxim = mas[i];
            }
            if (mas[i] < minim) {
                minim = mas[i];
            }
            i++;
        }
        System.out.println("Max: " + maxim + '\n'
                + "Min: " + minim);
        System.out.println();
    }



    public static void z6() {
        System.out.println("6:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%.3f", (1.0/i)));
        }
        System.out.println();
    }

    public static void z7() {
        System.out.println("7:");
        Scanner str = new Scanner(System.in);
        System.out.println("Введите число, от которого считать факториал");
        int n = str.nextInt();
        BigInteger result = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            BigInteger mult = new BigInteger(Integer.toString(i));
            result = result.multiply(mult);
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        z3();
        z4();
        z6();
        z7();
    }
}