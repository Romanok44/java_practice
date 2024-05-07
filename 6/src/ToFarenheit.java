import java.util.Scanner;

public class ToFarenheit implements Convertable {
    private int Farenheit;
    public ToFarenheit(){
        Scanner s = new Scanner(System.in);
        System.out.print("Temp in Celsius : ");
        Farenheit = s.nextInt();
    }

    public void convert(){
        double result = (((9/5)*Farenheit)+32);
        System.out.println(String.format("%d Celsius = %f Fahrenheit", Farenheit, result));
    }
}