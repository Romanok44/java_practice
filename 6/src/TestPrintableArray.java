public class TestPrintableArray {
    public static void main(String[] args) {
        Printable[] arr = new Printable[4];
        arr[0] = new Book("The Witcher","Andrzej Sapkowski");
        arr[1] = new Magazine("National Geographic");
        arr[2] = new Book("Song of Ice and Fire","George Martin");
        arr[3] = new Magazine("Vokrug Sveta");
        for (int i = 0; i < 4; i++){
            arr[i].Print();
        }
    }
}