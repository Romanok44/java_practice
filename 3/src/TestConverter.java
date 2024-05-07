import java.util.Scanner;

public class TestConverter {
    public static void main(String[] args) {
        Converter conv = new Converter();
        Scanner sc = new Scanner(System.in);
        System.out.println("You want convert (1)'to Rubles' or (2)'from Rubles'?");
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("How much money do you have?");
                int trub = sc.nextInt();
                if(trub >= 0)
                {
                    conv.toRub(trub);
                }
                else{
                    System.out.println("Incorrect input!");
                }

                break;
            case 2:
                System.out.println("How much money do you have?");
                int frub = sc.nextInt();
                if(frub >= 0)
                {
                    System.out.println("Choose currency from US, EU, JP, CH");
                    String name = sc.next();
                    switch (name)
                    {
                        case "EU":
                            conv.toEuro(frub);
                            break;
                        case "US":
                            conv.toDollar(frub);
                            break;
                        case "JP":
                            conv.toYen(frub);
                            break;
                        case "CH":
                            conv.toUan(frub);
                            break;
                        default:
                            System.out.println("Incorrect option!");
                            break;
                    }
                }
                break;
            default:
                System.out.println("Incorrect option!");
                break;
        }
    }
}