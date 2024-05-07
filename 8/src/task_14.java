import java.util.Scanner;
public class task_14 {
    public static void recursion(int n) {
        if (n >= 10) {
            recursion(n / 10);
        }
        System.out.print(n % 10 + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        recursion(n);

    }
}
