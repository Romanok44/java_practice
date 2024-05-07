import java.util.Scanner;
public class HowMany
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);             // объявление сканнера
        System.out.println("Введите слова через пробел");
        String input_word = input.nextLine();               // nextLine() читает до конца текущей строки
        int count = 0;
        if(input_word.length() != 0){                       // Проверка, что первое слово было написано
            count++;
            for (int i = 0; i < input_word.length(); i++)
            {
                if(input_word.charAt(i) == ' ')
                {
                    count++;
                }
            }
        }
        System.out.println("Количество слов, которые вы ввели = " + count);
    }
}