import java.util.Scanner;

public class ToKelvin implements Convertable{
    private int Kelvin;
    public ToKelvin(){
        Scanner s = new Scanner(System.in);
        System.out.print("Temp in Celsius : ");
        Kelvin = s.nextInt();
    }

    public void convert(){
        double result = (Kelvin + 273.15);
        System.out.println(String.format("%d Celsius = %f Kelvins", Kelvin, result));
    }
}