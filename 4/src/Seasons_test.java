public class Seasons_test {
    public static void print(Seasons season) {
        switch (season) {
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
        }


    }
    public static void printALL() {
        for (Seasons s : Seasons.values()) {
            System.out.println(s + " " + s.Get_temp() + " " + s.getDescription());
        }
    }

    public static void main(String[] args) {

        print(Seasons.SUMMER);
        printALL();


    }
}
