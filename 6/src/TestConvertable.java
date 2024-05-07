public class TestConvertable {
    public static void main(String[] args) {
        ToFarenheit far = new ToFarenheit();
        far.convert();
        ToKelvin kel = new ToKelvin();
        kel.convert();
    }
}