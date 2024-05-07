import java.util.Scanner;
public class task_15 {
    public static void recursion(int n) {
        System.out.print(n % 10 + " ");
        if (n >= 10) {
            recursion(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        recursion(n);

    }
}