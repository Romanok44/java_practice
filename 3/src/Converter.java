import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Converter {
    private NumberFormat numForm = NumberFormat.getInstance();
    public void toDollar(float rub)
    {
        NumberFormat numForm = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(rub+" RUB = " + numForm.format(rub/96.22));
    }
    public void toEuro(float rub)
    {
        NumberFormat numForm = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println(rub+" RUB = " + numForm.format(rub/102.22));
    }
    public void toYen(float rub)
    {
        NumberFormat numForm = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        System.out.println(rub+" RUB = " + numForm.format(rub*1.53));
    }
    public void toUan(float rub)
    {
        NumberFormat numForm = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println(rub+" RUB = " + numForm.format(rub*0.075));
    }
    public void toRub(float rub)
    {
        NumberFormat numForm = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(numForm.format(rub) + " = " + rub*96.22 + " RUB");

        NumberFormat numForm1 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println(numForm1.format(rub)+ " + " + rub*102.22 + " RUB");

        NumberFormat numForm2 = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        System.out.println(numForm2.format(rub) + " = " + rub/1.53 + " RUB");

        NumberFormat numForm3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println(numForm3.format(rub) + " = " + rub/0.075 + " RUB");
    }
}