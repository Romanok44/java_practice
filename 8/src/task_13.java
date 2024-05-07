import java.util.Scanner;
public class task_13 {
    public static void recursion() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // Базовый случай
        if (n > 0) {
            int m = input.nextInt();
            System.out.println(n);
            // Базовый случай
            if (m > 0) {
                // Шаг рекурсии / рекурсивное условие
                recursion();
            }
        }

    }

    public static void main(String[] args) {
        recursion();
    }
}
