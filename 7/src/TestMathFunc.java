import java.util.Scanner;

public class TestMathFunc {
    public static void main(String[] args) {
        MathFunc math = new MathFunc();
        System.out.print("Circle radius: ");
        Scanner s = new Scanner(System.in);
        double r = s.nextDouble();
        System.out.println("Circle area: " + math.CircleArea(r) + '\n');

        System.out.print("Enter numbers of a complex number: ");
        double a = s.nextDouble();
        double b = s.nextDouble();
        System.out.println("Module: " + math.ModuleComp(a, b) + '\n');

        System.out.print("Number and its pow: ");
        a = s.nextDouble();
        b = s.nextDouble();
        System.out.println(math.pow(a, b));
    }
}